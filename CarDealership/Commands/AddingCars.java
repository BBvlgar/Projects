package OOPJAVA.CarDealership.Commands;

import OOPJAVA.CarDealership.BMWCars.BMW_530;
import OOPJAVA.CarDealership.BMWCars.BMW_X7;
import OOPJAVA.CarDealership.BMWCars.BMW_i3;
import OOPJAVA.CarDealership.ElectricCars;
import OOPJAVA.CarDealership.GasCars;
import OOPJAVA.CarDealership.TeslaCars.Tesla_3;
import OOPJAVA.CarDealership.TeslaCars.Tesla_X;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddingCars {

    static List<GasCars> gasCars = new ArrayList<>();
    static List<ElectricCars> EVCars = new ArrayList<>();


    public AddingCars() {


        String inputType = typeOfCar();

        whichModel(inputType);



    }


    private void whichModel(String type){
        String which = "";

        switch (type){

            case "Tesla":
                 modelTesla();
                break;
            case "BMW":
                 modelBMW();
                break;
            case "Mercedes":
                modelMercedes();

                break;
            case "Audi":
                modelAudi();

                break;

                default:

                    AddingCars addingCars = new AddingCars();
                    break;

        }
    }


    private String[] carAdder(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ecoCategory, year, horsePower, SUV or Sedan, doors, mileage, price");
        String characteristics = scanner.nextLine();

        return  characteristics.split(",\\s+");

    }


    private void createTesla(String input) {

        String[] charcharter = carAdder();

        String ecoCategory = charcharter[0];
        int manufacturingDate = Integer.parseInt(charcharter[1]);
        int horsePower = Integer.parseInt(charcharter[2]);
        String type = charcharter[3];
        int doors = Integer.parseInt(charcharter[4]);
        int mileage = Integer.parseInt(charcharter[5]);
        double price = Double.parseDouble(charcharter[6]);

        switch (input) {

            case "3":

                //String ecoCategory, int manufacturingDate, int horsePower, String type, int doors, int mileage, double price
                Tesla_3 tesla = new Tesla_3(ecoCategory,manufacturingDate,horsePower,type,doors,mileage,price);
                EVCars.add(tesla);


                break;

            case "X":

                Tesla_X X = new Tesla_X(ecoCategory,manufacturingDate,horsePower,type,doors,mileage,price);
                EVCars.add(X);

                break;
            default:
                modelTesla();
                break;

        }
        Command command = new Command();

    }

    private void createBMW(String input) {
        String[] charcharter = carAdder();

        String ecoCategory = charcharter[0];
        int manufacturingDate = Integer.parseInt(charcharter[1]);
        int horsePower = Integer.parseInt(charcharter[2]);
        String type = charcharter[3];
        int doors = Integer.parseInt(charcharter[4]);
        int mileage = Integer.parseInt(charcharter[5]);
        double price = Double.parseDouble(charcharter[6]);

        switch (input) {

            case "i3":

                //String ecoCategory, int manufacturingDate, int horsePower, String type, int doors, int mileage, double price
                BMW_i3 bmw = new BMW_i3(ecoCategory,manufacturingDate,horsePower,type,doors,mileage,price);
                EVCars.add(bmw);

                break;

            case "5":

                BMW_530 bmw_530 = new BMW_530(ecoCategory,manufacturingDate,horsePower,type,doors,mileage,price);

                gasCars.add(bmw_530);


                break;
            case "X7":

                BMW_X7 bmw_x7 = new BMW_X7(ecoCategory,manufacturingDate,horsePower,type,doors,mileage,price);
                gasCars.add(bmw_x7);


                break;
            default:
                modelBMW();
                break;

        }
        Command command = new Command();
    }

    private void modelAudi(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose model: A3, A5, A7");
        String input = scanner.nextLine();

        validTypeCar(input);

    }

    private void modelTesla(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose model: 3 or X");
        String input = scanner.nextLine();

        validTypeCar(input);

        createTesla(input);

    }

    private void modelBMW(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose model: i3, 5 or X7");
        String input = scanner.nextLine();

        validTypeCar(input);

        createBMW(input);

    }
    private void modelMercedes(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose model: S or GLA");
        String input = scanner.nextLine();

        validTypeCar(input);
    }

    public void carAdded(String company, String model){

        System.out.println(company +"added in stock!");
        System.out.println("Manufactered in");

    }

    public String typeOfCar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose car: Audi, BMW, Tesla or Mercedes");

        String input = scanner.nextLine();

        validTypeCar(input);
        return input;

    }


   /* public String classOfCar(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose class: Mid, High or Budget");
        String input = scanner.nextLine();

        invalidCommand(input);

        return input;
    }
    /*private boolean invalidCommand(String input){

        switch (input){

            case "Mid":

            case "High":

            case  "Budget":

                return true;
            default:
                classOfCar();

                return false;
        }
    }*/

    private boolean validTypeCar(String input){

        switch (input){

            case "Tesla":

            case "BMW":

            case  "Mercedes":

            case  "Audi":

                return true;
            default:
                return false;
        }
    }

}
