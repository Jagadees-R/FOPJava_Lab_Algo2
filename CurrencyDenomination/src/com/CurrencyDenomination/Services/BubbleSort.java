package com.CurrencyDenomination.Services;

public class BubbleSort
{
	public void sort(int[] deno)
	{
		int i,j,temp;
		for(i=0;i<deno.length-1;i++)
		{
			for(j=0;j<deno.length-1-i;j++)
			{
				if(deno[j]<deno[j+1])
				{		
						temp=deno[j];
						deno[j]=deno[j+1];
						deno[j+1]=temp;
				}
			}
		}
		
	}
}
