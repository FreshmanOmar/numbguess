package com.LickingHeights;

import java.util.Scanner;

public class NumbGuess {
    public static void main(String[] args) {
        System.out.println("pick a number from 1 to 100");
        Guesser();
    } public static String Guesser() {
        //declare
        String highest , high , highClose , right , lowClose , low , lowest;
        Scanner input;
        input = new Scanner(System.in);
        int inputnumb;
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
        highest = "Way too high";
        high = "Too high";
        highClose = "A little less";
        right = "You got it!!";
        lowClose ="A little more";
        low = "Too low";
        lowest = "Way too low";

        inputnumb = input.nextInt();
        if (inputnumb >= twentyOrMore && inputnumb < thirtyOrMore) {
            return high;
        }
        if (inputnumb >= thirtyOrMore) {
           return highest;
        }
        if (inputnumb > randomnumb && inputnumb <= threemore) {
            return highClose;
        }
        if (inputnumb <= negTwentyOrLess && inputnumb > negThirtyOrLess) {
            return low;
        }
        if (inputnumb <= negThirtyOrLess) {
            return lowest;
        }
        if (inputnumb < randomnumb && inputnumb >= negThreeLess) {
            return lowClose;
        }
        if (inputnumb == randomnumb){
            return right;}
}
    }






