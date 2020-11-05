package Planner.domain;

public abstract  class Tasks implements Reusable {

    private String name;
    private int priority;
    private String category;


    public Tasks(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public int single() {
        System.out.println("name: " + name + " is single use");
    }

    public int reusable() {
        System.out.println("name: " + name + " is reusable");
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPriority() { return priority; }
    public void setPriority(int priority) { this.priority = priority; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                " , priority=" + priority;
    }
}