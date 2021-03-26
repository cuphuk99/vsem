package Ish.edu.module2.class_design.inheritance;

import java.util.Objects;
import java.time.LocalDate;

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

    public Student(String firstName, String lastName, String patronymic, LocalDate dateOfBirth, String male, double weight, double height, String nationality, String eyesColour, String skinColour, String hairColour, String email, String phoneNumber, String university, String faculty, String chair, String speciality, String group, String course, int id, int yearOfEntering, String club, String sportSection, double averageMark, boolean livesInDorm) {
        super(firstName, lastName, patronymic, dateOfBirth, male, weight, height, nationality, eyesColour, skinColour, hairColour, email, phoneNumber);
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
                "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", age=" + this.getAgeNew() +
                ", male='" + super.getMale() + '\'' +
                ", weight=" + super.getWeight() +
                ", height=" + super.getHeight() +
                ", nationality='" + super.getNationality() + '\'' +
                ", eyesColour='" + super.getEyesColour() + '\'' +
                ", skinColour='" + super.getSkinColour() + '\'' +
                ", hairColour='" + super.getHairColour() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", phoneNumber='" + super.getPhoneNumber() + '\'' +

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

    public static class Builder{
        private Student studentToBuild;

        public Builder() {
            this.studentToBuild = new Student();
        }

        public Builder setSimilarTo(Student student){
            this.studentToBuild.setFirstName(student.getFirstName());
            this.studentToBuild.setLastName(student.getLastName());
            this.studentToBuild.setPatronymic(student.getPatronymic());
            this.studentToBuild.setDateOfBirth(student.getDateOfBirth());
            this.studentToBuild.setMale(student.getMale());
            this.studentToBuild.setWeight(student.getWeight());
            this.studentToBuild.setHeight(student.getHeight());
            this.studentToBuild.setNationality(student.getNationality());
            this.studentToBuild.setEyesColour(student.getEyesColour());
            this.studentToBuild.setHairColour(student.getHairColour());
            this.studentToBuild.setEmail(student.getEmail());
            this.studentToBuild.setPhoneNumber(student.getPhoneNumber());

            this.studentToBuild.university = student.university;
            this.studentToBuild.faculty = student.faculty;
            this.studentToBuild.chair = student.chair;
            this.studentToBuild.speciality = student.speciality;
            this.studentToBuild.group = student.group;
            this.studentToBuild.course = student.course;
            this.studentToBuild.id = student.id;
            this.studentToBuild.yearOfEntering = student.yearOfEntering;
            this.studentToBuild.club = student.club;
            this.studentToBuild.sportSection = student.sportSection;
            this.studentToBuild.averageMark = student.averageMark;
            this.studentToBuild.livesInDorm = student.livesInDorm;


            return this;
        }

        public Builder setFirstName(String firstName){
            studentToBuild.setFirstName(firstName);
            return this;
        }

        public Builder setLastName(String lastName){
            studentToBuild.setLastName(lastName);
            return this;
        }

        public Builder setPatronymic(String patronymic){
            studentToBuild.setPatronymic(patronymic);
            return this;
        }

        public Builder setDateOfBirth(LocalDate dateOfBirth){
            studentToBuild.setDateOfBirth(dateOfBirth);
            return this;
        }

        public Builder setMale(String male){
            studentToBuild.setMale(male);
            return this;
        }

        public Builder setWeight(double weight){
            studentToBuild.setWeight(weight);
            return this;
        }

        public Builder setHeight(double height){
            studentToBuild.setHeight(height);
            return this;
        }

        public Builder setNationality(String nationality){
            studentToBuild.setNationality(nationality);
            return this;
        }

        public Builder setEyesColour(String eyesColour){
            studentToBuild.setEyesColour(eyesColour);
            return this;
        }

        public Builder setSkinColour(String skinColour){
            studentToBuild.setPatronymic(skinColour);
            return this;
        }

        public Builder setHairColour(String hairColour){
            studentToBuild.setHairColour(hairColour);
            return this;
        }

        public Builder setEmail(String email){
            studentToBuild.setEmail(email);
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber){
            studentToBuild.setPhoneNumber(phoneNumber);
            return this;
        }




        public Builder setUniversity(String university){
            studentToBuild.setUniversity(university);
            return this;
        }

        public Builder setFaculty(String faculty){
            studentToBuild.setFaculty(faculty);
            return this;
        }

        public Builder setChair(String chair){
            studentToBuild.setChair(chair);
            return this;
        }

        public Builder setSpeciality(String speciality){
            studentToBuild.setSpeciality(speciality);
            return this;
        }

        public Builder setGroup(String group){
            studentToBuild.setGroup(group);
            return this;
        }

        public Builder setCourse(String course){
            studentToBuild.setCourse(course);
            return this;
        }

        public Builder setId(int id){
            studentToBuild.setId(id);
            return this;
        }

        public Builder setYearOfEntering(int yearOfEntering){
            studentToBuild.setYearOfEntering(yearOfEntering);
            return this;
        }

        public Builder setClub(String club){
            studentToBuild.setClub(club);
            return this;
        }
        public Builder setSportSection(String sportSection){
            studentToBuild.setSportSection(sportSection);
            return this;
        }
        public Builder setAverageMark(double averageMark){
            studentToBuild.setAverageMark(averageMark);
            return this;
        }
        public Builder setLivesInDorm(boolean livesInDorm){
            studentToBuild.setLivesInDorm(livesInDorm);
            return this;
        }
        public Student build(){
            return studentToBuild;
        }
    }
}