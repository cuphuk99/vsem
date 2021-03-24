package Ish.edu.module2.class_design;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem
 * @class Parallelogram2
 * @since 24.03.2021 - 19.44
 */

public class Parallelogram2 {
    public double sideA;
    public double sideB;
    public double angle;

    public Parallelogram2() {
    }

    public Parallelogram2(double sideA, double sideB, double angle) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angle = angle;
    }


    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public double getPerimeter(){
        return (this.getSideA()+this.getSideB())*2;
    }
}