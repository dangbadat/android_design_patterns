package com.example.jingbin.designpattern.prototype;

import java.util.ArrayList;

public class ConcretePrototype implements Cloneable {

    private String string;

    private ArrayList<String> stringList;

    public ConcretePrototype() {
        stringList = new ArrayList<>();
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public ArrayList<String> getStringList() {
        return stringList;
    }

    public void setStringList(ArrayList<String> stringList) {
        this.stringList = stringList;
    }

    public ConcretePrototype clone() {
        try {
            ConcretePrototype copy = (ConcretePrototype) super.clone();
            copy.setString(this.getString());
            copy.setStringList((ArrayList<String>) getStringList().clone());
            return copy;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
