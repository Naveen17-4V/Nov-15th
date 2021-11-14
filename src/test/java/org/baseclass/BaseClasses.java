package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClasses {
	
	public static ChromeDriver Sun ;
	
	public static void launchbrowser() {		
		WebDriverManager.chromedriver().setup();		
		Sun = new ChromeDriver();		
	}

	public static void getUrl(String Url) {		
	Sun.get(Url);		
	}
	
	public static void windowmaxi() {		
		Sun.manage().window().maximize();
	}
	
	public static void sendkey(String clr, WebElement Ele) {		
	Ele.sendKeys(clr);		
	}
	
	public static void Break() throws InterruptedException {
		Thread.sleep(4000);
	}
	
	public static void move (WebElement Cla) {
		Actions a = new Actions(Sun);
		a.moveToElement(Cla).perform();
	}
	
	public static void draganddrop (WebElement drag, WebElement drop) {
		Actions a = new Actions(Sun);
		a.dragAndDrop(drag, drop).perform();
	}
	
	public static void contentclick (WebElement con) {
		Actions a = new Actions(Sun);
		a.contextClick(con).perform();
	}
	
	public static void doubleclick (WebElement Doub) {
		Actions a = new Actions(Sun);
		a.doubleClick(Doub).perform();
	}
	
	public static void enter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void enterNum () throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_1);
		r.keyRelease(KeyEvent.VK_1);
	}
	
	public static void alertaccept() {
		Alert ab = Sun.switchTo().alert();
		ab.accept();		
	}
	public static void alertdismis() {
		Alert ab = Sun.switchTo().alert();
		ab.dismiss();		
	}
	public static void alerttext() {
		Alert ab = Sun.switchTo().alert();
		ab.getText();		
	}
	public static void alertsendvalue(String val) {
		Alert ab = Sun.switchTo().alert();
		ab.sendKeys(val);
	}
	public static void screenshot(String Str) throws IOException {
		TakesScreenshot z = (TakesScreenshot)Sun;
		File sct = z.getScreenshotAs(OutputType.FILE);
		
		File f = new File(Str);
		FileUtils.copyFile(sct, f);
	}
	public static void scrolldown(WebElement nam) {
		JavascriptExecutor j = (JavascriptExecutor)Sun;		
		j.executeScript("arguments[0].scrollIntoView()", nam);
	}
	public static void javaclick(WebElement clk) {
		JavascriptExecutor j = (JavascriptExecutor)Sun;		
		j.executeScript("arguments[0].click()", clk);
	}
	public static void frame(WebElement a) {
		Sun.switchTo().frame(a);
	}
	public static void click(WebElement Cli) {
		Cli.click();
	}
	
	public static void Select(WebElement A, int B) {
		Select a = new Select(A);
		a.selectByIndex(B);
	}
	public static void Selectvalue (WebElement A, String B) {
		Select a = new Select(A);
		a.selectByValue(B);
		}
	public static void Selecttext (WebElement A, String B) {
		Select a = new Select(A);
		a.selectByValue(B);
	}
	
	}


