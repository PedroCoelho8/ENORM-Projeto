package org.conveyor.belt;

import java.util.ArrayList;
import java.util.List;

public class Datacore {
    private List<Integer> list;

    public Datacore() {
        this.list = new ArrayList<>();
    }

    public void addItem(Integer item){
        this.list.add(item);
    }
    public List<Integer> getList() {
        return this.list;
    }

}
