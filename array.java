package com.capgemini.day4;

//sum of all elements in the array

import java.util.Scanner;
public class array {
	public static void main(String args []) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n= s.nextInt();
		int sum=0;
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
        {
			arr[i]=s.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			sum=sum+arr[j];
		}
		System.out.println(sum);		
	}
}
