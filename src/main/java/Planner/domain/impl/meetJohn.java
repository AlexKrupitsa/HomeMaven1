package Planner.domain.impl;

import Planner.domain.Tasks;

public class meetJohn extends Tasks {

    private String categoryJohn;

    public meetJohn(String name, int priority, String categoryJohn){
        super(name, priority);
        this.categoryJohn = categoryJohn;
    }

    @Override
    public int single() {
        System.out.println("The task is single!");
        return super.single();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", category=" + categoryJohn;
    }
}
