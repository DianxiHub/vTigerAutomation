package vTigerAutomate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LeadMenuAutomate extends VtigerLoginPage{

	public void createLead() {
		//created object vtigerLoginPages
		WebDriver dr =vTigerUserLogin();

		// create lead 
		WebElement ClickNewLead =dr.findElement(By.linkText("Leads"));
		ClickNewLead.click();

		WebElement CreateNewLead =dr.findElement(By.xpath("//img[@title='Create Lead...']"));
		CreateNewLead.click();

		WebElement selectGretting =dr.findElement(By.xpath("//select[@name='salutationtype']"));

		Select selectG =new Select(selectGretting);
		selectG.selectByVisibleText("Mr.");
		//		selectG.selectByVisibleText("Mrs.");
		//		selectG.selectByVisibleText("Ms.");
		//		selectG.selectByVisibleText("Dr.");
		//		selectG.selectByVisibleText("Prof.");

		WebElement leadFirstName =dr.findElement(By.name("firstname"));
		leadFirstName.clear();
		leadFirstName.sendKeys("Sandeep");

		WebElement leadLastName =dr.findElement(By.name("lastname"));
		leadLastName .clear();
		leadLastName .sendKeys("Kumar");

		WebElement yourcompanyName =dr.findElement(By.name("company"));
		yourcompanyName.clear();
		yourcompanyName.sendKeys("Xioami inc");

		WebElement yourTitleName =dr.findElement(By.id("designation"));
		yourTitleName.clear();
		yourTitleName.sendKeys("xyz");

		WebElement yourLeadSource =dr.findElement(By.name("leadsource"));
		Select leadSource = new Select(yourLeadSource);
		leadSource.selectByIndex(4);

		WebElement yourIndrustryType =dr.findElement(By.name("industry"));
		Select yourIndrustry =new Select(yourIndrustryType);

		// fetch and print default value of IndrustryDropdown
		WebElement selectedValue= yourIndrustry.getFirstSelectedOption();
		String getDefultSelecrtedText=selectedValue.getText();
		System.out.println(getDefultSelecrtedText);

		yourIndrustry.selectByValue("Government");

		WebElement aftrSelectText=yourIndrustry.getFirstSelectedOption();
		String getAftrSelectText=aftrSelectText.getText();
		System.out.println(getAftrSelectText);

		//fetch DropDowne Type
		boolean dropdowntype =yourIndrustry.isMultiple();
		System.out.println(dropdowntype);

		WebElement annualRevenue =dr.findElement(By.name("annualrevenue"));
		annualRevenue.clear();
		annualRevenue.sendKeys("400000");

		WebElement NoOfEmployees =dr.findElement(By.id("noofemployees"));
		NoOfEmployees.clear();
		NoOfEmployees.sendKeys("148");

		WebElement SecondaryEmail =dr.findElement(By.id("secondaryemail"));
		SecondaryEmail.clear();
		SecondaryEmail.sendKeys("sandeep@gmail.com");

		WebElement enterStreet =dr.findElement(By.name("lane"));
		enterStreet .clear();
		enterStreet .sendKeys("hi my name is Sandeep ");

		WebElement postalCode =dr.findElement(By.id("code"));
		postalCode .clear();
		postalCode .sendKeys("226572");

		WebElement enterCountry =dr.findElement(By.id("country"));
		enterCountry.clear();
		enterCountry.sendKeys("India");

		WebElement enterPhone =dr.findElement(By.id("phone"));
		enterPhone.clear();
		enterPhone.sendKeys("41852");

		WebElement enterMobile =dr.findElement(By.id("mobile"));
		enterMobile.clear();
		enterMobile.sendKeys("+86-2818297150");

		WebElement enterFaxNo =dr.findElement(By.id("fax"));
		enterFaxNo.clear();
		enterFaxNo.sendKeys("84659");

		WebElement enterEmail =dr.findElement(By.id("email"));
		enterEmail.clear();
		enterEmail.sendKeys("sanxyz@gmail.com");

		WebElement enterEyourWebsite =dr.findElement(By.xpath("//input[@name='website']"));
		enterEyourWebsite.clear();
		enterEyourWebsite.sendKeys("www.sandeep.com");

		WebElement enterLeadStatus =dr.findElement(By.name("leadstatus"));
		Select selecteLeadStatus =new Select(enterLeadStatus);
		selecteLeadStatus.selectByIndex(5);

		WebElement LeadRating=dr.findElement(By.name("rating"));
		Select selctRating =new Select(LeadRating);
		selctRating.selectByIndex(3);

		WebElement assignedTo=dr.findElement(By.name("assigned_user_id"));
		assignedTo.click();

		//		WebElement SlectAssignedToGroup=dr.findElement(By.name("assigned_group_id"));
		//		Select assignGroup=new Select(SlectAssignedToGroup);
		//		assignGroup.selectByIndex(1);

		WebElement poBox=dr.findElement(By.id("pobox"));
		poBox.clear();
		poBox.sendKeys("xyz");

		WebElement yourCity=dr.findElement(By.id("city"));
		yourCity.clear();
		yourCity.sendKeys("Bhadohi");

		WebElement yourState=dr.findElement(By.id("state"));
		yourState.clear();
		yourState.sendKeys("Utter Pradesh");

		WebElement enterDescription=dr.findElement(By.name("description"));
		enterDescription.clear();
		enterDescription.sendKeys("Hi , This is my detail ");

		WebElement clickSaveBtn=dr.findElement(By.name("button"));
		clickSaveBtn.click();

		System.out.println(" succuesfully Save");



	}

}
