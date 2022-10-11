package com.PayMoney.Main;

import java.util.Scanner;

import com.PayMoney.Service.PMService;

public class DriverClass 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the transaction array : ");
		int size = sc.nextInt();
		System.out.println("Enter the values of the array : ");
		int []arr = new int[size];
		for(int i=0;i<size;i++) 
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved : ");
		int target = sc.nextInt();
		for(int i=0;i<target;i++)
		{
			System.out.println("Enter the value of target : ");
			int targetVal = sc.nextInt();
			int value = PMService.calc(arr,targetVal);
			if(value!=-1)
			{
				System.out.println("Target achieved after "+value +"transcation ");
			}
			else
			{
				System.out.println("Given target is not achieved");
			}
		}
		sc.close();
	}

}
