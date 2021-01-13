package com.clean;

public class Triangle extends Form2D{
    String triangle_type;

    public Triangle(Integer height, Integer width, String triangle_type) {
        super(height, width);
        this.triangle_type = triangle_type;
    }

    @Override
    public Integer calculateArea() {
        return height * width / 2;
    }

    public void showType(){
        System.out.println("The triangle is " + triangle_type);
    }
}
