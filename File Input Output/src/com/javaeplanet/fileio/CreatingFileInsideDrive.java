package com.javaeplanet.fileio;

import java.io.File;
import java.io.IOException;

public class CreatingFileInsideDrive {
	public static void main(String[] args) {
		File f = new File("E:\\xyz", "abc.txt");
		try {
			boolean createNewFile = f.createNewFile();
			System.out.println(createNewFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
