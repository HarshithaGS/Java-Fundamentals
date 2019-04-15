package edu.neu.csye6200.iofile;

import java.io.File;

public class FileTest {
	
	public void run() {
		File baseDir = new File (".");//traversed through the entire directory
		if(!baseDir.exists()) // checking if file exists or no
			baseDir.mkdirs();// if not create directory
		listDir(baseDir); //list the base directory
		}
		
	public void listDir(File dirFile) {
		if (!dirFile.isDirectory()) return; //Reject non-directory
		System.out.println("Dir : " + dirFile.getAbsolutePath());
		
		//Handle data files
		for (File file :dirFile.listFiles()) {
			if(file.isDirectory()) continue;//Skip directories
			String fTxt  = String.format("%1$32s %2$10d", file.getName() , file.length());
			System.out.println(fTxt);
			}
		
		//Handle directories
		for (File file :dirFile.listFiles()) {
			if(file.isDirectory()) //Skip files -keep directories
				listDir(file); // Recursive call the list the folder
			}
		}
	
	public static void main(String[] args) {
		FileTest fileTest = new FileTest();
			fileTest.run();
	}
}
