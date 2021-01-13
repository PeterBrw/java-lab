package com.clean;

public class Main {

    public static void main(String[] args) {
        Triangle t1 = new Triangle(4, 8, "rectangular");
        Triangle t2 = new Triangle(4 ,3, "isosceles");

        Rectangle r1 = new Rectangle(6 ,4);
        Rectangle r2 = new Rectangle(2, 2);

        System.out.println("\n" + "Data about t1:");
        t1.showType();
        t1.showDimensions();
        System.out.println("Area is " +t1.calculateArea());

        System.out.println("\n" + "Data about t2:");
        t2.showType();
        t2.showDimensions();
        System.out.println("Area is " + t2.calculateArea());

        System.out.println("\n" + "Data about r1:");
        r1.showDimensions();
        System.out.println("Area is " + r1.calculateArea());

        if(r1.particularCase() == true)
            System.out.println("This is a square!");
        else
            System.out.println("This is a rectangle!");
        System.out.println("\n" + "Data about r2:");
        r2.showDimensions();
        System.out.println("Area is " + r2.calculateArea());

        if(r2.particularCase() == true)
            System.out.println("This is a square!");
        else
            System.out.println("This is a rectangle!");

    }
}
