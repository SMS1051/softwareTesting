package org.bas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Saifullah extends BASIC {
	public Saifullah() {
		PageFactory.initElements(d, this);
	}	
	@FindBy (xpath = "(//a[@role='button'])[2]")
	private WebElement Acbtn ;
	
	@FindBy (xpath = "(//input[@data-type='text'])[1]")
	private WebElement Firstname ;
	
	@FindBy (xpath = "(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")
	private WebElement Secondname ;
	
	@FindBy (xpath = "(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")
	private WebElement Email ;
	
	@FindBy (xpath = "(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")
	private WebElement password ;

	public WebElement getAcbtn() {
		return Acbtn;
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getSecondname() {
		return Secondname;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return password;
	}

}