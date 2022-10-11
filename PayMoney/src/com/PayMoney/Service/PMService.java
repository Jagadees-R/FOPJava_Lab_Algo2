package com.PayMoney.Service;

public class PMService 
{
	public static int calc(int[] arr, int targetVal) 
	{
		int val=0,no_of_transc=0;
		for(int i=0;i<arr.length;i++)
		{
			val=val+arr[i];
			if(val>targetVal)
			{
				no_of_transc=i+1;
				break;
			}
		}
		if(val<targetVal)
		{
			no_of_transc=-1;
		}
		return no_of_transc;
	}
}