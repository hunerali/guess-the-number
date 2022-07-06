package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Let the game begin! ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        Random rd = new Random();
        int rdNumber = rd.nextInt(101);
        int[] arr = new int[101];
        int i = 0;
        while (true) {
            System.out.print("Enter number: ");
            int number = sc.nextInt();

            if (number < 0 || number > 100) {
                System.out.println("Number can not be lower than zero or bigger than 100.Please, try again.");
                continue;
            }

            boolean contains = false;
            for (int j = 0; j < arr.length; j++) {
                if (number == arr[j]) {
                    contains = true;
                }
            }

            if(!contains){
                arr[i++] = number;
            }else{
                System.out.println("Number already checked!Please try again!");
                continue;
            }

            if (number == rdNumber) {
                System.out.println("Congratulations, " + name + "!");
                break;
            } else if (number > rdNumber) {
                System.out.println("Your number is too big. Please, try again");
            } else {
                System.out.println("Your number is too small. Please, try again");
            }

            System.out.print("Your numbers are: ");
            for (int j = 0; j < i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println("");
        }

    }
}
