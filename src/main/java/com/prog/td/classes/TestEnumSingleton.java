package com.prog.td.classes;

public class TestEnumSingleton {
    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.getInstance();

        System.out.println(singleton.getClick());


        singleton.setClick("New class info");

        System.out.println(singleton.getClick());
    }
}
