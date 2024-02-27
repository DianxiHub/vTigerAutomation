package vTigerAutomate;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertHandle extends VtigerLoginPage{

	public void alertHandel() {

		WebDriver driver=vTigerUserLogin();
		///NoSuchElementException , Invalid Selector Exception
		WebElement we = driver.findElement(By.xpath("//input[@type='text']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;

		//				js.executeScript("window.scrollBy(0, 500000 )", args)
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");



		js.executeScript("arguments[0].value='admin'", we);



		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");



		/// java script -
		///  WebDriver - interface
		///    child                      Parent 
		////  JavaScriptExecutor extends WebDriver
		////  1) no exception but no work 
		//  2) exception + no work
		///  ElementNotInteactableException 
		///  ElementClickInterceptedException  -  

		////   JavaScript 
		WebElement weLogin=driver.findElement(By.xpath("//input[@type='submit']"));
		js.executeScript("arguments[0].click()", weLogin);

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//img[@alt='Import Leads']")).click();

		driver.findElement(By.id("import_file")).sendKeys("");


		//Robot 
		//				Robot robotBy=new Robot();
		//				robotBy.keyPress(KeyEvent.VK_L);
		//				robotBy.keyPress(KeyEvent.VK_E);
		//				robotBy.keyPress(KeyEvent.VK_A);
		//				robotBy.keyPress(KeyEvent.VK_D);
		//				robotBy.keyPress(KeyEvent.VK_S);
		//				robotBy.keyPress(KeyEvent.VK_PERIOD);
		//				robotBy.keyPress(KeyEvent.VK_C);
		//				robotBy.keyPress(KeyEvent.VK_S);
		//				robotBy.keyPress(KeyEvent.VK_V);
		//				robotBy.keyPress(KeyEvent.VK_TAB);
		//				robotBy.keyPress(KeyEvent.VK_TAB);
		//				robotBy.keyPress(KeyEvent.VK_ENTER);

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.id("selectCurrentPageRec")).click();
		driver.findElement(By.xpath("//input[@class='crmbutton small delete']")).click();

		Alert alertObj=driver.switchTo().alert();

		String alertMsg=alertObj.getText();

		System.out.println(alertMsg);
		if(alertMsg.equalsIgnoreCase("Please select at least one entity")) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");

		}

		//alertObj.accept();
		alertObj.dismiss();
		alertObj.sendKeys("");

	}
}
