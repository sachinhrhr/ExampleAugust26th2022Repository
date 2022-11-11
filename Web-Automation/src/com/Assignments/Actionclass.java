package com.Assignments;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;

public class A1 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		//Mousemovements();
		mouseMovements();
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
			oBrowser.get("https://www.flipkart.com/");

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void mouseMovements()
	{
		try
		{
			oBrowser.findElement(By.xpath("//button[text()='✕']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/div[1]/a/div[1]/div/img")).click();
			Thread.sleep(4000);
			WebElement oEle=oBrowser.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/span[1]"));
			Actions o=new Actions(oBrowser);
			o.moveToElement(oEle).build().perform();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div/div[2]/a[6]")).click();
			Thread.sleep(2000);
			/*oBrowser.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/a/div[1]/div/img")).click();
			Thread.sleep(2000);
			WebElement oEle=oBrowser.findElement(By.xpath("//span[text()='Electronics']"));
			Actions oMouse=new Actions(oBrowser);
			oMouse.moveToElement(oEle).build().perform();
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("Memory Cards")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("Flights")).click();
			//oMouse.contextClick(oLink).build().perform();
			Thread.sleep(2000);*/
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
