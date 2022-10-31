package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project11 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		lunch();
		navigate();
		login();
		mini();
		logout();
		close();
	}
	private static void lunch()
	{
		System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();

	}
	private static void navigate()
	{
		oBrowser.get("http://localhost/login.do");
	}
	private static void login()
	{
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
	}
	private static void mini()
	{
		oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
	}
	private static void logout()
	{
		oBrowser.findElement(By.className("logoutCell")).click();
	}
	private static void close()
	{
		oBrowser.close();

	}

}
