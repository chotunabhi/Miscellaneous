package com.java.RegEx;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNameFormatter {

	public static void main(String[] args) throws IOException {
		String folderName = args[0];
		
		File rootFolder = new File(folderName);
		
		if(!rootFolder.isDirectory()){
			System.err.println("Invlid folder name");
			System.exit(-1);
		}
		
		Pattern pattern = Pattern.compile("(\\d+)\\s*-\\s*((\\w*\\s*)*)(\\[www\\.AtoZmp3\\.in\\])\\.mp3");
		
		
		
		for (File folder : rootFolder.listFiles()) {
			System.out.println(folder.getName());
			for(File oldFile : folder.listFiles()){
				String fileName = oldFile.getName();
//				String fileName = folder.getName();
//				System.out.println(fileName);
				Matcher matcher = pattern.matcher(fileName);
				
				if(matcher.find()){
					System.out.println(matcher.group(2).toLowerCase());
					System.out.println(folder.getCanonicalPath());
				      File newName = new File(folder.getCanonicalPath()+"/"+matcher.group(2).toLowerCase()+".mp3");
				      
				      if(!oldFile.renameTo(newName)) {
				         System.out.println("Error");
				      }
					
				}	
			}
			System.out.println("----------------------------------");
		}
	}

}
