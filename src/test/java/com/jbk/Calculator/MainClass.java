package com.jbk.Calculator;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainClass {

	WebDriver driver = null;
	WebElement zero,two,three,four,fieve,eight,nine,multi,divi,sub,add,clear,actual;
	@BeforeClass
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "F:\\Users\\S.G.INGALE\\eclipse-workspace\\CalTask\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void loadElement(){
		zero  = driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[1]"));
		two   = driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]"));
		three = driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]"));
		four  = driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]"));
		fieve = driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[2]"));
		eight = driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[2]"));
		nine  = driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[3]"));
		multi = driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[4]"));
		divi  = driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[4]"));
		sub   = driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[4]"));
		add   = driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[4]"));
		clear = driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[3]"));
	}
	
	@Test(priority=0)
	public void multiplication() throws InterruptedException{		
		four.click();
		two.click();
		three.click();
		multi.click();
		fieve.click();
		two.click();
		fieve.click();
/*		actual = driver.findElement(By.xpath("//*[@id='sciOutPut']"));
		assertEquals(222075, actual);*/
		Thread.sleep(3000);
	}
	
	@Test(priority=1)
	public void division() throws InterruptedException{
		clear.click();
		four.click();
		zero.click();
		zero.click();
		zero.click();
		divi.click();
		two.click();
		zero.click();
		zero.click();
		/*actual = driver.findElement(By.xpath("//*[@id='sciOutPut']"));
		assertEquals(20, actual);*/
		Thread.sleep(3000);
	}
	
	@Test(priority=2)
	public void addition() throws InterruptedException{
		clear.click();
		sub.click();
		two.click();
		three.click();
		four.click();
		two.click();
		three.click();
		four.click();
		add.click();
		three.click();
		four.click();
		fieve.click();
		three.click();
		four.click();
		fieve.click();
		/*actual = driver.findElement(By.xpath("//*[@id='sciOutPut']"));
		assertEquals(111111, actual);*/
		Thread.sleep(3000);
	}
	
	@Test(priority=3)
	public void subtraction() throws InterruptedException{
		clear.click();
		two.click();
		three.click();
		four.click();
		eight.click();
		two.click();
		three.click();
		sub.click();
		two.click();
		three.click();
		zero.click();
		nine.click();
		four.click();
		eight.click();
		two.click();
		three.click();
		/*actual = driver.findElement(By.xpath("//*[@id='sciOutPut']"));
		assertEquals(-22860000, actual);*/
		Thread.sleep(3000);
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	
}
