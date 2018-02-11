package com.Example.java;



public class Main {

    public static void main(String[] args)
    {

        int number=0;
        int i=1;

        while(NumberOfDivisors(number) < 500){
            number += i;
            i++;
        }

        System.out.println("The number with more than 500 divisors"+number);

    }
    private static int NumberOfDivisors(int number) {
        int nod = 0;
        int sqrt = (int) Math.sqrt(number);

        for(int i = 1; i<= sqrt; i++){
            if(number % i == 0){
                nod += 2;
            }
        }
        //Correction if the number is a perfect square
        if (sqrt * sqrt == number) {
            nod--;
        }

        return nod;
    }



}
