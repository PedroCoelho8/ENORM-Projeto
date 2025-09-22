package metamodeloEnorm.design;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

/**
 * External Java action to generate PlantUML diagrams from Sirius models.
 * This class allows generating UML diagrams from selected elements
 * in Sirius editors, creating alternative visual representations of the same model.
 * 
 * @author Pedro
 */
public class GeneratePlantUML implements IExternalJavaAction {
    
	
	
    // Configuration constants
    private static final String LOG_FILE = System.getProperty("user.home") + File.separator + "sirius_plantuml_debug.log";
    private static final String DIAGRAMS_FOLDER = "diagrams";
    private static final String LOG_PREFIX = "[PlantUML] ";
    
    // Track processed objects to avoid infinite cycles
    private Set<EObject> processedObjects = new HashSet<>();
    // Track declared classes to avoid duplicates
    private Set<String> declaredClasses = new HashSet<>();
    
    /**
     * Logs a message to console and optionally to file.
     * Error messages are highlighted in red in the console.
     * 
     * @param message Message to be logged
     * @param isError Defines if the message is an error
     */
    private void log(String message, boolean isError) {
        String fullMessage = LOG_PREFIX + message;
        System.out.println("DEBUG: entrou no método");
        // Log to Eclipse console
        if (isError) {
            System.err.println(fullMessage);  // Will appear in red in console
        } else {
            System.out.println(fullMessage);
        }
        
        // Write to file for later reference
        try (PrintWriter writer = new PrintWriter(new FileWriter(LOG_FILE, true))) {
            writer.println(new Date() + ": " + message);
        } catch (IOException e) {
            System.err.println(LOG_PREFIX + "Failed to write to log file: " + e.getMessage());
        }
    }
    
    // Convenience methods for logging
    private void log(String message) {
        log(message, false);
    }
    
    private void logError(String message) {
        log(message, true);
    }

    @Override
    public boolean canExecute(Collection<? extends EObject> selections) {
        boolean result = !selections.isEmpty();
        log("canExecute: " + (result ? "YES" : "NO") + " (" + selections.size() + " elements)");
        return result;
    }

    @Override
    public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
        log("==============================================");
        log("STARTING PLANTUML DIAGRAM GENERATION");
        log("==============================================");
        
        try {
            // Reset tracking collections
            processedObjects = new HashSet<>();
            declaredClasses = new HashSet<>();
            
            // Check if there are selected elements
            if (selections.isEmpty()) {
                logError("No elements selected. Aborting execution.");
                return;
            }

            // Get selected root element
            EObject selectedElement = selections.iterator().next();
            if (selectedElement == null) {
                logError("Selected element is null. Aborting execution.");
                return;
            }
            
            log("Root element: " + getElementName(selectedElement) + " [" + selectedElement.getClass().getSimpleName() + "]");
            
            // Generate PlantUML content
            String plantUmlContent = generatePlantUMLContent(selectedElement);
            log("PlantUML diagram generated with " + plantUmlContent.split("\n").length + " lines");
            
            // Save to file
            IFile plantUmlFile = createPlantUMLFile(plantUmlContent);
            
            if (plantUmlFile != null && plantUmlFile.exists()) {
                log("File saved: " + plantUmlFile.getName() + " in " + plantUmlFile.getParent().getFullPath());
                openFileInEditor(plantUmlFile);
            } else {
                logError("Failed to create PlantUML file");
            }

        } catch (Exception e) {
            logError("ERROR: " + e.getMessage());
            e.printStackTrace();
        }
        
        log("==============================================");
        log("DIAGRAM GENERATION COMPLETED");
        log("==============================================");
    }
    
    /**
     * Generates PlantUML content from the selected element.
     * Builds a UML class diagram with attributes and relationships.
     * 
     * @param rootElement The root element from which to generate the diagram
     * @return The PlantUML content as string
     */
    private String generatePlantUMLContent(EObject rootElement) {
        StringBuilder sb = new StringBuilder();
        
        // PlantUML diagram header
        sb.append("@startuml\n");
        sb.append("skinparam shadowing false\n");
        sb.append("skinparam classAttributeIconSize 0\n");
        sb.append("skinparam classFontStyle bold\n");
        sb.append("skinparam classFontSize 14\n\n");
        
        // Diagram title
        sb.append("title Class Diagram: ").append(getElementName(rootElement)).append("\n\n");
        
        // Generate the diagram recursively
        generateClassDiagram(rootElement, sb, 0);
        
        // Close diagram
        sb.append("\n@enduml");
        
        return sb.toString();
    }
    
    /**
     * Generates the class diagram recursively for an element and its relationships.
     * 
     * @param element Current element
     * @param sb StringBuilder to add diagram content
     * @param depth Current recursion depth to avoid infinite recursion
     */
    private void generateClassDiagram(EObject element, StringBuilder sb, int depth) {
        // Avoid infinite processing
        if (depth > 8 || processedObjects.contains(element)) {
            return;
        }
        
        // Mark as processed
        processedObjects.add(element);
        
        // Generate class for current element
        String className = getClassName(element);
        
        // Only declare the class if it hasn't been declared yet
        if (!declaredClasses.contains(className)) {
            declaredClasses.add(className);
            
            sb.append("class ").append(className).append(" {\n");
            
            // Add attributes of the element
            for (EAttribute attribute : element.eClass().getEAllAttributes()) {
                if (element.eIsSet(attribute)) {
                    Object value = element.eGet(attribute);
                    if (value != null) {
                        sb.append("  +").append(attribute.getName()).append(": ");
                        // Limit value size to not pollute the diagram
                        String valueStr = value.toString();
                        if (valueStr.length() > 30) {
                            valueStr = valueStr.substring(0, 27) + "...";
                        }
                        sb.append(valueStr).append("\n");
                    }
                }
            }
            
            sb.append("}\n\n");
        }
        
        // Process relationships and related objects
        for (EReference reference : element.eClass().getEAllReferences()) {
            if (element.eIsSet(reference)) {
                Object target = element.eGet(reference);
                
                if (reference.isMany()) {
                    @SuppressWarnings("unchecked")
                    EList<EObject> elements = (EList<EObject>) target;
                    for (EObject targetElement : elements) {
                        String targetClassName = getClassName(targetElement);
                        String multiplicity = reference.isRequired() ? "1.." : "0..";
                        
                        sb.append(className)
                          .append(" --> ")
                          .append("\"").append(multiplicity).append("\" ")
                          .append(targetClassName)
                          .append(" : ")
                          .append(reference.getName())
                          .append("\n");
                        
                        // Process each target element
                        if (!processedObjects.contains(targetElement)) {
                            generateClassDiagram(targetElement, sb, depth + 1);
                        }
                    }
                } else if (target != null) {
                    EObject targetObject = (EObject) target;
                    String targetClassName = getClassName(targetObject);
                    String multiplicity = reference.isRequired() ? "1" : "0..1";
                    
                    // Add relationship
                    sb.append(className)
                      .append(" --> ")
                      .append("\"").append(multiplicity).append("\" ")
                      .append(targetClassName)
                      .append(" : ")
                      .append(reference.getName())
                      .append("\n");
                    
                    // Process target object
                    if (!processedObjects.contains(targetObject)) {
                        generateClassDiagram(targetObject, sb, depth + 1);
                    }
                }
            }
        }
    }
    
    /**
     * Get a unique class name from an EObject based on its name/identifier.
     * If the element has a name, use "Type_Name", otherwise use just the type.
     * 
     * @param element The EMF element
     * @return Unique class name
     */
    private String getClassName(EObject element) {
        String baseType = element.getClass().getSimpleName().replace("Impl", "");
        String elementName = getElementName(element);
        
        // If element has a meaningful name different from the class type, create unique class name
        if (!elementName.equals(baseType) && !elementName.trim().isEmpty()) {
            // Clean the name to be valid for PlantUML
            String cleanName = elementName.replaceAll("[^a-zA-Z0-9_]", "_");
            return baseType + "_" + cleanName;
        }
        
        return baseType;
    }
    
    /**
     * Tries to get a meaningful name for the element.
     * Looks for common name attributes like "name", "id", etc.
     * 
     * @param element The EMF element
     * @return A meaningful name or the simplified class name
     */
    private String getElementName(EObject element) {
        // Check common name attributes
        for (String nameAttr : new String[]{"name", "id", "label", "title", "identifier"}) {
            EStructuralFeature feature = element.eClass().getEStructuralFeature(nameAttr);
            if (feature instanceof EAttribute && element.eIsSet(feature)) {
                Object value = element.eGet(feature);
                if (value != null && !value.toString().trim().isEmpty()) {
                    return value.toString();
                }
            }
        }
        
        // Use class name as fallback
        return getClassName(element);
    }
    
    /**
     * Creates a PlantUML file in the 'diagrams' directory of the project.
     * 
     * @param content The PlantUML content to be saved
     * @return The created IFile object or null on error
     */
    private IFile createPlantUMLFile(String content) {
        try {
            // Find an open project
            IProject project = findOpenProject();
            if (project == null) {
                logError("No open project available");
                return null;
            }
            
            log("Using project: " + project.getName());
            
            // Create diagrams directory if it doesn't exist
            IPath diagramDirPath = new Path(DIAGRAMS_FOLDER);
            if (!project.getFolder(diagramDirPath).exists()) {
                log("Creating directory: " + diagramDirPath.toString());
                project.getFolder(diagramDirPath).create(true, true, null);
            }
            
            // Create unique filename based on date and time
            String fileName = "diagram_" + System.currentTimeMillis() + ".plantuml";
            IPath filePath = diagramDirPath.append(fileName);
            IFile file = project.getFile(filePath);
            
            // Save content
            log("Creating file: " + file.getFullPath());
            file.create(new java.io.ByteArrayInputStream(content.getBytes()), true, null);
            
            // Check if file was created
            if (!file.exists()) {
                logError("File was not created correctly");
                return null;
            }
            
            log("File created successfully");
            return file;
        } catch (CoreException e) {
            logError("Error creating file: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    
    /**
     * Finds an open project in the workspace.
     * 
     * @return The first open project or null if none found
     */
    private IProject findOpenProject() {
        IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
        for (IProject project : projects) {
            if (project.isOpen()) {
                return project;
            }
        }
        return null;
    }
    
    /**
     * Opens the created file in the default editor.
     * 
     * @param file The file to be opened
     */
    private void openFileInEditor(IFile file) {
        try {
            IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
            if (page == null) {
                logError("Could not get workbench page");
                return;
            }
            
            IDE.openEditor(page, file);
            log("File opened in editor: " + file.getName());
        } catch (Exception e) {
            logError("Error opening editor: " + e.getMessage());
        }
    }
    
}