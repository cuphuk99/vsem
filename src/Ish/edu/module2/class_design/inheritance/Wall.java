package Ish.edu.module2.class_design.inheritance;

import Ish.edu.module2.class_design.Rectangle;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem
 * @class Wall
 * @since 19.03.2021 - 18.15
 */

public class Wall extends Rectangle{

        private String color;
        private boolean isInner;
        private boolean isOuter;

    public Wall(){

    }

    public Wall(String color, boolean isInner, boolean isOuter) {
        this.color = color;
        this.isInner = isInner;
        this.isOuter = isOuter;
    }

    public Wall(int length, int width, String color, boolean isInner, boolean isOuter) {
        super(length, width);
        this.color = color;
        this.isInner = isInner;
        this.isOuter = isOuter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isInner() {
        return isInner;
    }

    public void setInner(boolean inner) {
        isInner = inner;
    }

    public boolean isOuter() {
        return isOuter;
    }

    public void setOuter(boolean outer) {
        isOuter = outer;
    }
    public int getPrice(){
        return 0;
    }
}