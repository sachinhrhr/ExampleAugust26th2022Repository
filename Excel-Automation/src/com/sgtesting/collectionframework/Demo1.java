package com.sgtesting.collectionframework;

import java.util.HashSet;

//Find the duplicate no in array/string, HashSet

//panogram
//String,collection feamework

//"Ranganath" n--2, r--1,a--3--Map

class B
{
	static HashSet<String> aa1(String a,HashSet<String > hSet,String action)
	{
		switch(action)
		{
		case "add":
			hSet.add(a);
			break;
		case "remove":
			hSet.remove(a);
			break;
		}
		return hSet;
	}
}
class A
{
	static HashSet<String> aa()
	{
		HashSet<String> obj=new HashSet<String>();
		obj.add("a");
		obj.add("aa");
		obj.add("1");
		return  obj;
	}
}
public class Demo1 {

	public static void main(String[] args) {
		HashSet<String> hSet=new HashSet<String>();
		B.aa1("KashmirApple", hSet, "add");
		B.aa1("PineApple", hSet, "add");
		B.aa1("OotyApple", hSet, "add");
		hSet=B.aa1("GreenApple", hSet, "add");
		System.out.println(hSet);
		hSet=B.aa1("GreenApple", hSet, "remove");
		System.out.println(hSet);
		
	}

}
