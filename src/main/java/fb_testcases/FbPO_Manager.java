package fb_testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
public class FbPO_Manager {
	
	public static WebDriver driver ;

	public FbPO_Manager(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
	}

	private Fb_Pom1 up ;
	
	private Fb_Pom2 cl;
	
	private Fb_Pom3 fp;
	
	public Fb_Pom1 getInstanceup() {
		up = new Fb_Pom1 (driver);
		return up ;
	}
	public Fb_Pom2 getInstancecl() {
		cl = new Fb_Pom2 (driver);
		return cl ;
	}
	public Fb_Pom3 getInstancefp() {
		fp = new Fb_Pom3 (driver);
		return fp ;
	}
	
	


}
