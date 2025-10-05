package org.example;

public class myList {

    String name;

    public myList() {}

    public myList(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {}

    @Override
    public String toString() {
        return "toDoList{" +
                ", name='" + name + '\'' +
                '}';
    }
}
