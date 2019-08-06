package AlertByShastra;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimpleAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Kailas/Desktop/SlackDoc/SimpleAlert.html");
		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
		Alert atr = driver.switchTo().alert();
		Thread.sleep(1000);
		atr.accept();
	}

}
