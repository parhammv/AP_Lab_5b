package com.company;

public class Main {

    public static void main(String[] args) {
    Circle circle = new Circle(1);
    Rectangle rectangle = new Rectangle(1,2,1,2);
    Triangle triangle = new Triangle(3,4,5);
    Paint paint = new Paint();
    paint.addShape(circle);
    paint.addShape(triangle);
    paint.addShape(rectangle);
    paint.printAll();
    System.out.println(triangle.isEquilateral());
    System.out.println(rectangle.isSquare());
    paint.drawAll();
    }
}
