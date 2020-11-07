package Planner.domain.impl;

import Planner.domain.Task;

public class Breakfast extends Task {

    private String categoryFood;

    public Breakfast(String name, int priority, String categoryFood){
        super(name, priority);
        this.categoryFood = categoryFood;
    }


    @Override
    public String toString() {
        return super.toString()+
                ", category=" + categoryFood;
    }
}
