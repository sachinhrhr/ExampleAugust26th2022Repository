package com.sgtesting.tests;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
	//	tokenizerTesting1();
		tokenizerTesting2();
	//	getTokensCount();
	}
	
	private static void tokenizerTesting1()
	{
		StringTokenizer strTokens=new StringTokenizer("Orange Mango Apple Banana"," ");
		while(strTokens.hasMoreTokens())
		{
			System.out.println(strTokens.nextToken());
		}
	}
	
	private static void tokenizerTesting2()
	{
		StringTokenizer strTokens=new StringTokenizer("Orange Mango Apple Banana"," ");
		while(strTokens.hasMoreElements())
		{
			System.out.println(strTokens.nextElement());
		}
	}

	private static void getTokensCount()
	{
		StringTokenizer strTokens=new StringTokenizer("Orange Mango Apple Banana"," ");
		int count=strTokens.countTokens();
		System.out.println("# of Tokens :"+count);
	}
}
