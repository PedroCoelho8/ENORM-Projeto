# ENORM-Projeto — DSL for Device-Oriented Software Service (DoSS)  
Master in Informatics Engineering, 2024/2025

## Contexto

Este repositório corresponde ao Projeto ENORM (Parte 1: Modelação) da unidade curricular de Engenharia de Software, no contexto do desenvolvimento de uma *Software Product Line* para ambientes industriais. O objetivo é a conceção de uma **Linguagem Específica de Domínio (DSL)** — a DoSS — para modelar e automatizar serviços de software orientados a dispositivos no shop floor industrial.

## Objetivos

- Desenvolver uma DSL (DoSS) para descrever cenários de integração e automação de dispositivos industriais (sensores, atuadores, etc).
- Permitir que especialistas do domínio especifiquem cenários, lógica de processamento e ações sem recorrer a programação tradicional.
- Facilitar a geração automática de código que implemente os serviços modelados.
- Suportar tanto sintaxe textual como gráfica.
- Aplicar princípios de *Domain Engineering* e *Application Engineering*.

## Características da DSL (DoSS)

- **Simples e Intuitiva:** Focada na facilidade de utilização por experts do domínio.
- **Poderosa e Focada:** Suporta múltiplos dispositivos, definição de interfaces, condições, ações, agregações, notificações, etc.
- **Flexível e Extensível:** Permite integração de novos dispositivos e lógica customizada.
- **Fortemente Tipada:** Minimiza erros de especificação.

## Processo e Metodologia

O projeto segue um ciclo de desenvolvimento em duas vertentes:
- **Domain Engineering:** Definição do metamodelo, constraints, transformações, e projecções (visualizações) para a DSL.
- **Application Engineering:** Criação de modelos de cenários reais com a DSL e demonstração do seu uso.

### Atividades Principais

1. **Setup e Seleção de Ferramentas:**  
   Cada membro usa uma ferramenta distinta (No meu caso: Sirius) para implementar a DSL.
2. **Levantamento de Conhecimento:**  
   Estudo do domínio, análise de trabalhos relacionados e definição de modelos para os cenários fornecidos.
3. **Conceção do Metamodelo:**  
   Union de modelos, definição formal (ex: diagramas de classes), constraints (OCL ou pseudo-código), refatorações.
4. **Projeções e Visualizações:**  
   Geração automática de diagramas (PlantUML/Graphviz) e projeções textuais dos modelos.
5. **Modelação de Cenários Reais:**  
   Aplicação da DSL aos cenários:  
   - *Cenário 1:* Tapete transportador com sensores.  
   - *Cenário 2:* Depósito de resíduos com luzes e buzina.  
   - *Cenário 3:* Gestão de humidade com sensores e atuadores.
6. **Documentação Markdown:**  
   Relatório detalhado, com secções de equipa e individuais, integrando todos os artefactos.

## Organização do Repositório

- `team/` — Artefactos e documentação de equipa (modelos, metamodelo, visualizações, etc).
- `individual/` — Secções individuais (setup, implementação por ferramenta, etc).
- `scenarios/` — Modelos dos cenários e suas projeções.
- `docs/` — Relatório principal em Markdown e anexos.
- `README.md` — Este ficheiro.

## Ferramentas e Tecnologias

- **MPS (JetBrains), Eclipse Xtext, Eclipse Sirius** — Ferramentas para DSLs.
- **Eclipse Modeling Framework (EMF), PlantUML, Graphviz** — Metamodelação e visualização.
- **Markdown (docs e relatórios), GitHub** — Relato e versionamento.

---

> **ENORM — Engenharia de Software, MIEI ISEP 2024/2025**  
