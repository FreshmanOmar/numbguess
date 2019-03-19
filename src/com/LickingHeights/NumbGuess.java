package com.LickingHeights;

import java.util.Scanner;

public class NumbGuess {
    public static void main(String[] args) {
        Scanner input;
        System.out.println("pick a number from 1 to 100");
        Guesser(input = new Scanner(System.in);)
    }
    }


    public static void Guesser(int inputnumb) {
        //declare
        int randomnumb;
        int twentyOrMore, thirtyOrMore, threemore,negTwentyOrLess,negThirtyOrLess,negThreeLess;
        //initialize
        randomnumb = (int) (Math.random() * 100);
        System.out.println(randomnumb);
        twentyOrMore = randomnumb + 20;
        thirtyOrMore = randomnumb + 30;
        threemore = randomnumb + 3;
        negTwentyOrLess = randomnumb - 20;
        negThirtyOrLess = randomnumb -30;
        negThreeLess = randomnumb -3;
        if (inputnumb >= twentyOrMore && inputnumb < thirtyOrMore) {
                System.out.println("too high");
            }
            if (inputnumb >= thirtyOrMore) {
                System.out.println(" Way too high");
            }
            if (inputnumb > randomnumb && inputnumb <= threemore) {
                System.out.println("a little less");
                if (inputnumb >= twentyOrMore && inputnumb < thirtyOrMore) {
                    System.out.println("too low");
                }
                if (inputnumb >= thirtyOrMore) {
                    System.out.println(" Way too low");
                }
                if (inputnumb > randomnumb && inputnumb <= negThreeLess) {
                    System.out.println("a little more");


        }
    }
}