package lesson_5.HomeTask_4;

import java.util.Scanner;


public class UserSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        String username = "username";
        String password = "password";

        System.out.println("Please, enter your name.");
        String userInput = input.next();
        int attemptsName = 1;
        int attemptsPass = 0;
        while (attemptsName!=5) {
            if (userInput.equals(username)) {
            while (attemptsPass!=5) {
                    System.out.println("Please, enter your password. You have " + (5 - attemptsPass) + " attempts left");
                    userInput = input.next();
                    if (userInput.equals(password)) {
                        System.out.println("Access granted");
                        return;
                    } else
                        attemptsPass++;
                        }
                    }
            else {
                    System.out.println("Please, enter your name. You have " + (5 - attemptsName) + " attempts left");
                    userInput = input.next();
                    attemptsName++;
            }
        }
        System.out.println("Access denied");
    }
}
