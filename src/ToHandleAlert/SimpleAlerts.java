package ToHandleAlert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlerts {
	public static void main(String[] args) throws InterruptedException {
		WebDriver drv=new ChromeDriver();
		drv.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		drv.get("http://demo.automationtesting.in/Alerts.html");
		drv.findElement(By.xpath("(//a[contains(text(),'Alert with OK ')])[1]")).click();
		drv.findElement(By.xpath("//button[contains(text(),'    click the button to display an  alert box:')]")).click();
		Alert atr= drv.switchTo().alert();
		Thread.sleep(500);
		atr.accept();
	}

}
 