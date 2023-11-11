package com.dami;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest/ PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte period = scanner.nextByte();
        int numberOfPayments = period * MONTHS_IN_YEAR;


        double mortgage_payment = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) /(Math.pow(1 + monthlyInterest, numberOfPayments) -1);


        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(mortgage_payment);

        System.out.println("Your month Mortgage payment is: " + result);

    }
}


