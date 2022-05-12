package com.aman;

public class TryCatch {

    public static void main(String[] args) {
	// write your code here
        String [] cars = {"maruti","hundai"};
        try{
            System.out.println(cars [1]);
        }
        catch (Exception e){
            System.out.println(e);
        }

        System.out.println("masoom");
    }
}
