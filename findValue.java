package com.capgemini.day4;
import java.util.Scanner;
public class findValue {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of indices");
		int n = s.nextInt();
		System.out.println("Enter the value to be found");
		int v= s.nextInt();
		int arr[]= new int [n];
		
		//input from user
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+i+" th element");
			arr[i]=s.nextInt();
		}
		int index=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==v)
			{
				index= i;
			}
		}
		System.out.println(index+"th element");
	}
}
