package com.sgtesting.Threaddemo;
class Threaddemo1 implements Runnable
{
	public void run()
	{
		display();
	}
	void display()
	{
		for(int i=0;i<=33;i++)
		{
			if(i%2==0)
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print(i+" ");
			}
		}
	}
}

public class Threadd1 {

	public static void main(String[] args) {
		Threaddemo1 o1=new Threaddemo1();
		Thread aa=new Thread(o1);
		aa.start();
	}

}
