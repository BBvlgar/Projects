package OOPJAVA.CarDealership.BMWCars;

public interface BMW {

     String MODEL = "BMW";
     String COUNTRY = "Germany";

    default String getModel(){

        return MODEL;
    }

    default String getCountry(){

        return COUNTRY;
    }

}
