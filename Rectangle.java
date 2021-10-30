package com.company;

import java.util.ArrayList;

public class Rectangle extends Polygon {
    private ArrayList<Integer> Sides;
    public Rectangle(int... sides) {
        super(sides);
    }
    public boolean isSquare() {
        for (int i = 0; i < 3; i++)
            if (!this.getSides().get(i).equals(this.getSides().get(i + 1)))
                return false;
        return true;
    }

}
