package com.capgemini.day4;
import java.util.Scanner;
public class sort0and1 {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0)
			{
				continue;
			}
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]==0)
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					break;
				}
			}
		}
		for(int k=0;k<n;k++)
		{
			System.out.println(arr[k]);
		}
	}
}
