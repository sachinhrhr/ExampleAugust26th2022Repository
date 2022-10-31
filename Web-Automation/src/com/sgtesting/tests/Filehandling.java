package com.sgtesting.tests;

import java.io.File;

public class Filehandling {

	public static void main(String[] args) {
		File f1=new File("E:\\Example\\Welcome\\Test.txt");
		String name=f1.getName();
		System.out.println(name);
		String name1=f1.getAbsolutePath();
		System.out.println(name1);
		String name2=f1.getParent();
		System.out.println(name2);
		boolean a=f1.canWrite();
		System.out.println(a);
		
	}
	
}
