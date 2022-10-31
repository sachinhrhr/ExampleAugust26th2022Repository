package com.Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Problem3 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		createdata1();
		createdata2();
		createdata3();
		Login1AndLogout();
		Login2andLogout();
		//Login3AndLogout();
		Login1AndModiLogout();
		Login2AndModiLogout();
		//Login3AndModiLogout();
		NewPasswardLogin1andlogout();
		NewPasswardLogin2andlogout();
	//	NewPasswardLogin3andlogout();
		loginasAdmin();
		Delete1();
		Delete2();
		//Delete3();
		logout();
		close();
		
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(8000);
			oBrowser.findElement(By.className("gettingStartedShortcutsLabel")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(5000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createdata1()
	{
		try
		{
			oBrowser.findElement(By.name("firstName")).sendKeys("sachin");
			oBrowser.findElement(By.name("middleName")).sendKeys("....");
			oBrowser.findElement(By.name("lastName")).sendKeys("daya");
			oBrowser.findElement(By.name("email")).sendKeys("dayasachin311@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("sachin9");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("sachin");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("sachin");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createdata2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("guru");
			oBrowser.findElement(By.id("userDataLightBox_middleNameField")).sendKeys("....");
			oBrowser.findElement(By.name("lastName")).sendKeys("raju");
			oBrowser.findElement(By.name("email")).sendKeys("guru1@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("guru9");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("sachin");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("sachin");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createdata3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("pawaraki");
			oBrowser.findElement(By.id("userDataLightBox_middleNameField")).sendKeys("....");
			oBrowser.findElement(By.name("lastName")).sendKeys("bai");
			oBrowser.findElement(By.name("email")).sendKeys("pawarak@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("rak9");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("sachin");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("sachin");

			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Login1AndLogout()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("rak9");
			oBrowser.findElement(By.name("pwd")).sendKeys("sachin");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Login2andLogout()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("sachin9");
			oBrowser.findElement(By.name("pwd")).sendKeys("sachin");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(7000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Login3AndLogout()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("guru9");
			oBrowser.findElement(By.name("pwd")).sendKeys("sachin");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(7000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Login1AndModiLogout()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("rak9");
			oBrowser.findElement(By.name("pwd")).sendKeys("sachin");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.className("userProfileLink username")).click();
			Thread.sleep(6000);
			oBrowser.findElement(By.xpath("//div[text()='Change Password']")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.name("oldPassword")).sendKeys("sachin");
			oBrowser.findElement(By.name("newPassword")).sendKeys("sachin1");
			oBrowser.findElement(By.name("newPasswordCopy")).sendKeys("sachin1");
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(6000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Login2AndModiLogout()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("sachin9");
			oBrowser.findElement(By.name("pwd")).sendKeys("sachin");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.className("userProfileLink username")).click();
			Thread.sleep(9000);
			oBrowser.findElement(By.xpath("//div[text()='Change Password']")).click();
			Thread.sleep(8210);
			oBrowser.findElement(By.name("oldPassword")).sendKeys("sachin");
			oBrowser.findElement(By.name("newPassword")).sendKeys("sachin1");
			oBrowser.findElement(By.name("newPasswordCopy")).sendKeys("sachin1");
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Login3AndModiLogout()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("guru9");
			oBrowser.findElement(By.name("pwd")).sendKeys("sachin");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.className("userProfileLink username")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//div[text()='Change Password']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.name("oldPassword")).sendKeys("sachin");
			oBrowser.findElement(By.name("newPassword")).sendKeys("sachin1");
			oBrowser.findElement(By.name("newPasswordCopy")).sendKeys("sachin1");
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(7000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void NewPasswardLogin1andlogout()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("rak9");
			oBrowser.findElement(By.name("pwd")).sendKeys("sachin1");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(5000);	
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(9000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void NewPasswardLogin2andlogout()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("guru9");
			oBrowser.findElement(By.name("pwd")).sendKeys("sachin1");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(5000);	
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void NewPasswardLogin3andlogout()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("sachin9");
			oBrowser.findElement(By.name("pwd")).sendKeys("sachin1");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(5000);	
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginasAdmin()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Delete1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='bai, pawaraki .....']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(5000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Delete2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='daya, sachin .....']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(5000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Delete3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='raju, guru .....']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(5000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		private static void close()
		{
			try
			{
				oBrowser.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
}

	

