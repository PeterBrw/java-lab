package com.clean;

import javax.swing.*;

public class Person {
    private String name;
    private int age;
    private float height;

    public void setName() {
        this.name = JOptionPane.showInputDialog("Enter person's name: ");
    }

    public void setAge() {
        this.age = Integer.parseInt(JOptionPane.showInputDialog("Enter person's age: "));
    }

    public void setHeight() {
        this.height = Float.parseFloat(JOptionPane.showInputDialog("Enter person's height: "));
    }

    public void showName() {
        JOptionPane.showMessageDialog(null, "Name of the person is " + this.name);
    }

    public void showAge() {
        JOptionPane.showMessageDialog(null, "The age of the person is " + this.age);
    }

    public void showHeight() {
        JOptionPane.showMessageDialog(null, "Height of the person is " + this.height);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
