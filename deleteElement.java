package com.capgemini.day4;

//delete an element in the array

import java.util.Scanner;
public class deleteElement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of indices");
		int n=s.nextInt();
		int arr[] = new int[n];
		
		//input from user
		for(int i=0;i<n;i++) 
		{
			System.out.println("Enter "+i+" th element");
			arr[i]=s.nextInt();
		}
		
		System.out.println("Enter the element to be deleted");
		int del = s.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]==del)
			{
				arr[i]=0;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}

}
