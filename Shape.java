package com.company;

import java.util.ArrayList;

public class Shape {
    protected ArrayList<Integer> Sides;

    public Shape(int... lengths){
        Sides = new ArrayList<Integer>();
        for (Integer length: lengths)
            Sides.add(length);
    }
    public double calculatePerimeter(){
        if (this instanceof Circle)
            return 2*Math.PI*((Circle) this).getRadius();
        if (this instanceof Polygon){
            int perimeter = 0;
            for (int side: ((Polygon) this).getSides())
                perimeter+=side;
            return perimeter;
        }
        return 0;
    }

    public String toString() {
        if (this instanceof Circle)
            return ("circle, raduis = " + ((Circle) this).getRadius());
        else if (this instanceof Triangle) {
            String str = "triangle, sides = ";
            for (Integer side : ((Triangle) this).getSides())
                str = str.concat (String.valueOf(side) + " ");
            return str;
        } else if (this instanceof Rectangle) {
            String str = "rectangle, sides = ";
            for (Integer side : ((Rectangle) this).getSides())
                str = str.concat(String.valueOf(side) + " ");
            return str;
        } else {
            String str = "polygon, sides = ";
            for (Integer side : ((Polygon) this).getSides())
                str = str.concat(String.valueOf(side) + " ");
            return str;
        }
    }

    public double calculateArea(){
        if (this instanceof Circle)
            return Math.PI*((Circle) this).getRadius()*((Circle) this).getRadius();
        else if (this instanceof Triangle){
            double p = 0;
            for (int side: ((Triangle) this).getSides())
                p+=(side/2.0);
            double Area = Math.sqrt(p);
            for(int side: ((Triangle) this).getSides())
                Area*=Math.sqrt(p-side);
            return Area;
        }
        else if (this instanceof Rectangle)
            return ((Rectangle) this).getSides().get(0)*((Rectangle) this).getSides().get(1);
        return 0;
    }

    public void draw() {
        if (this instanceof Circle)
            System.out.print("Circle: ");
        else if (this instanceof Rectangle)
            System.out.print("Rectangle: ");

        else if (this instanceof Triangle)
            System.out.print("Triangle: ");
            System.out.println("Perimeter: " + String.valueOf(this.calculatePerimeter()) + "Area: " + String.valueOf(this.calculateArea()));
        }
    public ArrayList<Integer> getSides(){
        return Sides;
    }
}
