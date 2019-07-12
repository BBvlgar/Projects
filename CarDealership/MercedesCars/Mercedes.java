package OOPJAVA.CarDealership.MercedesCars;

public interface Mercedes  {

    String MODEL = "Mercedes";
    String COUNTRY = "Germany";



    default String getModel(){

        return MODEL;
    }


    default String getCountry(){

        return COUNTRY;
    }

}
