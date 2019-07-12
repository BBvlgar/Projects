package OOPJAVA.CarDealership;

public abstract class GasCars extends Car implements Tax {

    double litersPerKM;

    String OilType;

    public GasCars(String ecoCategory, int manufacturingDate, int horsePower, String type, int doors, int mileage, double price) {
        super(ecoCategory, manufacturingDate, horsePower, type, doors, mileage, price);
    }

    public GasCars() {

    }

    public abstract void oilChange();


    @Override
    public double calculatePrice() {
        return 0;
    }
}
