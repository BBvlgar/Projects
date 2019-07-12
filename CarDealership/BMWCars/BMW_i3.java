package OOPJAVA.CarDealership.BMWCars;

import OOPJAVA.CarDealership.ElectricCars;

public class BMW_i3 extends ElectricCars implements BMW {


    public BMW_i3(String ecoCategory, int manufacturingDate, int horsePower, String type, int doors, int mileage, double price) {
        super(ecoCategory, manufacturingDate, horsePower, type, doors, mileage, price);
    }

    public BMW_i3() {
    }
}
