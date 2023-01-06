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
            while (countries.containsKey(city)) {
                System.out.println("Input another city, please. This one already exists.");
                city = input.nextLine();
            }
            System.out.println("Enter country");
            country = input.nextLine();
           /* while (countries.containsValue(country)) {
                System.out.println("Input another country, please. This one already exists.");
                country = input.nextLine();
            }*/
            countries.put(city,country);
        }
        System.out.println("List of countries:");
        for (HashMap.Entry<String,String> entry: countries.entrySet()) {
            System.out.printf(entry.getValue()+", ");
        }
        countries.forEach((cit,cou) -> System.out.println(cit + "\t" + cou));
        }
    }

