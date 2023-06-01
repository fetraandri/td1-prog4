package com.prog.td.classes;

public class TestClassSingleton {
    public static void main(String[] args) {
        ClassSingleton singleton = ClassSingleton.getInstance();


        System.out.println(singleton.getDescription());

        singleton.setDescription("New info class");

        System.out.println(singleton.getDescription());
    }
}
