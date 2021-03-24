package Ish.edu.module2.class_design.polymorphism.Factory;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem
 * @class RectangleFactory
 * @since 24.03.2021 - 18.51
 */

public class RectangleFactory {
    public static Rectangle3 create(int length, int width){

        return new Rectangle3(length,width);
    }
}