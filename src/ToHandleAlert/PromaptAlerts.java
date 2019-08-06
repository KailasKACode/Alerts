package ToHandleAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromaptAlerts {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\Kailas\\Desktop\\SlackDoc\\ConfirmationAlert.html");
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]")).click();
		Alert atr= driver.switchTo().alert();	
		Thread.sleep(1000);
		atr.sendKeys("Yeda jala ka be..");
		Thread.sleep(1000);
		atr.accept();
		
	}

}
