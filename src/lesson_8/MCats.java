package lesson_8;

import java.util.ArrayList;
import java.util.Scanner;

public class MCats {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        Scanner input = new Scanner(System.in);
            cats.add(new Cat("Atos", "Black", 8));
            cats.add(new Cat("Portos", "Gray", 9));
            cats.add(new Cat("Aramis","White", 7));
            cats.add(new Cat("D'artanjan", "Blue", 6));
            cats.add(new Cat("Monsieur Rischelleux", "Red", 15));
            System.out.println("Enter Cat's name, color, age. Each parameter on a new line");
            cats.add(new Cat(input.next(), input.next(), input.nextInt()));
            cats.forEach((Cat cat) -> System.out.println(cat.toString()));
    }
}
