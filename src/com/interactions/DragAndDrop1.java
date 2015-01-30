package com.interactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) {
		WebDriver driver;
			driver = new FirefoxDriver();
			driver.get("C:\\Users\\Anwara Begum\\Desktop\\8850OS_Code\\Chapter 2\\HTML\\DragAndDrop.html");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				WebElement src = driver.findElement(By.id("draggable"));
				WebElement trgt= driver.findElement(By.id("droppable"));
				Actions builder = new Actions(driver);
				builder.dragAndDrop(src, trgt).perform();
				
			}

	}


