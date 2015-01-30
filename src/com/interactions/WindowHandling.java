package com.interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:\\C:\\Users\\Anwara Begum\\Desktop\\8850OS_Code\\Chapter 3\\HTML\\Window.html");
		String window1 = driver.getWindowHandle();
		System.out.println("First window Handle is: " + window1);
		WebElement link = driver.findElement(By.linkText("Google Search"));
		link.click();
		String window2 = driver.getWindowHandle();
		System.out.println("Second window Handle is: " + window2);
		System.out.println("Number of window Handle so for: " + driver.getWindowHandles().size());
		driver.switchTo().window(window1);
	}

}
