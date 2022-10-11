package com.CurrencyDenominations.Main;

import java.util.Scanner;

import com.CurrencyDenomination.Services.BubbleSort;
import com.CurrencyDenomination.Services.NotesCount;

public class DriverClass 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of Currency Denominations in the country : ");
		int size = sc.nextInt();
		int []deno = new int[size];
		System.out.println("Enter the Currency Denomination values : ");
		for(int i=0; i<size; i++)
		{
			deno[i]=sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		BubbleSort bs = new BubbleSort();
		bs.sort(deno);
		NotesCount nc = new NotesCount();
		nc.count(deno,amount);
		sc.close();	
	}
}
