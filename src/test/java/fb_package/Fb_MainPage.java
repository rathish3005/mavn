package fb_package;

import org.openqa.selenium.WebDriver;

import fb_testcases.Base_ClassForFb;
import fb_testcases.FbPO_Manager;
import fb_testcases.FileReadManager;

public class Fb_MainPage  extends Base_ClassForFb {
static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {
		
		
		driver = webbrowser(FileReadManager.getInstanceFR().getInstanceCR().getBrowser());
		thisUrl(FileReadManager.getInstanceFR().getInstanceCR().geturl());
		
		implicit();
		
		FbPO_Manager manager = new FbPO_Manager(driver);
		
		sendkeys(manager.getInstanceup().getMail(), FileReadManager.getInstanceFR().getInstanceCR().getmail());
		
		
		sendkeys(manager.getInstanceup().getPswd(), FileReadManager.getInstanceFR().getInstanceCR().getpassword());
		
		
		clickElement(manager.getInstancecl().getCl());
		
		implicit();
		
		clickElement(manager.getInstancefp().getForgetten());
		}

}
