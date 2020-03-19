package com.kurylchyk.task1;


/**
 * The main class, that contains only main fuction
 * @author Yuliia Kurylchyk
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        Numbers numbers = new Numbers(5,20);
        numbers.printEven();
        numbers.printOdd();
        numbers.printFibonacci();
        numbers.getPercentage();

    }
}
