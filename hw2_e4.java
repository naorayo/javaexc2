package Homework02;

import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner iScaner = new Scanner(System.in);
        String str = iScaner.nextLine();
        str = str.trim();
        if(str.isEmpty())
            throw new IllegalArgumentException("The line is empty.");
        else
            System.out.println(str);
    }
}