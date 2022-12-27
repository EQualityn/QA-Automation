package lesson_4;

import java.util.Scanner;

public class UserSystem {
    public static void main(String[] args) {
        String username = "Admin";
        String password = "P@ssword";
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your username:");
        String userInput = input.nextLine();
        if (username.equals(userInput)) {
            System.out.println("Please, enter your password");
            userInput = input.nextLine();
            if (password.equals(userInput))
                System.out.println("Здравствуйте " + username + ", Вы вошли в систему.");
            else
                System.out.println("Вы ввели неверный пароль!");
        }
        else
            System.out.println("Нет пользователя с таким именем!");

    }

}
