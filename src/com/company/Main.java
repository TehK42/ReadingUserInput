package com.company;

import java.util.Scanner;

public class Main {
    public static final int CURRENT_YEAR = 2021;

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("What year were you born?");

        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("What is your name?");
            String name = scanner.nextLine();
            int age = CURRENT_YEAR - yearOfBirth;

            if (age >= 0 && age <= 100){
                System.out.println("Your name is " + name + " and, you are " + age + " years old");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }

        scanner.close();
    }
}
