package com.Example.java;

public class Main {

    public static void main(String[] args) {

        int i=0;
        int number =1;
        boolean isSmallest = false;


        while(!isSmallest) {
            for (i = 1; i <=20;i++)
            {

                if(number%i!=0)
                {
                    number++;
                    i=1;
                }
                else if(i==20)
                {
                    System.out.println("Smallest number divisible by 1 to 20 without any remainder is : 232792560" +number);
                    isSmallest = true;
                }

            }
        }


    }
}
