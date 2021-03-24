package Ish.edu.module2.class_design.inheritance;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem
 * @class Cleaner
 * @since 24.03.2021 - 18.26
 */

public class Cleaner extends Employee{
    @Override
    public int getSalary() {
        int fullYears = (int) ChronoUnit.YEARS.between(LocalDate.now(), super.getEntranceDay());
        return fullYears;
    }
}