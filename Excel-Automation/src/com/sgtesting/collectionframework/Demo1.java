package com.sgtesting.collectionframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

//Find the duplicate no in array/string, HashSet
//panogram
//String,collection feamework

//"Ranganath" n--2, r--1,a--3--Map
class B
{
	static ArrayList<String> aa1(String a,ArrayList<String> alo,String action,int b)
	{
		switch(action)
		{
		case "add":
			alo.add(a);
			break;
		case "remove":
			alo.remove(b);
			break;
		}
		return alo;
	}
}
/*class A
{
	static HashSet<String> aa()
	{
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("a");
		obj.add("aa");
		obj.add("1");
		return  obj;
	}
}*/
public class Demo1 {

	public static void main(String[] args) {
		ArrayList<String> hSet=new ArrayList<String>();
		B.aa1("KashmirApple", hSet, "add",0);
		B.aa1("PineApple", hSet, "add",0);
		B.aa1("OotyApple", hSet, "add",0);
		hSet=B.aa1("GreenApple", hSet, "add",0);
		System.out.println(hSet);
		hSet=B.aa1(null, hSet, "remove",0);
		System.out.println(hSet);
		for(int i=0;i<hSet.size();i++)
		{
			System.out.println(hSet.get(i));
		}
		for(String ss:hSet)
		{
			System.out.println(ss);
		}
		
		HashMap<String,String> obj11=new HashMap<String,String>();
		obj11.put("a", "sjsa");
		obj11.put("ds", "ejka");
		obj11.put("gd", "gdyj");
		System.out.println(obj11);
		obj11.forEach((k,v) -> System.out.println(k+" -- "+v));
		TreeMap<String,String> obj01=new TreeMap<String,String>();
		obj01.put("a", "sjsa");
		obj01.put("ds", "ejka");
		obj01.put("gd", "gdyj");
		System.out.println(obj01);
		obj01.forEach((k,v) -> System.out.println(k+" -- "+v));
		
		
		
	}

}
