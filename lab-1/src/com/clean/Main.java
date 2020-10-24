package com.clean;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Introduceti numarul de elemente:"));
        int[] numbers = new int[x];

        int sum = 0;

        for(byte i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduceti elementul: "));
            sum += numbers[i];
        }

        float medie = (float)  sum / x;

        JOptionPane.showMessageDialog(null, "Media aritmetica a numerelor introdusa este egala cu " + medie);
    }
}
