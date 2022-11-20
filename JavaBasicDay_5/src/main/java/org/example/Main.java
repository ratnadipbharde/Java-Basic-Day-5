package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
       // 1. Flip Coin and print percentage of Heads and Tails
        obj.flipCoin();
        System.out.println("---------------------------------");
        //2. Leap Year
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year to check leap year or not : ");
        int year=sc.nextInt();
        obj.leapYear(year);
        System.out.println("---------------------------------");
    }

    private void leapYear(int year) {

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println(year+" is a leap year");
        else
            System.out.println(year+" is not a leap year");
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
        System.out.println("head = "+head+"  Tails = "+tail);
        double headPercentage = head * 100 / flip;
        double tailPercentage = tail * 100 / flip;
        System.out.println("head percentage:"+headPercentage);
        System.out.println("tails percentage:"+tailPercentage);
    }
}