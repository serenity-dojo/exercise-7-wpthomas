package com.serenitydojo;

public abstract class Pet {
    private final int age;
    private String name;

    public Pet(String name, int age){
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public abstract String play();

    public int getAge() {
        return age;
    }
}
