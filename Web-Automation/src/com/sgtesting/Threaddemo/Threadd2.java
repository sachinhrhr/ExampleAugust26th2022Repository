package com.sgtesting.Threaddemo;
class Threaddemo2 implements Runnable
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
				System.out.println(Thread.currentThread().getName()+"Thraeds"+i);
			}
		}
	}
}

public class Threadd2 {

	public static void main(String[] args) {
		Threaddemo2 o1=new Threaddemo2();
		Threaddemo2 o2=new Threaddemo2();
		Thread aa=new Thread(o1);
		Thread ab=new Thread(o2);
		aa.setName("aa Thread");
		ab.setName("ab Thrdname");
		aa.start();
		ab.start();
	}

}
