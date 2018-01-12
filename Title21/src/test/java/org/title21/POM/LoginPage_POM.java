package org.title21.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.title21.validation.entities.ErrorMessages;
public class LoginPage_POM
{
	
	protected WebDriver driver;
	protected WebElement element;
		
	By username=By.cssSelector(".form-control#UserId");
	By password=By.cssSelector(".form-control#Password");
	By loginButton=By.cssSelector(".btn.t21-btn-primary");
	By passerrormessage=By.xpath(".//*[@id='login_panel']/form/div[3]/span");
	
	
	public WebElement login_username(WebDriver driver)
	{
		WebElement element=driver.findElement(username);
		return element;
	}
	public WebElement login_password(WebDriver driver)
	{
		element= driver.findElement(password);

		return element;
	}
	public WebElement login_BTN(WebDriver driver)
	{

		element = driver.findElement(loginButton);

		return element;
	}
	public WebElement passwordErrorMessage(WebDriver driver)
	{
		element = driver.findElement(passerrormessage);
		String error = element.getText();
		System.out.println(error);
		if(error.contains(ErrorMessages.passworderrormessages))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		return element;
		
	}

	

}
