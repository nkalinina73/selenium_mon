package com.samplelearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInWave {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Natalia\\Documents\\selenium-java-3.8.1\\chromedriver_win32\\chromedriver.exe");
        WebDriver wave = new ChromeDriver();
        wave.get("http://fits.qauber.com/#/page/login");
        wave.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //String baseUrl = "http://fits.qauber.com/#/page/login";
        
        //String expectedTitle = "Facebook - Log In or Sign Up";
        //String actualTitle = "";
       wave.findElement(By.xpath("//*[@id=\"exampleInputEmail1\"]")).sendKeys("nkalinina73@live.com"); 
       
       wave.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]")).sendKeys("qwe123"); 
       wave.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
       Thread.sleep(3000);
//       wave.switchTo().frame(0);
       wave.findElement(By.xpath("//button[@class='btn btn-block btn-primary mt-lg']")).click();
       Thread.sleep(2000);
       wave.findElement(By.xpath("/html/body/div[2]/header/nav/div[2]/ul[2]/li/a/span")).click();
       Thread.sleep(2000);
       wave.findElement(By.xpath("/html/body/div[2]/aside[1]/div/nav/ul/li[2]/a/span")).click();
       Thread.sleep(5000);
       wave.navigate().back();
       lsThread.sleep(2000);
       wave.navigate().forward();
  
		


	}

}
