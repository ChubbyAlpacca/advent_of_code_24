package org.aoc.controller;

import org.aoc.service.Day1;

import java.util.Scanner;

public class Controller {

     private Day1 day1;

    public Controller() {
        // Initialize day1 here
        this.day1 = new Day1();
    }


    public void runController() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the project!");
        System.out.println("What day are you looking for?");
        String input = scanner.nextLine();

        switch (input) {
            case "1":
                day1.calculateDifference("src/main/resources/day1input.txt");
                break;
            default:
                System.out.println("Cannot find a day from that number...");
        }
    }

}
