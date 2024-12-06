package Lab_1.Exercise;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Your name is " + name + " and your age is " + age);
        scanner.close();

    }
}
