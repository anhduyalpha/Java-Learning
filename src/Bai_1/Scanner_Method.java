package Bai_1;

import java.util.Scanner;

public class Scanner_Method {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter your age: ");
        int age = input.nextInt();
        System.out.printf("Enter your name: ");
        String name = input.next();

        System.out.println("Your age is " + age);
        System.out.println("Your name is " + name);

        input.close();
    }
}

