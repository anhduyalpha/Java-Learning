package Lab_1.Exercise;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of rectangle: ");
        int width = scanner.nextInt();

        System.out.print("Enter the length of rectangle: ");
        int length = scanner.nextInt();

        // Calculate circumference
        int C_square = (width + length) * 2;
        // Calculate area
        int S_square = width * length;
        // Find the min edge
        int min_edge = Math.min(width,length);

        // Print the result
        System.out.println("The circumference is: " + C_square);
        System.out.println("The area is: " + S_square);
        System.out.println("The min_edge is: " + min_edge);

        scanner.close();


    }
}
