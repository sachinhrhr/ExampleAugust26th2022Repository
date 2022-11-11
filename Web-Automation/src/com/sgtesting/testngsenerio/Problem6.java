package com.sgtesting.testngsenerio;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//6. launchBrowser --> navigate --> Login --> Create Customer --> Create Project--> delete Project-->delete Customer --> Logout --> CloseApplication
public class Problem6 {
	public static WebDriver oBrowser=null;
	@Test(priority=1)
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\GitRepository\\CurrentWorkSpace\\ExampleAugust26th2022Repository\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	private static void navigate()
	{
		WebElement o=null;
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);
			o=oBrowser.findElement(By.xpath("//td[text()='Please identify yourself']"));
			Assert.assertTrue(o.isDisplayed());
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
			oBrowser.findElement(By.id("username")).sendKeys(user);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			WebElement o=oBrowser.findElement(By.xpath("//a[contains(text(),'Administrator')]"));
			Assert.assertTrue(o.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	private static void minimizeFlyOutWindow()
	{
		String expected;
		try
		{
			expected="Getting Started Shortcuts";
			WebElement o=oBrowser.findElement(By.xpath("//div[text()='Getting Started Shortcuts']"));
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			String actual=o.getText();
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=5,dataProvider="createCustomer")
	private static void createCustomer(String cname)
	{
		String expected;
		try
		{
			expected="Customers & Projects";
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='+ New Customer']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys(cname);
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(2000);
			WebElement o=oBrowser.findElement(By.xpath("//div[text()='Customers & Projects']"));

			String actual=o.getText();
			Assert.assertEquals(actual, expected);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6,dataProvider="createProject")
	private static void createProject(String pname,String description)
	{
		String expected;
		try
		{
			expected="Customers & Projects";
			oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='+ New Project']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys(pname);
			oBrowser.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys(description);
			Thread.sleep(2000);
			oBrowser.findElement(By.id("projectPopup_commitBtn")).click();
			Thread.sleep(2000);
			WebElement o1=oBrowser.findElement(By.xpath("//div[text()='Customers & Projects']"));

			String actual1=o1.getText();
			Assert.assertEquals(actual1, expected);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	private static void deleteProject()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.id("projectPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	private static void deleteCustomer()
	{
		try
		{
		oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitTitle\"]")).click();
		Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	private static void logout()
	{                
		String expected,actual;
		try
		{
			expected="actiTIME - Login";
			oBrowser.findElement(By.linkText("Logout")).click();
			actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=10)
	private static void closeApplication()
	{
		try
		{
			oBrowser.close();
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

	@DataProvider(name="createCustomer")
	public Object[] createNewCustomer()
	{
		return new Object[] {"Sam"};
	}

	@DataProvider(name="createProject")
	public Object[][] createNewProject()
	{
		return new Object[][] {{"ProjectNew","JavaProject"}};
	}

}
