package Planner.domain.impl;

import Planner.domain.Task;

public class MeetJohn extends Task {

    private String categoryJohn;

    public MeetJohn(String name, int priority, String categoryJohn){
        super(name, priority);
        this.categoryJohn = categoryJohn;
    }

    @Override
    public void perform() {
        System.out.println("The task is performable!");
         super.perform();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", category=" + categoryJohn;
    }
}
