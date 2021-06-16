package com.company;

import java.util.Scanner;

public class FizzBuzz {
    private static final String MESSAGE_FIZZ = "FIZZ";
    private static final String MESSAGE_BUZZ = "BUZZ";
    private static final String MESSAGE_FIZZBUZZ = "FIZZBUZZ";
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int number= scanner.nextInt();
        boolean isDivisibleBy3= number%3==0;
        boolean isDivisibleBy5= number%5==0;
        if(isDivisibleBy3){
            System.out.println(MESSAGE_FIZZ);
        }else if(isDivisibleBy5){
            System.out.println(MESSAGE_BUZZ);
        }else if(isDivisibleBy3&&isDivisibleBy5){
            System.out.println(MESSAGE_FIZZBUZZ);
        }
    }
}
