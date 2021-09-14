/*
 * UCF COP3330 FALL 2021 Assignment 1 Solution
 * Copyright 2021 Alex Vorakrajangthiti
 */
import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {
        System.out.printf("What is the quote? ");
        Scanner scanner = new Scanner(System.in);
        String quote = scanner.nextLine();
        System.out.printf("Who said it? ");
        Scanner scanner1 = new Scanner(System.in);
        String who = scanner1.nextLine();
        System.out.printf(who + " says, " + '"'+quote+'"');
    }
}