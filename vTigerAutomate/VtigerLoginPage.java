package vTigerAutomate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class VtigerLoginPage {

	public WebDriver vTigerUserLogin() {
		// open browser
		// ChromeBrowser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		// click URL Link
		driver.get("http://localhost:8884");

		// user login Page 	
		WebElement userName =driver.findElement(By.name("user_name"));
		userName.clear();
		userName.sendKeys("admin");
		WebElement userPassWord =driver.findElement(By.name("user_password"));
		userPassWord.clear();
		userPassWord.sendKeys("admin");

//		// Vtiger 5.2 select Lang and color
//
//		WebElement selColor=driver.findElement(By.name("login_theme"));
//		Select selColorTheam= new Select(selColor);
//		selColorTheam.selectByIndex(3);
//
//		// get color Theam first selected value
//		 WebElement firstSelColor=selColorTheam.getFirstSelectedOption();
//		 String getFirstClrValu=firstSelColor.getText();
//           System.out.println(getFirstClrValu);
//
//		WebElement selLang=driver.findElement(By.name("login_theme"));
//		Select selLanguage= new Select(selLang);
//		selLanguage.selectByVisibleText("US English");
//
//		// get language first selected value
//		WebElement firstSelValue =selLanguage.getFirstSelectedOption();
//		String selText=firstSelValue.getText();
//		System.out.println(selText);
//		
		//Vtiger5.4
//
		WebElement userLoginBTN =driver.findElement(By.id("submitButton"));
		userLoginBTN.click();	
		
		// fir Vtiger 5.2 
//		
//		WebElement userLoginBTN2 =driver.findElement(By.name("Login"));
//		userLoginBTN2.click();	
//		
		System.out.println("Succesful Login");

		return driver;	

	}

}
