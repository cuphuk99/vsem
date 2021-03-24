package Ish.edu.module2.class_design.inheritance;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem
 * @class SoftwareDesigner
 * @since 24.03.2021 - 18.23
 */

public class SoftwareDesigner extends Employee{

    private int rate;
    private int hours;

    public SoftwareDesigner() {
    }

    public SoftwareDesigner(int rate, int hours) {
        this.rate = rate;
        this.hours = hours;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public int getSalary() {
        return this.getHours() * this.getRate();
    }
}