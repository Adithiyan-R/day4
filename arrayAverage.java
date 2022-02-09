package com.capgemini.day4;

//average of all elements in the array

import java.util.Scanner;

public class arrayAverage {
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
    	int n= s.nextInt();
    	int arr[] = new int[n];
    	for(int i=0;i<n;i++)
    	{
    		arr[i]=s.nextInt();
    	}
    	int sum =0;
    	for(int i=0;i<n;i++)
    	{
    		sum = sum +arr[i];
    	}
    	System.out.println(sum/arr.length);
    }
}
