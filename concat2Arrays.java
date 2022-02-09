package com.capgemini.day4;

//Concatenate two arrays

import java.util.Scanner;
public class concat2Arrays {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		int n1=s.nextInt();
		int arr1[]=new int[n1];
		for(int i=0;i<n1;i++)
		{
			arr1[i]=s.nextInt();
		}
		int n2=s.nextInt();
		int arr2[]=new int[n2];
		for(int i=0;i<n2;i++)
		{
			arr2[i]=s.nextInt();
		}
		int arr3[]=new int[n2+n1];
		int temp1=n1;
		int l=0;
		for(int i=0;i<n2+n1;i++)
		{
			if(temp1>0)
			{
				arr3[i]=arr1[i];
				temp1--;
			}
			else
			{
				arr3[i]=arr2[l];
				l++;
			}
		}
		for(int k=0;k<n1+n2;k++)
		{
			System.out.println(arr3[k]);
		}
	}
}
