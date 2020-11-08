package Planner.domain;

public abstract  class Task implements Performable {

    private String name;
    private int priority;
    private String category;


    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
    @Override
    public void perform() {
        System.out.println("name: " + name + " is performable");
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getPriority() { return priority; }
    public void setPriority(int priority) { this.priority = priority; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                " , priority=" + priority;
    }
}