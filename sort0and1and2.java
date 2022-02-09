package com.capgemini.day4;
import java.util.Scanner;
public class sort0and1and2 {
	public static int[] getArray() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static void main(String [] args) {
		int arr[]=getArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				continue;
			}
		    for(int j=i+1;j<arr.length;j++)
		    {
		    	if(arr[j]==0)
		    	{
		    		int temp = arr[j];
		    		arr[j]= arr[i];
		    		arr[i]=temp;
		    		break;
		    	}
		    }
		}
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]==1 || arr[i]==0)
			{
				continue;
			}
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]==1)
				{
					int temp = arr[j];
		    		arr[j]= arr[i];
		    		arr[i]=temp;
		    		break;
				}
			}
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
	}
}
