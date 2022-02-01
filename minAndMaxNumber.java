package com.capgemini.day4;

import java.util.Scanner;

public class minAndMaxNumber {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int arr[]= new int [n];
		
		//input from user
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+i+" th element");
			arr[i]=s.nextInt();
		}
		
		int max=  Integer.MIN_VALUE;
		int min= Integer.MAX_VALUE;
		
		//max value
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		//min value
		for(int i=0;i<n;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		
		//printing the values
		System.out.println("The max value in the array is "+max);
		System.out.println("The min value in the array is "+min);

	}

}
