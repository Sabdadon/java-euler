package com.Example.java;

public class Main {

    public static void main(String[] args) {

        long sum1= sumOfSquares();
        long sum2 = squareOfSums();
        System.out.println("The Difference between the sumOfSquares and squareofSum is " + (sum2-sum1));
    }

    private static long sumOfSquares(){
        long sum =0;
        for(int i=1;i<=100;i++)
        {
            sum += Math.pow(i,2);
        }
        return sum;
    }

    private static  long squareOfSums()
    {
        long sum =0;
        for(long i=1;i<=100;i++)
        {
            sum+=i;

        }
        return sum*sum;


    }
}
