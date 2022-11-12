package com.sgtesting.testngsenerio;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Problem4 {
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
	private static void Task()
	{
		try
		{
			String expected="Add New Task";
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[2]")).click();
			Thread.sleep(3000);
			String actual=oBrowser.findElement(By.xpath("//div[text()='Add New Task']")).getText();
			Assert.assertEquals(actual, expected);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6,dataProvider="customer")
	private static void Addnew(String userc)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys(userc);
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@DataProvider(name="customer")
	public Object[] getcustomernmae()
	{
		return new Object[] {"sac"};
	}
	@Test(priority=7)
	private static void deletec()
	{
		try
		{
			String expected="-- please select customers and/or projects --";
			
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//span[text()='Delete permanently']")).click();
			Thread.sleep(3000);
			String action=oBrowser.findElement(By.xpath("//span[text()='-- please select customers and/or projects --']")).getText();
			Assert.assertEquals(action, expected);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	private static void logout()
	{
		try
		{
			Thread.sleep(2000);
			String expected="Login";
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			WebElement o=oBrowser.findElement(By.xpath("//div[text()='Login ']"));
			String actual=o.getText();
			Assert.assertEquals(actual, expected);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 9)
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
