package org.test;

import java.io.File;
import java.io.IOException;

public class Fileoperations {
	public static void main(String[] args) throws IOException {
	
		String path = "D:\\SugiWorks\\demo";
		File f = new File (path);
		
//		String[] list = f.list();
//		for (String string : list) {
//			System.out.println(string);
//		}
//		
		File[] listFiles = f.listFiles();
		for (File file : listFiles) {
			String name = file.getName();
			if (name.endsWith(".txt")) {
					System.out.println(file);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
//		File f1  = new File ("D:\\SugiWorks\\demo1");
//		boolean exists = f.exists();
//		System.out.println(exists);
//		
//		boolean mkdir = f.mkdir();
//		System.out.println(mkdir);
//		boolean mkdir2 = f1.mkdir();
//		System.out.println(mkdir2);
		
//		boolean mkdirs = f.mkdirs();
//		System.out.println(mkdirs);
		
//		boolean createNewFile = f.createNewFile();
//		System.out.println(createNewFile);
//		
//		boolean directory = f.isDirectory();
//		System.out.println(directory);
//		
//		boolean file = f.isFile();
//		System.out.println(file);
//		
//		String name = f.getName();
//		System.out.println(name);
//		
//		boolean canWrite = f.canWrite();
//		System.out.println(canWrite);
//		
//		boolean canRead = f.canRead();
//		System.out.println(canRead);
		
	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
