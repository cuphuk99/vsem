package Ish.edu.module2.class_design.polymorphism;

import Ish.edu.module2.class_design.Parallelogram;
import Ish.edu.module2.class_design.inheritance.SoftwareDesigner;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem
 * @class Main
 * @since 22.03.2021 - 19.04
 */

public class Main {
    public static void main(String[] args) {
        ParallelogramNew p1 = new ParallelogramNew(3,4,45);

        System.out.println(p1.getHeight()+" Height");
        System.out.println(p1.getDiagonal()+" Diagonal");
        System.out.println(p1.getPerimeter()+" Perimeter");
        System.out.println(p1.getSecondAngle()+" Second angle");
        System.out.println(p1.getArea()+" Area");
        System.out.println(" ");

        ParallelogramNew p2 = new ParallelogramNew(9,7, 60);
        IGeometry i0 = FigureFactory.create(3,4,45);
        IGeometry i1 = FigureFactory.create(3,4);
        System.out.println(i0);
        System.out.println(i1);

        System.out.println(p2.toJSON());
        System.out.println(p2.toXML());


    }
}