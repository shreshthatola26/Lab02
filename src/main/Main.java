package main;

import java.util.Scanner;
/**
 * @author Shrestha
 * @version 12.0.2
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user_name = scanner.nextLine().trim();
        System.out.println("Welcome," + user_name + "!");
        scanner.close();
    }
}

