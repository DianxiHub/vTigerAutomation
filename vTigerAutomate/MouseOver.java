package vTigerAutomate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseOver extends VtigerLoginPage{

	public void mouseOverMeth() {
		//userLogin

		WebDriver driver=vTigerUserLogin();

		// clicWith mouseOver
		Actions clkMouse=new Actions(driver);
		WebElement getEl=driver.findElement(By.xpath("//a[text()='More']"));
		clkMouse.moveToElement(getEl).build().perform();
		

	}

}
