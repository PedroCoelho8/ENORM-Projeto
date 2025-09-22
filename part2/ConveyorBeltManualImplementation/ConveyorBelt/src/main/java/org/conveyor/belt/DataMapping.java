package org.conveyor.belt;

public class DataMapping {
    private Datacore datacore;

    public DataMapping(Datacore datacore) {
        this.datacore = datacore;
    }

    public void storeData(Integer data){
        datacore.addItem(data);
    }

    public int getCount(){
        return this.datacore.getList().size();
    }
}
