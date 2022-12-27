package lesson_4.HomeTask_3;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "April", "May", "June",
                "July", "August","September", "October", "November", "December"};
        Scanner input = new Scanner(System.in);
        System.out.println("Input month number:");
        int number = input.nextInt();
        switch (number) {
            case 1:
                System.out.println(months[0]);
                break;
            case 2:
                System.out.println(months[1]);
                break;
            case 3:
                System.out.println(months[2]);
                break;
            case 4:
                System.out.println(months[3]);
                break;
            case 5:
                System.out.println(months[4]);
                break;
            case 6:
                System.out.println(months[5]);
                break;
            case 7:
                System.out.println(months[6]);
                break;
            case 8:
                System.out.println(months[7]);
                break;
            case 9:
                System.out.println(months[8]);
                break;
            case 10:
                System.out.println(months[9]);
                break;
            case 11:
                System.out.println(months[10]);
                break;
            case 12:
                System.out.println(months[11]);
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
