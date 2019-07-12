package OOPJAVA.CarDealership.TeslaCars;

import OOPJAVA.CarDealership.HighClass;

public class Tesla_X extends Tesla implements HighClass {


    public Tesla_X(String ecoCategory, int manufacturingDate, int horsePower, String type, int doors, int mileage, double price) {
        super(ecoCategory, manufacturingDate, horsePower, type, doors, mileage, price);
    }

    public Tesla_X() {
    }

    @Override
    public double additionalCost() {
        return 0;
    }

    @Override
    public String getEcoCategory() {
        return null;
    }

    @Override
    public int getManufacturingDate() {
        return 0;
    }

    @Override
    public int getHorsePower() {
        return 0;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public int getDoors() {
        return 0;
    }

    @Override
    public int getMileage() {
        return 0;
    }
}
