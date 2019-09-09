package com.ImAwesome;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
         //prompt Users  for  input
        System.out.print("Enter loan Amount:");
        int  loanAmount = input.nextInt();
        System.out.print("Enter numberof Years:");
        int numberYear = input.nextInt();
        System.out.print("Enter Annual Interest Rate:");
        float annualRate = input.nextFloat();

        double monthlyrate= annualRate/1200.0;
        double monthlyPayment = loanAmount*monthlyrate/(1 -1/Math.pow(1+monthlyrate,numberYear*12));


        System.out.printf("%6.3f",monthlyPayment);



    }
}
