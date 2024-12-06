package Lab_1.Exercise;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cube edge: ");
        int edge = scanner.nextInt();
        // Calculate the volume of cube
        double VOLUME = Math.pow(edge, 3);
        System.out.println("The volume of the given edge cube is: " + VOLUME);
        scanner.close();


    }
}
