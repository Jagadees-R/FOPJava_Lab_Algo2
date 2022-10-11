package com.CurrencyDenomination.Services;

public class NotesCount 
{
	public void count(int[] deno, int amount) 
	{
		int [] noteqty = new int[deno.length];
		for(int i = 0; i < deno.length; i++)
		{
			noteqty[i] = amount/deno[i];
			amount = amount%deno[i];
		}
		for(int i = 0; i < deno.length; i++)
		{
			if(noteqty[i]!=0)
			System.out.println(deno[i] + ":" + noteqty[i]);
		}
	}
}
