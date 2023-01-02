package lesson_5.HomeTask_4;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");
        System.out.println("Avg value of 100 numbers is = " + countAvg(100));
        //task 2
        System.out.println("Task 2");
        System.out.println("Enter the number to find the interval");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number < 0 || number > 100)
            System.out.println("Sorry, wrong input");
        else
            System.out.println("Number belongs to interval № " + Interval.findInterval(number));
        //task 3
        System.out.println("Task 3");
        String username = "username";
        String password = "password";

        System.out.println("Please, enter your name.");
        String userInput = input.next();
        int attemptsName = 1;
        int attemptsPass = 0;
        boolean isNameCorrect = false;
        while (attemptsName!=5 && attemptsPass!=5){
            if (userInput.equals(username) || isNameCorrect)
            {
                isNameCorrect = true;
                System.out.println("Please, enter your password. You have " + (5-attemptsPass) + " attempts left");
                userInput = input.next();
                if (userInput.equals(password))
                {
                    System.out.println("Access granted");
                    return;
                }
                else
                    attemptsPass++;
            }
            if (!isNameCorrect) {
                System.out.println("Please, enter your name. You have " + (5 - attemptsName) + " attempts left");
                userInput = input.next();
                attemptsName++;
            }

        }
        System.out.println("Access denied");
    }
    public static double countAvg (int size){
        double sum = 0;
        for (int i = 0; i <= size; i++) {
            sum += i;
        }
        return sum/size;
    }

}
