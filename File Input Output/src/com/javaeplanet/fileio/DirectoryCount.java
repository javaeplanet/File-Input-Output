package com.javaeplanet.fileio;

import java.io.File;

public class DirectoryCount {
	public static void main(String[] args) {
		int count = 0;
		File f = new File("C:\\Windows");
		String[] list = f.list();
		for (String string : list) {
			count++;
			System.out.println(string);
		}
		System.out.println("The total number is:" + count);
	}

}
