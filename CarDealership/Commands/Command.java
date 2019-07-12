package OOPJAVA.CarDealership.Commands;

import java.util.Scanner;

public class Command {

    Command() {

        String input = input();

            switch (input) {
                case "add":
                    AddingCars addingCars = new AddingCars();
                    break;
                case "search":

                    Search search = new Search();
                    break;
                default:
                    break;
            }
    }

    public  String input(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type:add or search");
        String input = scanner.nextLine();

        invalidCommand(input);

        return input;
    }

    private boolean invalidCommand(String input){

        switch (input){

            case "add":
            case "search":
                return true;
            default:
                input();

                return false;
        }
    }
}
