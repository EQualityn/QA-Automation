package lesson_5.HomeTask_4;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find the interval");
        int number = input.nextInt();
        if (number < 0 || number > 100)
            System.out.println("Sorry, wrong input");
        else
            System.out.println("Number belongs to interval № " + Interval.findInterval(number));
    }
    public static int findInterval(int number){
        if (number < 15)
            return 1;
        if (number < 36)
            return 2;
        if (number < 51)
            return 3;
        // default number in [51:100]
            return 4;
        }

}
