package Ish.edu.module2.class_design;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem
 * @class Main
 * @since 17.03.2021 - 19.35
 */

public class Main {
    public static void main(String[] args) {
       Parallelogram p1 = new Parallelogram(3,4,45);

        System.out.println(p1.getHeight()+" Height");
        System.out.println(p1.getDiagonal()+" Diagonal");
        System.out.println(p1.getPerimeter()+" Perimetr");
        System.out.println(p1.getSecondAngle()+" Second angle");
        System.out.println(p1.getArea()+" Area");



    }
}