package com.samplelearning;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumBasic {


   public static void main(String[] args) {
       // declaration and instantiation of objects/variables
       //System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
       //System.setProperty("webdriver.gecko.driver","C:\\Users\\Natalia\\Documents\\selenium-java-3.8.1\\geckodriver-v0.19.1-win64.zip\\geckodriver.exe");
       // WebDriver driver = new FirefoxDriver();
        //comment the above 2 lines and uncomment below 2 lines to use Chrome
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Natalia\\Documents\\selenium-java-3.8.1\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       
       String baseUrl = "https://www.facebook.com/";
       String expectedTitle = "Facebook - Log In or Sign Up";
       String actualTitle = "";

       // launch Fire fox and direct it to the Base URL
       driver.get(baseUrl);

       // get the actual value of the title
       actualTitle = driver.getTitle();
       System.out.println("actualTitle: "+actualTitle); 

       /*
        * compare the actual title of the page with the expected one and print
        * the result as "Passed" or "Failed"
        */
       if (actualTitle.contentEquals(expectedTitle)){
           System.out.println("Test Passed!");
       } else {
           System.out.println("Test Failed");
       }
     
       //close Fire fox
       driver.close();
     
   }

}