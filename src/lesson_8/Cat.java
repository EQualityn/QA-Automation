package lesson_8;

import java.util.Scanner;

public class Cat {

    private int age;
    private String name;
    private String color;
    private Scanner input = new Scanner(System.in);
    Cat(String name, String color, int age) {
        setName(name);
        setColor(color);
        setAge(age);
    }
    public void setName(String name) {

        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        while (age < 0 || age > 30){
            System.out.println("Enter correct age");
            age = input.nextInt();
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return "Cat{name = "+ this.name +","+ " color = " + this.color +","+ " age = " +age+"}";
    }
}
