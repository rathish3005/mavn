package fb_testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Pom1 {
	
public static WebDriver driver;
	
	
	
		public Fb_Pom1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

		@FindBy (id="email")
		private WebElement mail	;

		public WebElement getMail() {
		return mail;
	}
		@FindBy (name="pass")

		private WebElement pswd ;


		public WebElement getPswd() {
		return pswd;
	}


}
