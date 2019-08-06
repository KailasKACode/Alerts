package AlertByShastra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class promptAlert {
	public static void main(String[] args) {
		WebDriver dri=new ChromeDriver();
		dri.get("file:///C:/Users/Kailas/Desktop/SlackDoc/prompt.html");
		dri.manage().timeouts().implicitlyWait(100, TimeUnit.NANOSECONDS);
		dri.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
		/*WebDriverWait dr=new WebDriverWait(dri,1000);
		dr.pollingEvery(10, TimeUnit.SECONDS);
		dr.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Click Me')]\"")));*/
		Alert atr=dri.switchTo().alert();
		atr.sendKeys("This for checking:" );
		atr.accept();
		
		
	}

}
