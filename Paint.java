package com.company;

import java.util.ArrayList;

public class Paint {
    private ArrayList<Shape> Shapes;

    public Paint(){
        Shapes =new ArrayList<Shape>();
    }

    public void addShape(Shape shape){
        Shapes.add(shape);
    }

    public void drawAll(){
        for(Shape shape: Shapes)
            shape.draw();
    }
    public void printAll(){
        for (Shape shape: Shapes)
            System.out.println(shape.toString());
    }
}
