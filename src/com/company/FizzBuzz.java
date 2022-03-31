package com.company;

public class FizzBuzz {

    public void runFizzBuzz(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (i % 3 == 0 & i % 5 == 0) System.out.println(i + " FizzBuzz");
            else if (i % 3 == 0){
                System.out.println(i + " Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            }
        }
    }
}
