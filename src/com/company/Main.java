package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        ArrayList<Integer> arr= new ArrayList<Integer>();

        for(int i = 1; i <= num; i++){
            arr.add(i);
            System.out.println(arr);
        }
        for(int j = num-1; j >= 1; j--){
            arr.remove(j);
            System.out.println(arr);
        }




    }
}
