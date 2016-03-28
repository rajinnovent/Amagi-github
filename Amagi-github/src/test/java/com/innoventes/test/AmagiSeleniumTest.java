package com.innoventes.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class AmagiSeleniumTest {
	
	HtmlUnitDriver driver;
  @Test
 public void logintest() {
	  
	  driver.findElement(By.id("user_email_id")).sendKeys("admin@admin.com");
	  driver.findElement(By.id("user_password")).sendKeys("innoventes");
	  driver.findElement(By.id("buttonSubmit")).click();
	  AssertJUnit.assertTrue(isDisplayed("Dashboard"));
	  
	  
  }
  private boolean isDisplayed(String message) {
	
	return driver.getPageSource().contains(message);
}
  @BeforeTest
  public void beforeTest() {
	    driver=new HtmlUnitDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://www.innoventestech.in/amagi-dsr");
	  
}


  @AfterTest
  public void afterTest() {
  }

}
