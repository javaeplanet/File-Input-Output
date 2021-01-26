package com.javaeplanet.fileio;

import java.io.File;
import java.io.IOException;

public class FileInsideDirectory {
	public static void main(String[] args) {
		File f = new File("abc234");
		f.mkdir();
		File f1 = new File("abc234", "abc.txt");
		File f2 = new File(f, "abc.txt");
		try {
			boolean createNewFile = f2.createNewFile();
			System.out.println(createNewFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
