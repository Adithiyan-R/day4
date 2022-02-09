package com.capgemini.day4;

import java.util.Scanner;

public class secondlargest {
	public static int[] getArray(){
    	Scanner s = new Scanner(System.in);
    	int n= s.nextInt();
    	int arr[] = new int[n];
    	for(int i=0;i<n;i++)
    	{
    		arr[i]=s.nextInt();
    	}
    	return arr;
    }
	public static void main(String[] args) {
		int arr[]=getArray();
		int max=arr[0];;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		int next_max=Integer.MIN_VALUE;
		for(int k=0;k<arr.length;k++)
		{
			if(next_max<arr[k] && arr[k]!=max)
			{
				next_max=arr[k];
			}
		}
		System.out.println(next_max);
	}
}
