package com.sgtesting.tests.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//1. launchBrowser --> navigate --> Login --> CreateUser --> 
//DeleteUser --> Logout--> CloseApplication
public class Problem1 {
	public static WebDriver oBrowser=null;
	@Test(priority=1)
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
	@Test(priority=2)
	private static void navigate()
	{
		try
		{
			String expected="Login";
			oBrowser.get("http://localhost/login.do");
			WebElement o=oBrowser.findElement(By.xpath("//div[text()='Login ']"));
			String actual=o.getText();
			Assert.assertEquals(expected, actual);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3,dataProvider="login")
	private static void login(String user,String pwd)
	{
		try
		{

			oBrowser.findElement(By.name("username")).sendKeys(user);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(8000);
			WebElement oLink=oBrowser.findElement(By.xpath("//a[text()='Enter Time-Track']"));
			Assert.assertTrue(oLink.isDisplayed());

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@DataProvider(name="login")
	public Object[][] getLoginData()
	{
		return new Object[][] {{"admin","manager"}};
	}
	@Test(priority=4)
	private static void minfly()
	{
		try
		{
			String expected="12";
			oBrowser.findElement(By.className("gettingStartedShortcutsLabel")).click();
			Thread.sleep(2000);
			String a=oBrowser.findElement(By.xpath("//td[text()='12']")).getText();
			Assert.assertEquals(a, expected);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=5)
	private static void createdata()
	{
		try
		{
			String  expected="sachi, demo1 1a.";
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo1");
			oBrowser.findElement(By.name("middleName")).sendKeys("1a");
			oBrowser.findElement(By.name("lastName")).sendKeys("sachi");
			oBrowser.findElement(By.name("email")).sendKeys("dayasachin311@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("sachin");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("sachin");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("sachin");

			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
			String actual=oBrowser.findElement(By.xpath("//span[text()='sachi, demo1 1a.']")).getText();
			Assert.assertEquals(actual, expected);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	private static void deletuser()
	{
		String expected="4 accounts left";
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='sachi, demo1 1a.']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(5000);
			String actual=oBrowser.findElement(By.id("licenseCountId")).getText();
			Assert.assertEquals(actual, expected);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	private static void logout()
	{
		try
		{
			String expected="Login";
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			WebElement o=oBrowser.findElement(By.xpath("//div[text()='Login ']"));
			String actual=o.getText();
			Assert.assertEquals(expected, actual);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 8)
	private static void closeApp()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
