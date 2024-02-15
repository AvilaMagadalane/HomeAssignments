package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d = new ChromeDriver();
		d.get("https://leafground.com/button.xhtml");
		d.manage().window().maximize();
		//click
		d.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		System.out.println(d.getTitle());
		d.navigate().back();
		Thread.sleep(2000);
		//enabled or diabled
		WebElement dbtn=d.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]"));
		boolean btnDisabled = dbtn.isEnabled();
		System.out.println("Button Status: "+btnDisabled);
		//position
		WebElement pbtn = d.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]"));
		Point btnPosition = pbtn.getLocation();
		System.out.println("Button Position: "+btnPosition);
		//color of button
		WebElement cbtn = d.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]"));
		String btnColor = cbtn.getCssValue("background-color");
		System.out.println("Button Color: "+btnColor);
		//height and width
		WebElement hwbtn = d.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]"));
		Dimension btnsize = hwbtn.getSize();
		System.out.println("Height and Width: "+btnsize);
		d.quit();

	}

}
