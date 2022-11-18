package com.sgtesting.AutoitDemo1;

public final class Problem1 {
	
	public static void main(String[] args) {
		executeDemo();
	}
	private static void executeDemo()
	{
		try
		{
			Runtime.getRuntime().exec("E:\\GitRepository\\Testnotepadnotsave.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
