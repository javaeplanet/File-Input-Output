package com.javaeplanet.fileio;

import java.io.File;

public class DirectoryCount2 {
	public static void main(String[] args) {
		int count = 0;
		File f = new File("C:\\windows");
		String[] file = f.list();
		for (String string : file) {
			File f1 = new File(f, string);
			if (f1.isFile()) {
				count++;
				System.out.println(string);
			}
		}
		System.out.println(count);
	}

}
