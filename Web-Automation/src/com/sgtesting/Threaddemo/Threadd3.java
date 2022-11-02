package com.sgtesting.Threaddemo;
class Threaddemo3 implements Runnable
{
	public void run()
	{
		display();
	}
	synchronized void display()
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
				System.out.println(Thread.currentThread().getName()+i);
			}
		}
	}
}


public class Threadd3 {
	public static void main(String[] args) {
		Threaddemo3 o1=new Threaddemo3();
		Thread aa=new Thread(o1);
		Thread ab1=new Thread(o1);
		aa.setName("Thread aa");
		ab1.setName("Thread ab1");
		aa.start();
		ab1.start();
	}

}



	


