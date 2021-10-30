package com.company;

import java.util.ArrayList;

public class Triangle extends Polygon{
    private ArrayList<Integer> Sides;
    public Triangle(int... sides) {
        super(sides);
    }
    public boolean isEquilateral() {
        for (int i = 0; i < 2; i++)
            if (!this.getSides().get(i).equals(this.getSides().get(i + 1)))
                return false;
        return true;
    }

}
