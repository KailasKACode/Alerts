package ToHandleAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlerCancelAndOk {
	public static void main(String[] args) throws InterruptedException {
		WebDriver drb=new ChromeDriver();
		drb.get("http://demo.automationtesting.in/Alerts.html");
		drb.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]")).click();
		drb.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]")).click();
		Alert atr=drb.switchTo().alert();
		Thread.sleep(500);
		atr.dismiss();
		String test=drb.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(test);
		if(test.equals("You Pressed Cancel"))
		{
			System.out.println("This is correcct");
		}
		else
		{
			System.out.println("This is incorrect");
		}
		
		
	}

}
 