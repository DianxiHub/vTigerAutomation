package vTigerAutomate;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VtigerTestCheckBox extends VtigerLoginPage{

	public void tetsChekBox() {
		/// for user login
		WebDriver driver=vTigerUserLogin();

		// test chekBox

		driver.findElement(By.linkText("Leads")).click();
		WebElement Clkcheckbox=driver.findElement(By.xpath("//input[@name='selectall']"));
		/// chekbox enbale or not
		boolean checkEnableOrNot=Clkcheckbox.isEnabled();
		System.out.println("chekBox Enbale or Not = " +checkEnableOrNot);
		// checkbox Displayed or not
		boolean	CheckBoxDisplorNot=Clkcheckbox.isDisplayed();
		System.out.println("ChekBox displayed or Not = " +CheckBoxDisplorNot);
		// checkbox selected or not
		Boolean checckBoxSelOrNot=Clkcheckbox.isSelected();
		System.out.println("ChekBox selected or Not + " +checckBoxSelOrNot);

		Clkcheckbox.click();
	}
}
