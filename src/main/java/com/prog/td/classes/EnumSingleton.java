package com.prog.td.classes;

public enum EnumSingleton {

    INSTANCE("Initial class info");

    private String click;

    private EnumSingleton(String click) {
        this.click = click;
    }

    public String getClick() {
        return click;
    }

    public void setClick(String click) {
        this.click = click;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
