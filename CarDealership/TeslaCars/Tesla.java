package OOPJAVA.CarDealership.TeslaCars;

import OOPJAVA.CarDealership.ElectricCars;

public abstract class Tesla extends ElectricCars {

     String MODEL = "Tesla";
     String COUNTRY = "USA";

     double additionalExoticCarCost = 5;

    public Tesla(String ecoCategory, int manufacturingDate, int horsePower, String type, int doors, int mileage, double price) {
        super(ecoCategory, manufacturingDate, horsePower, type, doors, mileage, price);
    }

    public Tesla() {
        super();
    }


    public abstract double additionalCost();

    public String getModel(){

        return MODEL;
    }


    public String getCountry(){

        return COUNTRY;
    }



}
