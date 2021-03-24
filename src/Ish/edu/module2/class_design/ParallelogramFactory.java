package Ish.edu.module2.class_design;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem
 * @class ParallelogramFactory
 * @since 24.03.2021 - 19.41
 */

public class ParallelogramFactory {
    public static Parallelogram2 create (double sideA, double sideB, int angle){
        if (angle == 0 || angle>357){
            return null;
        }
        return new Parallelogram2(sideA, sideB, angle);
    }
}