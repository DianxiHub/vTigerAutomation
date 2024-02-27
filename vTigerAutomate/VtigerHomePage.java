package vTigerAutomate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class VtigerHomePage extends VtigerLoginPage {

	public void userLogin() {
		WebDriver driver=vTigerUserLogin();
		
		driver.findElement(By.linkText("Calendar")).click();
		driver.findElement(By.linkText("Leads")).click();
	}


}

