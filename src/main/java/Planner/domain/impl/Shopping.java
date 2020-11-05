package Planner.domain.impl;

import Planner.domain.Tasks;

public class Shopping extends Tasks {
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

    @Override
    public int reusable() {
        System.out.println("The task is reusable!");
        return super.reusable();
    }
}
