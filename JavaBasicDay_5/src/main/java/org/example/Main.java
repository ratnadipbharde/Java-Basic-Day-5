package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Flip Coin and print percentage of Heads and Tails");
        System.out.println("2. Leap Year");
        System.out.println("3. Power of 2");
        System.out.println("4. Harmonic Number");
        System.out.println("5. Factors");
        System.out.println("6. Java Program to Compute Quotient and Remainder");
        System.out.println("7. Java Program to Swap Two Numbers");
        System.out.println("8. Java Program to Check Whether a Number is Even or Odd");
        System.out.println("9. Java Program to Check Whether an Alphabet is Vowel or Consonant");
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
            case 6:
                obj.getQuotientAndRemainder();
                break;
            case 7:
                obj.swap();
                break;
            case 8:
                obj.isEven();
                break;
            case 9:
                obj.isVowel();
                break;
            default:
                System.out.println("invalid choice");
        }
    }

    private void isVowel() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Alphabet: ");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            System.out.println(ch + " is Vowel");
        else System.out.println(ch + " is Consonant");
    }

    private void isEven() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to check Even or Odd:");
        int number = sc.nextInt();
        if (number % 2 == 0) System.out.println(number + " is even Number");
        else System.out.println(number + " is odd Number");
    }

    private void swap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number :");
        int first = sc.nextInt();
        System.out.print("Enter 2nd Number :");
        int second = sc.nextInt();
        int temp = first;
        first = second;
        second = temp;
        System.out.println("After Swap");
        System.out.println("1st Number :" + first);
        System.out.println("2nd Number :" + second);
    }

    private void getQuotientAndRemainder() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend :");
        int dividend = sc.nextInt();
        System.out.print("Enter divisor :");
        int divisor = sc.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient is = " + quotient + " Remainder is = " + remainder);
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