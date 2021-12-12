package com.example.fragmentapp.ui.convert;

public class Category {
    private String name;
    private int radix;

    public Category(String name, int radix) {
        this.name = name;
        this.radix = radix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRadix() {
        return radix;
    }

    public void setRadix(int radix) {
        this.radix = radix;
    }
}
