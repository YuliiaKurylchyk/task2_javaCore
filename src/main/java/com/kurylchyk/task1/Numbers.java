package com.kurylchyk.task1;

import java.util.ArrayList;

/**
 * Class Numbers that represents the odd and even numbers in the interval
 *
 */

public class Numbers {

    /**
     * Stands for the begging of the interval.
     */
    private final int to;
    /**
     * Stands for the end of the interval.
     */
    private final int from;

    /**
     * array which will contains the sequence of fibonacci numbers.
     */
    private Integer[] fibonacci;

    /**
     * Constructor, which initialize 2 fields.
     *
     * @param from
     * @param to
     */
    public Numbers (int from,int to){
        this.from = from;
        this.to = to;
    }

    /**
     * Prints the odd numbers in the interval.
     */
    public void printOdd(){

        int pointer = from;
        System.out.print("Odd: ");
        while(pointer<=to) {
            if(pointer%2!=0){
                System.out.print(pointer + "\t");
            }
            pointer++;
        }
        System.out.println();
    }

    /**
     * Prints the even numbers in the interval.
     */
    public void printEven(){

        int pointer = from;
        System.out.print("Even: ");
        while(pointer<=to) {
            if(pointer%2==0){
                System.out.print(pointer + "\t");
            }
            pointer++;
        }
        System.out.println();
    }

    /**
     * Calculate the sum of odd numbers.
     * @return the sum of odd numbers
     */
    public int sumOfOdd(){

        int pointer = from;
        int sumOfOdd = 0;
        while(pointer<=to) {
            if(pointer%2!=0) {
                sumOfOdd += pointer++;
            }
        }
        return sumOfOdd;
    }

    /**
     * Calculate the sum of odd numbers.
     * @return the sum of even numbers
     */
    public int sumOfEven(){

        int pointer = from;
        int sumOfEven = 0;
        while(pointer<=to) {
            if(pointer%2==0) {
                sumOfEven += pointer++;
            }
        }
        return sumOfEven;
    }


    /**
     * Calculates the fibonacci numbers and add it to the ArrayList.
     * Than initialize the @link fibonacci array.
     * Prints all the numbers.
     */
    public void printFibonacci () {

        ArrayList<Integer> fibonacciSequence  = new ArrayList<Integer>();
        fibonacciSequence.add(1);
        fibonacciSequence.add(1);

        int value = from;
        int index = 1;
        while (value<=to){

            value =fibonacciSequence.get(index)+ fibonacciSequence.get(index-1);
            index++;
            fibonacciSequence.add(value);
        }

        fibonacci = new Integer[fibonacciSequence.size()];
        System.out.print("Fibonacci sequence: ");
         fibonacciSequence.toArray(fibonacci);
        for(int i: fibonacci ){
            System.out.print(i+"\t");
        }
        System.out.println();

    }

    /**
     * Counts the percentage of odd and even numbers in @link fibonacci.
     * Prints the percentage.
     */

    public void getPercentage(){

        int countOfEven = 0;
        int countOfOdd = 0;

        for(int i : fibonacci) {

            if(i%2==0){
                countOfEven++;
            } else if(i%2!=0){
                countOfOdd++;
            }
        }

        System.out.printf("Percentage of odd %f \n", ((double)countOfOdd)/fibonacci.length *100 );
        System.out.printf("Percentage of even %f \n", ((double)countOfEven)/fibonacci.length *100 );
    }
}
