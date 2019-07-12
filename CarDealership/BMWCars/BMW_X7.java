package OOPJAVA.CarDealership.BMWCars;

import OOPJAVA.CarDealership.GasCars;

public class BMW_X7 extends GasCars implements BMW {


    public BMW_X7(String ecoCategory, int manufacturingDate, int horsePower, String type, int doors, int mileage, double price) {
        super(ecoCategory, manufacturingDate, horsePower, type, doors, mileage, price);
    }

    public BMW_X7() {
        super();
    }

    @Override
    public void oilChange() {

    }


    @Override
    public double calculatePrice() {
        return 0;
    }
}
