package com.Example.java;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {

        System.out.println("\nHey fellas\n");
        // write your code here

        long firstNumber=999,secondNumber;
        List palindromeList = null;
        while(firstNumber>100)
        {
            secondNumber=999;
            while(secondNumber >100)
            {
                if(isPalindrome((firstNumber*secondNumber)))
                {
                    System.out.println("The Largest Palindrome Number is   " +firstNumber +"*" +secondNumber + "=" +(firstNumber*secondNumber));

                    break;
                }
                secondNumber--;


            }
            firstNumber --;

        }

    }

    public  static boolean isPalindrome(long number)
    {
        long temp = number;
        int i=-1;
        while(temp!=0)
        {
            if(temp!=0)
            {
                i++;
                temp/=10;
            }
        }
        temp = number;
        long reverseNumber =0;
        while(temp>0)
        {
            reverseNumber += temp%10 * Math.pow(10,i--);
            temp/=10;
        }
        if(number == reverseNumber)
        {
            return true;
        }

        return false;

    }


}
