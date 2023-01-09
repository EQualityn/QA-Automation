package lesson_6.HomeTask_4;

import java.util.HashMap;
import java.util.Scanner;

public class Countries {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();
        int countriesAmount = 10;
        String country;
        String city;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < countriesAmount; i++) {
            System.out.println("Enter city");
            city = input.nextLine();
            System.out.println("Enter country");
            country = input.nextLine();
            if (countries.containsKey(city) && !countries.containsValue(country)) {
                System.out.println("The "+ city+ " city moves from " + countries.get(city) +" to " + country);
            }
            countries.put(city,country);
        }
        System.out.println("List of countries:");
        for (HashMap.Entry<String,String> entry: countries.entrySet()) {
            System.out.printf(entry.getValue()+", ");
        }
        System.out.println();
        countries.forEach((cit,cou) -> System.out.println(cit + "\t-\t" + cou));
        }
    }

