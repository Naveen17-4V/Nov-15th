package org.baseclass;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.LoginPojo;

public class PraticeClass extends BaseClasses {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		
		launchbrowser();
		getUrl("https://en-gb.facebook.com/");
		windowmaxi();
		
		LoginPojo a = new LoginPojo();
		sendkey("Harry", a.getEmailid());
		sendkey("23456", a.getPassword());
		Sun.navigate().refresh();
		
		LoginPojo n = new LoginPojo();
		sendkey("RajMurugan", n.getEmailid());
		sendkey("23456", n.getPassword());
	}

}

//public static void click(WebElement Cli) {
//Cli.click();
//public static void alertaccept() {
//	Alert ab = Sun.switchTo().alert();
//	ab.accept();
// alertaccept();

//WebElement Pri = Sun.findElement(By.xpath("//a[contains(text(),'Mobiles &')]"));
//move(Pri);
//
//Thread.sleep(3000);
//
//	WebElement Sa = Sun.findElement(By.id("rightpanel_43"));
//frame(Sa);
//
//Sun.findElement(By.xpath("(//a[contains(text(),'I KALL')])[2]")).click();
//