package com.capgemini.day4;
import java.util.Scanner;
public class largestElement {
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
    public static void main(String args[]) {
    	int arr[]=getArray();
    	int max = Integer.MIN_VALUE;
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]>max)
    		{
    			max=arr[i];
    		}
    	}
    	System.out.println(max);
    }
}
