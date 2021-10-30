package com.company;

import java.util.ArrayList;

public class Polygon extends Shape{
    protected ArrayList<Integer> Sides;

    public Polygon(int... sides){
        super(sides);
    }
}