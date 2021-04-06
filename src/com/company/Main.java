package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int array [] = {1,3,5,7,9};
        int min = array[0];
        for (int i = 1; i < array.length ; i++) {
            if(min > array[i]){
                min = array[i];
            }
        }
        System.out.println(" min = " + min);
    }
}
