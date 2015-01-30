package com.interactions;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakesScreenShot1 {

	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	//driver.get("http://www.packtpub.com/");
	driver.get("http://www.amazon.com/");
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(scrFile.getAbsolutePath());

	}

}
