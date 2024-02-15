package week3.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				ChromeDriver d = new ChromeDriver();
				d.get("https://leafground.com/checkbox.xhtml");
				d.manage().window().maximize();
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				d.findElement(By.xpath("(//div[@class=\"ui-selectbooleancheckbox ui-chkbox ui-widget\"]//div)[2]")).click();
				d.findElement(By.xpath("(//div[@class=\"ui-selectbooleancheckbox ui-chkbox ui-widget\"]//div)[4]")).click();
				String text = d.findElement(By.className("ui-growl-title")).getText();
				if(text.equals("Checked")) {
					System.out.println("Expected Text is: "+text);
				}
				else {
					System.out.println("Invalid text");
				}
				d.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[1]")).click();
			
				Thread.sleep(2000);
				d.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui')])[8]")).click();
				String triState = d.findElement(By.xpath("//div[@class='ui-growl-message']/p[contains(text(),'State')]")).getText();
				if(triState.contains("State = 1")) {
					System.out.println(triState);
				}
				else if(triState.contains("State = 2")) {
					System.out.println(triState);
			}
				else if(triState.contains("State = 0"))
				{
					System.out.println(triState);
				}
				else {
					System.out.println("Invalid");
				}
//				int count=1;
//		 		while(count<=3) {
//		 	         driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui')])[8]")).click();
//		 	         
//		 	         //driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui')])[8]")).click();
//		 	         Thread.sleep(2000);
//		 	         String triState1 = driver.findElement(By.xpath("//div[@class='ui-growl-message']/p[contains(text(),'State')]")).getText();
//		 	         System.out.println("TriState "+triState1);
//		 	         count++;
//		 	 		}
				int c=1;
				while(c<=2) {
				d.findElement(By.className("ui-toggleswitch-slider")).click();
				Thread.sleep(2000);
				String toggle = d.findElement(By.className("ui-growl-title")).getText();
				System.out.println(toggle);
				c++;
				}
				//checkbox isdiabled
				WebElement checkboxdisabled = d.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]"));
				boolean isdiabledCheckbox = checkboxdisabled.isSelected(); //check this part it need to be "isEnabled"
				System.out.println("Check box is enabled: "+isdiabledCheckbox); 
				//Multiple options
				d.findElement(By.xpath("//ul[@data-label='Cities']")).click();
				d.findElement(By.xpath("(//div[@role='dialog']//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
				Thread.sleep(2000);
				//d.quit();
			}
	}

		