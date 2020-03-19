package com.kurylchyk.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Numbers {

    private final int to;
    private final int from;
    private Integer[] fibonacci;
    public Numbers (int from,int to){

        this.from = from;
        this.to = to;
    }

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
