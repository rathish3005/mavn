	package fb_testcases;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Con_ReaderFb {
	public static Properties q;
	
	
	public Con_ReaderFb()  throws Throwable  { 
	File f=new File("C:\\Users\\rathe\\eclipse-workspace\\MavenProject\\src\\main\\java\\Fb_Cinfig_Properties\\configuration.properties");
	
		FileInputStream fist = new FileInputStream(f);	
		
		q=new Properties();
		
		q.load(fist);
}

public String getBrowser() {
	String Br =q.getProperty("Browser");
	return Br;
}
public String geturl()	 {
	String Br=q.getProperty("thisUrl");
	return Br;
	
}
public String getmail() {
	String Br=q.getProperty("mail");
	return Br ;
	
}
public String getpassword() {
	String Br=q.getProperty("password");
	return Br;
	
}

}
