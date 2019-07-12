package OOPJAVA.CarDealership.BMWCars;

import OOPJAVA.CarDealership.GasCars;

public class BMW_530 extends GasCars implements BMW {


    public BMW_530(String ecoCategory, int manufacturingDate, int horsePower, String type, int doors, int mileage, double price) {
        super(ecoCategory, manufacturingDate, horsePower, type, doors, mileage, price);
    }

    public BMW_530() {
    }

    @Override
    public void oilChange() {

    }



    @Override
    public double calculatePrice() {
        return 0;
    }
}
