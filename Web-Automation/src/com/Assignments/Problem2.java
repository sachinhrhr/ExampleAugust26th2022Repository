package com.Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//2.launchBrowser --> navigate --> Login --> CreateUser -->ModifyUser-->
//DeleteUser --> Logout--> CloseApplication
public class Problem2 {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		createdata();
		modify();
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createdata()
	{
		try
		{
			oBrowser.findElement(By.name("firstName")).sendKeys("demo1");
			oBrowser.findElement(By.name("middleName")).sendKeys("1a");
			oBrowser.findElement(By.name("lastName")).sendKeys("sachi");
			oBrowser.findElement(By.name("email")).sendKeys("dayasachin311@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("sachin");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("sachin");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("sachin");
			
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modify()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='sachi, demo1 1a.']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).clear();
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("Guru");
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2100);
			oBrowser.findElement(By.xpath("//span[text()='sachi, demo1 1a.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(3000);
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
