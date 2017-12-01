package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {

        int count=0;
        int timesRunning=0;

        System.out.println("Enter the amount you want to run it: Only ints, and don't go too big!");
        Scanner kbinput = new Scanner(System.in);
        int control = kbinput.nextInt();

        for (int i=0; i<=control; i++){
            timesRunning++;

            boolean arr[]= new boolean[100];//duh, this does the below here.

            //for(int j=0; j<100; j++)//initialize boolean array as false
            //  arr[j]=false;

            boolean yes;

            while(true){

                Random rand = new Random();
                int x = rand.nextInt(100);//limits what random number is 1-100
                arr[x]=true;
                count++;

                yes=true;

                for(int k=0; k<100; k++){
                    if(arr[k]==false)
                        yes=false;//this runs the loop again
                }

                if(yes==true){
                    break;
                }

            }

        }
        int avg = count/timesRunning;
        System.out.println(avg);

    }
}

