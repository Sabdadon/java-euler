package com.Example.java;

public class Main {

    public static void main(String[] args) {

        long numberOfPrimes=0;
        long number =2;
        long startTime = System.currentTimeMillis();
        while(numberOfPrimes!=10001)
        {

            if(checkPrime(number++))
            {
                numberOfPrimes++;
                if(numberOfPrimes==10001)
                {
                    System.out.println("\n The 100001 th Prime number is " +number);
                    System.ou
                }
            }

        }


    }

    private  static boolean checkPrime(long number)
    {
        boolean isPrime =true;
        for(int i=2;i<number;i++)
        {
            if(number%i==0)
            {
               isPrime =false;

            }


        }
     return isPrime;
    }
}
