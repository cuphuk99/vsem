package Ish.edu.module2.class_design.polymorphism;

import Ish.edu.module2.class_design.Parallelogram;
import Ish.edu.module2.class_design.polymorphism.Factory.Rectangle3;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem
 * @class Figure
 * @since 24.03.2021 - 19.57
 */

public class FigureFactory {
    public static IGeometry create(int length, int width){

        return new Rectangle3(length, width);
    }

    public static IGeometry create(double length, double width, double angle){

        return new ParallelogramNew(length, width, angle);
    }
}