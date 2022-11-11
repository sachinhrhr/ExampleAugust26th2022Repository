package com.sgtesting.testngsenerio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Problem5 {
	public static WebDriver oBrowser=null;

	@Test(priority=1)
	private static void LaunchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	private static void navigate()
	{ 
		WebElement oEle=null;
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
			oEle=oBrowser.findElement(By.xpath("//td[text()='Please identify yourself']"));
			Assert.assertTrue(oEle.isDisplayed());
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
			oBrowser.findElement(By.id("username" )).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			WebElement oLink=oBrowser.findElement(By.xpath("//a[contains(text(),'Administrator')]"));
			Assert.assertTrue(oLink.isDisplayed());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@DataProvider(name="login")
	public Object[][] getLoginData()
	{
		return new Object[][] {{"admin","manager"}};
	}
	@Test(priority=4)
	private static void minimizeFlyoutwindow() 
	{
		String expected;
		try
		{
			expected="Getting Started Shortcuts";
			WebElement oEle=oBrowser.findElement(By.xpath("//div[text()='Getting Started Shortcuts']"));
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			String actual=oEle.getText();
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)	
	private static void createCustomer()
	{
		String expected;
		try
		{
			expected="All Customers";
			oBrowser.findElement(By.xpath("//div[text()='TASKS']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div [text()='Add New']")).click();
			oBrowser.findElement(By.xpath("//div [text()='+ New Customer']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_nameField" )).sendKeys("Santhosh");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
			WebElement oEle=oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[2]"));
			String actual=oEle.getText();
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	private static void modifyCustomer()
	{
		String expected;
		try
		{
			
			Thread.sleep(4000);
			expected="Santhosh";
			oBrowser.findElement(By.xpath("//div[@*='editButton available']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@*='Enter customer description...']")).sendKeys("Business");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click();
			Thread.sleep(2000);
			WebElement oEle=oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[2]"));
			String actual=oEle.getText();
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=7)	
	private static void deleteCustomer()
	{
		
		try
		{
			String expected="Add New Task";
			oBrowser.findElement(By.xpath("//div[text()='All Customers']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
			String actual=oBrowser.findElement(By.xpath("//div[text()='Add New Task']")).getText();
			Assert.assertEquals(actual, expected);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	private static void logout()
	{
		String expected,actual;
		try
		{
			expected="actiTIME - Login";
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=9)
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