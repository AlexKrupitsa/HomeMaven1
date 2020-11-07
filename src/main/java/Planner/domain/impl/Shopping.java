package Planner.domain.impl;

import Planner.domain.Task;

public class Shopping extends Task {
    private String categoryShopping;
    public Shopping(String name, int priority, String categoryShopping){
        super(name, priority);
        this.categoryShopping = categoryShopping;
    }

    @Override
    public String toString() {
        return super.toString()+
        ", category=" + categoryShopping;
    }

}
