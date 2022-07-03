package org.pagefactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.pageutils.BaseClass;

public class LoginPageFactory extends BaseClass {
	
	public LoginPageFactory()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	private WebElement username;
	
	@FindBy(id = "pass")
	private WebElement password;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}	
}
