package AlertByShastra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmBox {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Kailas/Desktop/SlackDoc/ConfirmationAlert.html");
		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
		driver.switchTo().alert().accept();
		String test=driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(test);
		if(test.equals("You pressed OK!"))
		{
			System.out.println("Correct Develoer keep it up: ");
		}
		else
		{
			System.out.println("Please yar correct this one: ");
		}
	}

}
