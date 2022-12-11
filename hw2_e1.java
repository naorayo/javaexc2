package Homework02;
import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter a fractional number: ");
        while (!iScanner.hasNextFloat()) {
            System.out.print("You didn't enter a fractional number, try again: ");
            iScanner.next();
        }
        System.out.printf("You have entered: %f", iScanner.nextFloat());
        iScanner.close();
    }
}