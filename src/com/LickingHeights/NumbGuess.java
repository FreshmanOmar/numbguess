package com.LickingHeights;

import java.util.Scanner;

public class NumbGuess {
    public static void main(String[] args) {
        System.out.println("Pick a number from 1 to 100 You only get Two chances");
        Guesser();
    } public static void Guesser() {
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
            System.out.println(high);
        }
        if (inputnumb >= thirtyOrMore) {
            System.out.println(highest);
        }
        if (inputnumb > randomnumb && inputnumb <= threemore) {
             System.out.println(highClose);
        }
        if (inputnumb <= negTwentyOrLess && inputnumb > negThirtyOrLess) {
            System.out.println(low);
        }
        if (inputnumb <= negThirtyOrLess) {
             System.out.println(lowest);
        }
        if (inputnumb < randomnumb && inputnumb >= negThreeLess) {
             System.out.println(lowClose);
        }
        if (inputnumb == randomnumb){
            System.out.println(right);
        }
        if (inputnumb >= 101 || inputnumb <= 0){
            System.out.println("I SAID BETWEEN 1 AND 100 try again");
        }


    }
    }






