package com.clean;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("How many persons do you want to define?"));
        Person[] people = new Person[x];

        for(byte i = 0; i < people.length; i++) {
            people[i] = new Person();
            people[i].setName();
            people[i].setAge();
            people[i].setHeight();
        }

        for(byte i = 0; i < people.length; i++) {
            JOptionPane.showMessageDialog(null, people[i].toString());
        }
    }
}
