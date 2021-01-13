package com.clean;

public class Rectangle extends Form2D{
    public Rectangle(Integer height, Integer width) {
        super(height, width);
    }

    @Override
    public Integer calculateArea() {
        return height * width;
    }

    public Boolean particularCase(){
        if(height == width)
            return true;
        else
            return false;
    }
}
