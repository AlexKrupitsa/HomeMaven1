package Planner.domain.impl;

import Planner.domain.Tasks;

public class Breakfast extends Tasks {

    private String categoryFood;

    public Breakfast(String name, int priority, String categoryFood){
        super(name, priority);
        this.categoryFood = categoryFood;
    }

    @Override
    public int reusable() {
        System.out.println("The task is reusable!");
        return super.reusable();
    }

    @Override
    public String toString() {
        return super.toString()+
                ", category=" + categoryFood;
    }
}
