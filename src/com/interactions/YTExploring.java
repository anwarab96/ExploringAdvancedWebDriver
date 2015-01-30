package com.interactions;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class YTExploring {
	WebDriver driver;
	
@Before
public void startExplore()
{
	driver = new FirefoxDriver();
}
@Test
public void listMusic() throws InterruptedException
{
	driver.get("http://www.youtube.com");
	driver.findElement(By.linkText("Music")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("masthead-search-term")).sendKeys("khude gaanraj 2010");
	Thread.sleep(3000);
	driver.findElement(By.id("search-btn")).click();
	Thread.sleep(3000);
	List<WebElement> gaanraj = driver.findElements(By.xpath("/html/body/div[2]/div[3]/div/div[5]/div/div/div/div[1]/div/div[2]/div[1]/div[1]/div/p"));
	System.out.println("gaanraj.size()");
	for(int i = 0; i<gaanraj.size(); i++)
	{
		System.out.println(i+1 +  ". " +gaanraj.get(i).getText());
	}
	
			
}
@After
public void stopExplore()
{
	driver.close();
}
{
	
}

}
