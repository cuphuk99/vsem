package Ish.edu.module2.class_design.polymorphism.Factory;

import Ish.edu.module2.class_design.polymorphism.IGeometry;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem
 * @class Rectangle3
 * @since 24.03.2021 - 18.48
 */

public class Rectangle3 implements IGeometry {
    private int length;
    private int width;

    public Rectangle3() {
    }

    public Rectangle3(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}