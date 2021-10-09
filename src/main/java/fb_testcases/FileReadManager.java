	package fb_testcases;

public class FileReadManager {
	
	 private FileReadManager() {
	 }
	 
	 
	 
	 public static FileReadManager getInstanceFR() {														//filereader manager
		 FileReadManager fr=new FileReadManager();
		 return fr;
		 }
	 
	 public Con_ReaderFb getInstanceCR() throws Throwable {													//configuration reader object
		 
		 Con_ReaderFb CR=new Con_ReaderFb();
		return CR;		
	 }
	 
	

}
