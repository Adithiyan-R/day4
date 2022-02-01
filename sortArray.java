package com.capgemini.day4;

import java.util.Scanner;

public class sortArray {

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
		
		//sort
		for(int i=0;i<n;i++)
		{
			int min = arr[i];
			int index = 0;
			int count=0;
			for(int j=i+1;j<n;j++)
			{
				if(min>arr[j])
				{
					count=1;
					min = arr[j];
					index =j;
				}
			}
			
			//sorting every index element
			//System.out.println(arr[index]+" index"+arr[i]+" ith");
			if(count==1)
			{
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}

}
