package com.Example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Long sum =2L;
        for (Long l=3L;l<2000000;l+=2)
        {
            if(isPrime(l))
            {
                System.out.println(l);
                sum+=l;
            }
        }
        System.out.println("The sum of Primes below 2M is : "+sum);
    }

    private static boolean isPrime(Long i)
    {
        for(Long j=2L;j<i;j++)
        {
            if(i%j==0)
            {
                return false;
            }
        }
        return true;

    }
}
