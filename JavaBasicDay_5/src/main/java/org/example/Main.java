package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Problem Number : ");
        Scanner sc = new Scanner(System.in);
        int probNumber = sc.nextInt();
        Main obj = new Main();
        switch (probNumber) {
            case 1:
                obj.flipCoin();
                break;
            case 2:
                obj.leapYear();
                break;
            case 3:
                obj.powerOfTwo();
                break;
            case 4:
                obj.harmonicNumber();
                break;
            case 5:
                obj.primeFactor();
                break;
            default:
                System.out.println("invalid choice");
        }
    }

    private void primeFactor() {
        System.out.println("Enter number :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Factor is :-");
        for (int i = 2; i < number; i++) {
            while (number % i == 0) {
                System.out.println(i + " ");
                number = number / i;
            }
        }
        if (number > 2) {
            System.out.println(number);
        }
    }

    private void harmonicNumber() {
        System.out.println("Enter number to Prints the Nth harmonic number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double harmonicNumber = 0;
        for (int i = 1; i <= number; i++) {
            harmonicNumber = harmonicNumber + (double) 1 / i;
        }
        System.out.println("Harmonic number is = " + harmonicNumber);
    }

    private void powerOfTwo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        for (int i = 0; i <= number; i++) {
            int table = (int) Math.pow(2, i);
            System.out.println(table);
        }
    }

    private void leapYear() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year to check leap year or not : ");
        int year = sc.nextInt();
        int digit = (int) Math.floor(Math.log10(year) + 1);
        if (digit == 4) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                System.out.println(year + " is a leap year");
            else System.out.println(year + " is not a leap year");
        } else System.out.println("invalid year");
    }

    private void flipCoin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value how many time coin Flip: ");
        int flip = sc.nextInt();
        int head = 0;
        int tail = 0;
        for (int n = 0; n < flip; n++) {
            int value = (int) (Math.floor(Math.random() * 10) % 2);
            if (value == 0) tail++;
            else head++;
        }
        System.out.println("head = " + head + "  Tails = " + tail);
        double headPercentage = head * 100 / flip;
        double tailPercentage = tail * 100 / flip;
        System.out.println("head percentage:" + headPercentage);
        System.out.println("tails percentage:" + tailPercentage);
    }
}