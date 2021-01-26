package com.javaeplanet.fileio;

import java.io.File;

public class CreateDir {
	public static void main(String[] args) {
		File f = new File("abc123");
		boolean exists = f.exists();
		System.out.println(exists);

		boolean mkdir = f.mkdir();
		System.out.println(mkdir);
	}

}
