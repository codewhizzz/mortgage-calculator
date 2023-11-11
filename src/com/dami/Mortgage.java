package com.dami;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principal = 0;
        float annualInterest = 0;
        int year = 0;
        int numberOfPayments = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if ((principal >= 1000) && (principal <= 1_000_000))
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000");
        }
        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterest = scanner.nextFloat();
            if ((annualInterest > 0) && (annualInterest <=100))
                break;
            System.out.println("Enter a number between 1 and 100");
            }

        float monthlyInterest = annualInterest/ PERCENT / MONTHS_IN_YEAR;

        while (true) {
            System.out.print("Period (Years): ");
            year = scanner.nextByte();
            if ((year >= 1) && (year <= 30))
                numberOfPayments = year * MONTHS_IN_YEAR;
            break;
        }

        double mortgage_payment = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) /(Math.pow(1 + monthlyInterest, numberOfPayments) -1);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(mortgage_payment);

        System.out.println("Your monthly Mortgage payment is: " + result);

    }
}


