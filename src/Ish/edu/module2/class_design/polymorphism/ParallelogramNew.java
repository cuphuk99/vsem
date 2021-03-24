package Ish.edu.module2.class_design.polymorphism;

import java.util.Objects;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem
 * @class Parallelogram
 * @since 17.03.2021 - 20.14
 */

public class ParallelogramNew implements IGeometry, IPacking {

    public double sideA;
    public double sideB;
    public double angle;

    public ParallelogramNew() {
    }

    public ParallelogramNew(double sideA, double sideB, double angle) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParallelogramNew that = (ParallelogramNew) o;
        return Double.compare(that.getSideA(), getSideA()) == 0 && Double.compare(that.getSideB(), getSideB()) == 0 && Double.compare(that.getAngle(), getAngle()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSideA(), getSideB(), getAngle());
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", angle=" + angle +
                '}';
    }
    public double getSin(){
        return Math.sin(Math.toRadians(this.getAngle()));
    }

    //get area of parallelogram
    public double getArea(){
        return this.getSideB()*this.getHeight();
    }

    // get height to the sideB
    public double getHeight(){
        return this.getSideA()* Math.sin(Math.toRadians(this.getAngle()));
    }
    //get the other angle of the parallelogram
    public double getSecondAngle(){
        return 180 - this.angle;
    }
    //get the diagonal
    public double getDiagonal(){
        double sideAsqr=  Math.pow(this.getSideA(), 2);
        double sideBsqr=  Math.pow(this.getSideB(), 2);
        return Math.sqrt((sideAsqr + sideBsqr + (2*this.getSideA()*this.getSideB()*Math.cos(Math.toRadians(this.getAngle())))));
    }
    public double getPerimeter(){
        return (this.getSideA()+this.getSideB())*2;
    }

    @Override
    public String toJSON() {
        String json = "Parallelogram" + "{" + "\"" + "sideA" +"\"" + ":" + this.getSideA() + "," +
                "\"" + "sideB" +"\"" + ":" + this.getSideB() + "," +
                "\"" + "angle" +"\"" + ":" + this.getAngle() +
                "}";
        return json;
    }

    @Override
    public String toXML() {
        String xml = "<Parallelogram>" + " <sideA> "+ this.getSideA() + " </sideA>" +
                     " <sideB> "+ this.getSideB() + " </sideB>" +
                     " <angle> "+ this.getAngle() + " </angle>" +
                     "</Parallelogram>";

        return xml;
    }


    /*
                sideB
      2  _____________________
        /|                    /
 sideA / |                   /
      /  | h                /
     /   |                 /
    /    |                /
 1  _____________________

    1 is the first angle that we enter in the coustructor
    2 - is the second angle tht we are calculate
    h - is th height that we are calculating
    */



}