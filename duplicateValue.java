package com.capgemini.day4;

//duplicate elements in the array

import java.util.Scanner;
public class duplicateValue {

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
		
		for(int i=0;i<n;i++)
		{
			int count = 0;
			int flag=0;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					flag =1;
					count++;
				}
			}
			if(flag==1)
			{
				System.out.println(arr[i]+" is duplicated "+count+" times");
			}
		}
	}

}
