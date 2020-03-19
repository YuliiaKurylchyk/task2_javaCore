package com.kurylchyk.task1;

public class Numbers {

    private int to;
    private  int from;

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
}
