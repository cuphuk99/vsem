package Ish.edu.module2.class_design.inheritance;

import java.time.LocalDate;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem
 * @class Employee
 * @since 24.03.2021 - 18.19
 */

public abstract class Employee {
    private String name;
    private LocalDate entranceDay;
    private String qualification;
    private String speciality;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getEntranceDay() {
        return entranceDay;
    }

    public void setEntranceDay(LocalDate entranceDay) {
        this.entranceDay = entranceDay;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", entranceDay=" + entranceDay +
                ", qualification='" + qualification + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }

    public abstract int getSalary();
}