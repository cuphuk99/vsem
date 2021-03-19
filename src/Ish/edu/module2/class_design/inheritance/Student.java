package Ish.edu.module2.class_design.inheritance;

import java.util.Objects;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem
 * @class Student
 * @since 19.03.2021 - 19.58
 */

public class Student extends Person{
    private String university;
    private String faculty;
    private String chair;
    private String speciality;
    private String group;
    private String course;
    private int id; // the id code as a student
    private int yearOfEntering; // when student entered the university;
    private String club;
    private String sportSection;
    private double averageMark;
    private boolean livesInDorm;

    public Student() {
    }

    public Student(String university, String faculty, String chair, String speciality, String group, String course, int id, int yearOfEntering, String club, String sportSection, double averageMark, boolean livesInDorm) {
        this.university = university;
        this.faculty = faculty;
        this.chair = chair;
        this.speciality = speciality;
        this.group = group;
        this.course = course;
        this.id = id;
        this.yearOfEntering = yearOfEntering;
        this.club = club;
        this.sportSection = sportSection;
        this.averageMark = averageMark;
        this.livesInDorm = livesInDorm;
    }

    public Student(String firstName, String lastName, String patronymic, int age, String male, double weight, double height, String nationality, String eyesColour, String skinColour, String hairColour, String email, String phoneNumber, String university, String faculty, String chair, String speciality, String group, String course, int id, int yearOfEntering, String club, String sportSection, double averageMark, boolean livesInDorm) {
        super(firstName, lastName, patronymic, age, male, weight, height, nationality, eyesColour, skinColour, hairColour, email, phoneNumber);
        this.university = university;
        this.faculty = faculty;
        this.chair = chair;
        this.speciality = speciality;
        this.group = group;
        this.course = course;
        this.id = id;
        this.yearOfEntering = yearOfEntering;
        this.club = club;
        this.sportSection = sportSection;
        this.averageMark = averageMark;
        this.livesInDorm = livesInDorm;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYearOfEntering() {
        return yearOfEntering;
    }

    public void setYearOfEntering(int yearOfEntering) {
        this.yearOfEntering = yearOfEntering;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getSportSection() {
        return sportSection;
    }

    public void setSportSection(String sportSection) {
        this.sportSection = sportSection;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public boolean isLivesInDorm() {
        return livesInDorm;
    }

    public void setLivesInDorm(boolean livesInDorm) {
        this.livesInDorm = livesInDorm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return getId() == student.getId() && getYearOfEntering() == student.getYearOfEntering() && Double.compare(student.getAverageMark(), getAverageMark()) == 0 && isLivesInDorm() == student.isLivesInDorm() && Objects.equals(getUniversity(), student.getUniversity()) && Objects.equals(getFaculty(), student.getFaculty()) && Objects.equals(getChair(), student.getChair()) && Objects.equals(getSpeciality(), student.getSpeciality()) && Objects.equals(getGroup(), student.getGroup()) && Objects.equals(getCourse(), student.getCourse()) && Objects.equals(getClub(), student.getClub()) && Objects.equals(getSportSection(), student.getSportSection());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getUniversity(), getFaculty(), getChair(), getSpeciality(), getGroup(), getCourse(), getId(), getYearOfEntering(), getClub(), getSportSection(), getAverageMark(), isLivesInDorm());
    }

    @Override
    public String toString() {
        return "Student{" +
                "university='" + university + '\'' +
                ", faculty='" + faculty + '\'' +
                ", chair='" + chair + '\'' +
                ", speciality='" + speciality + '\'' +
                ", group='" + group + '\'' +
                ", course='" + course + '\'' +
                ", id=" + id +
                ", yearOfEntering=" + yearOfEntering +
                ", club='" + club + '\'' +
                ", sportSection='" + sportSection + '\'' +
                ", averageMark=" + averageMark +
                ", livesInDorm=" + livesInDorm +
                '}';
    }
    public void toConsole(){
        System.out.println(super.toString());
        System.out.println(this.toString());
    }
}