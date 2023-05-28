package com.vti.demo;

import java.util.Random;

public class Ex1Ques1 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(99999-1000)+1000;
        String y = String.valueOf(x);
        int lengthOfString = y.length();
        for (int i = 0; i < 5 - lengthOfString; i++) {
            y = "0" + y;
        }
        System.out.println("Result : " + y);


//        System.out.println( y.substring(3));


        if(x%100 < 10){
            System.out.println("0" + x%100);
        }else {
            System.out.println(x%100);
        }
    }
}
