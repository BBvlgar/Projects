package OOPJAVA.CarDealership;

public class Car {

    private String EcoCategory;
    private int ManufacturingDate;
    private int horsePower;
    private String type;
    private int doors;
    private int mileage;
    private double price;


    public Car(String ecoCategory, int manufacturingDate, int horsePower, String type, int doors, int mileage, double price) {
        EcoCategory = ecoCategory;
        ManufacturingDate = manufacturingDate;
        this.horsePower = horsePower;
        this.type = type;
        this.doors = doors;
        this.mileage = mileage;
        this.price = price;
    }

    public Car() {

    }


    public String getEcoCategory() {
        return this.EcoCategory;
    }

    public int getManufacturingDate() {
        return this.ManufacturingDate;
    }

    public int getHorsePower() { return this.horsePower; }

    public String getType() {
        return this.type;
    }

    public int getDoors() {
        return this.doors;
    }

    public int getMileage() {
        return this.mileage;
    }

    public double getPrice() { return this.price; }


    @Override
    public String toString() {
        return
                "EcoCategory='" + EcoCategory + '\'' +
                ", ManufacturingDate=" + ManufacturingDate +
                ", horsePower=" + horsePower +
                ", type='" + type + '\'' +
                ", doors=" + doors +
                ", mileage=" + mileage +
                ", price=" + price;
    }
}
