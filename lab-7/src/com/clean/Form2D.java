package com.clean;

public abstract class Form2D {
    public Integer height;
    public Integer width;

    public Form2D(Integer height, Integer width) {
        this.height = height;
        this.width = width;
    }

    public void showDimensions()
    {
        System.out.println("The height is " + height +"\n" + "The width is " + width);
    }

    public abstract Integer calculateArea();
}
