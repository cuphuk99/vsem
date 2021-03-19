package Ish.edu.module2.class_design;

import Ish.edu.module2.class_design.inh.Garden;
import Ish.edu.module2.class_design.inh.Person;
import Ish.edu.module2.class_design.inh.Student;
import Ish.edu.module2.class_design.inh.Wall;

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
        System.out.println(p1.getPerimeter()+" Perimeter");
        System.out.println(p1.getSecondAngle()+" Second angle");
        System.out.println(p1.getArea()+" Area");
        System.out.println(" ");


        Garden g1 = new Garden(10,15,"Potato",3,10);
        System.out.println("Here is the final price of a leasing " + g1.getPrice());
        System.out.println(" ");


        Student s1 = new Student("Vlad", "Ishtukin", "Valeriyovich", 21, "Male", 72.2, 176.3,
                "Ukrainian", "Green", "White", "Brown", "cuphuk99@gmail.com", "0501512613",
                "KNUTE", "FIT", "Economic cybernetics", "Digital economy", "1m", "1", 542345, 2020,
                "None", "Badmintone", 90.1, true);
        s1.toConsole();

    }
}