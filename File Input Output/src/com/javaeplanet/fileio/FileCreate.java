package com.javaeplanet.fileio;

import java.io.File;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args) {
		File f = new File("abc.txt");
		boolean existsorNot = f.exists();
		System.out.println(existsorNot);

		try {
			boolean createNewFile = f.createNewFile();
			System.out.println(createNewFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
