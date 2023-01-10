package lesson_7;

import java.util.Arrays;
import java.util.Scanner;

public class AreArraysEqual {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Array #1");
        int [] array1 = initArray();
        System.out.println("Array #2");
        int [] array2 = initArray();
        System.out.println("Your arrays are:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            System.out.print(" ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("Are arrays equal?, method 1 - " + areEqual(array1,array2));
        System.out.println("Are arrays equal?, method 2 - " + areEqual2(array1,array2));
    }
    public  static int [] initArray(){
        System.out.println("Enter size of the array");
        int [] array = new int[scanner.nextInt()];
        System.out.println("Enter your array");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static boolean areEqual(int [] array1, int [] array2){
        if (array2.length!=array1.length)
            return false;
        else
            for (int i = 0; i < array1.length; i++) {
                if (array1[i]!=array2[i])
                    return false;
            }
            return true;
    }
    public static boolean areEqual2(int [] array1, int [] array2) {
    if (Arrays.equals(array1, array2))
        return true;
    return false;
    }
}
