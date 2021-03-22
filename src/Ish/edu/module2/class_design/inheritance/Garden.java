package Ish.edu.module2.class_design.inheritance;

import Ish.edu.module2.class_design.Rectangle;

import java.util.Objects;

/**
 * @author Ishtukin Vlad
 * @version 1.0.0
 * @project vsem
 * @class Garden
 * @since 19.03.2021 - 19.18
 */

public class Garden extends Rectangle {
    private String typeOfPlant; // contains a type of a veg or a fruit on the garden
    private int leasePeriod; // the number of months for leasing
    private int priceForMeter; // price tax in dollars for the calculation of whole price

    public Garden(){
    }

    public Garden(String typeOfPlant, int leasePeriod, int priceForMeter) {
        this.typeOfPlant = typeOfPlant;
        this.leasePeriod = leasePeriod;
        this.priceForMeter = priceForMeter;
    }

    public Garden(int length, int width, String typeOfPlant, int leasePeriod, int priceForMeter) {
        super(length, width);
        this.typeOfPlant = typeOfPlant;
        this.leasePeriod = leasePeriod;
        this.priceForMeter = priceForMeter;
    }


    public String getTypeOfPlant() {
        return typeOfPlant;
    }

    public void setTypeOfPlant(String typeOfPlant) {
        this.typeOfPlant = typeOfPlant;
    }

    public int getLeasePeriod() {
        return leasePeriod;
    }

    public void setLeasePeriod(int leasePeriod) {
        this.leasePeriod = leasePeriod;
    }

    public int getPriceForMeter() {
        return priceForMeter;
    }

    public void setPriceForMeter(int priceForMeter) {
        this.priceForMeter = priceForMeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Garden garden = (Garden) o;
        return getLeasePeriod() == garden.getLeasePeriod() && getPriceForMeter() == garden.getPriceForMeter() && getTypeOfPlant().equals(garden.getTypeOfPlant());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTypeOfPlant(), getLeasePeriod(), getPriceForMeter());
    }

    @Override
    public String toString() {
        return "Garden{" +

                ", typeOfPlant='" + typeOfPlant + '\'' +
                ", leasePeriod=" + leasePeriod +
                ", priceForMeter=" + priceForMeter +
                '}';
    }

    // it calculates the price fo the leasing the garden depends on the period and the size of it
    public int getPrice(){
        return (this.getPriceForMeter() * super.getArea() * this.getLeasePeriod());
    }
}