package com.javaeplanet.fileio;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("abcde.txt");
		int read = fr.read();
		while (read != -1) {
			System.out.print((char) read);
			read = fr.read();
		}
		fr.close();
	}
}
