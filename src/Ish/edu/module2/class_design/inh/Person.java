package Ish.edu.module2.class_design.inh;

import java.util.Objects;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem
 * @class Person
 * @since 19.03.2021 - 19.45
 */

public class Person {
    private String firstName;
    private String lastName;
    private String patronymic;
    private int age;
    private String male;
    private double weight;
    private double height;
    private String nationality;
    private String eyesColour;
    private String skinColour;
    private String hairColour;
    private String email;
    private String phoneNumber;

    public Person() {
    }

    public Person(String firstName, String lastName, String patronymic, int age, String male, double weight, double height, String nationality, String eyesColour, String skinColour, String hairColour, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.age = age;
        this.male = male;
        this.weight = weight;
        this.height = height;
        this.nationality = nationality;
        this.eyesColour = eyesColour;
        this.skinColour = skinColour;
        this.hairColour = hairColour;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getEyesColour() {
        return eyesColour;
    }

    public void setEyesColour(String eyesColour) {
        this.eyesColour = eyesColour;
    }

    public String getSkinColour() {
        return skinColour;
    }

    public void setSkinColour(String skinColour) {
        this.skinColour = skinColour;
    }

    public String getHairColour() {
        return hairColour;
    }

    public void setHairColour(String hairColour) {
        this.hairColour = hairColour;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && Double.compare(person.getWeight(), getWeight()) == 0 && Double.compare(person.getHeight(), getHeight()) == 0 && Objects.equals(getFirstName(), person.getFirstName()) && Objects.equals(getLastName(), person.getLastName()) && Objects.equals(getPatronymic(), person.getPatronymic()) && Objects.equals(getMale(), person.getMale()) && Objects.equals(getNationality(), person.getNationality()) && Objects.equals(getEyesColour(), person.getEyesColour()) && Objects.equals(getSkinColour(), person.getSkinColour()) && Objects.equals(getHairColour(), person.getHairColour()) && Objects.equals(getEmail(), person.getEmail()) && Objects.equals(getPhoneNumber(), person.getPhoneNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getPatronymic(), getAge(), getMale(), getWeight(), getHeight(), getNationality(), getEyesColour(), getSkinColour(), getHairColour(), getEmail(), getPhoneNumber());
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age=" + age +
                ", male='" + male + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", nationality='" + nationality + '\'' +
                ", eyesColour='" + eyesColour + '\'' +
                ", skinColour='" + skinColour + '\'' +
                ", hairColour='" + hairColour + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}