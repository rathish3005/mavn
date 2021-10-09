package fb_testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Pom2 {
	
	public static WebDriver driver;
	


		public Fb_Pom2(WebDriver driver2) {
			this.driver = driver2 ;
			
			PageFactory.initElements(driver2, this);
	}

		@FindBy (name="login")
		private WebElement cl ;

		public WebElement getCl() {
		return cl;
}
}



