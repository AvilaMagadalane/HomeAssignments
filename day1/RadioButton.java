package week3.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.leafground.com/radio.xhtml");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.manage().window().maximize();
		
		//fav browser
		d.findElement(By.xpath("(//div[@class='card'])[1]//label[text()='Chrome']")).click();
		
		//select and deselect
		WebElement select = d.findElement(By.xpath("(//div[@class='card'])[2]//label[text()='Chennai']"));
		select.click();
		select.click();
		boolean selected = select.isSelected();
		System.out.println("Radio button is select or not: "+selected);
		
		//age group is selected
		Thread.sleep(5000);
		//WebElement group = d.findElement(By.xpath("(//div[@class='card'])[4]//label[text()='21-40 Years']"));
		WebElement group = d.findElement(By.xpath("//span[@class='ui-radiobutton-icon ui-icon ui-c ui-icon-bullet']"));
		boolean groupselected = group.isEnabled();
		//boolean groupselected = group.isSelected();
		System.out.println("Age group is selected: "+groupselected);
		//button already selected
		
//		WebElement alreadySelectedBtn = d.findElements(By.xpath("(//div[@class='card'])[3]//div[@class='ui-radiobutton ui-widget']"));
//		for(int i=0; i<4;i++) {
//			boolean btnenabled = alreadySelectedBtn.isSelected();
//			//System.out.println(alreadySelectedBtn.getText());
//			System.out.print(btnenabled);
//		}
		List<WebElement> findElements = d.findElements(By.xpath("(//div[@class='grid formgrid'])[3]"));
		
		for(int i=0; i < findElements.size(); i++) {
		
		//String text = findElements.get(i).getText();
		//System.out.println(text);
		boolean radio = findElements.get(i).isEnabled();
		System.out.println(radio);
		
		
	}
		
		Thread.sleep(2000);
		d.quit();

	}

}
