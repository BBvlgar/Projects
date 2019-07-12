package OOPJAVA.CarDealership;

public abstract class ElectricCars extends Car {


    public ElectricCars(String ecoCategory, int manufacturingDate, int horsePower, String type, int doors, int mileage, double price) {
        super(ecoCategory, manufacturingDate, horsePower, type, doors, mileage, price);
    }


    public ElectricCars() {
        super();
    }
}
