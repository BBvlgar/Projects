package OOPJAVA.CarDealership.Commands;

import OOPJAVA.CarDealership.BMWCars.BMW_530;
import OOPJAVA.CarDealership.BMWCars.BMW_X7;
import OOPJAVA.CarDealership.BMWCars.BMW_i3;
import OOPJAVA.CarDealership.TeslaCars.Tesla_3;
import OOPJAVA.CarDealership.TeslaCars.Tesla_X;

import java.util.Scanner;

public class Search {


    public Search(){

        String type = typeSearch();

        if (type.equals("Gas")){

            for (int i = 0; i < AddingCars.gasCars.size(); i++) {


                if(AddingCars.gasCars.get(i) instanceof BMW_530){
                    System.out.println("BMW 5");
                } else if (AddingCars.gasCars.get(i) instanceof BMW_X7){

                    System.out.println("BMW 7");
                }
                System.out.println(AddingCars.gasCars.get(i));

            }
        } else if (type.equals("Electric")){

            for (int i = 0; i < AddingCars.EVCars.size(); i++) {


                if(AddingCars.EVCars.get(i) instanceof BMW_i3){
                    System.out.println("BMW i3");
                } else if (AddingCars.EVCars.get(i) instanceof Tesla_3){

                    System.out.println("Tesla 3");
                } else if (AddingCars.EVCars.get(i) instanceof Tesla_X){
                    System.out.println("Tesla X");
                }
                System.out.println(AddingCars.EVCars.get(i));

            }

        }

        Command command = new Command();
    }



    public String typeSearch(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gas or Electric car");

        String input = scanner.nextLine();

        validate(input);

        return input;
    }

    public void validate(String input) {

        switch (input) {

            case "Gas":

            case "Electric":

                break;
            default:
                typeSearch();
                break;

        }
    }
}
