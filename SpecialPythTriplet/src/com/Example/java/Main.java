package com.Example.java;

public class Main {

    public static void main(String[] args) {
       Integer a =0,b=0,c=0;

        for(a=1;a<500;a++)
            for(b=100;b<500;b++)
                for(c=100;c<500;c++)
                    if(isPythagoreanTriplet(a,b,c)&&secondCondition(a,b,c))
                    {
                        System.out.println("a :" +a+"b :"+b+"C :"+c);
                        System.out.println("Product is " +(a*b*c));
                    }



    }

 private static boolean isPythagoreanTriplet(Integer a, Integer b, Integer c)
 {
     return (Math.pow(a,2)+Math.pow(b,2) == Math.pow(c,2));

 }

 private static boolean secondCondition(Integer a,Integer b, Integer c)
 {
     return (a+b+c ==1000);
 }
}
