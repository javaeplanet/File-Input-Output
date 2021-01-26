package com.javaeplanet.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abcde.txt");
		fw.write(100);
		fw.write("javaeplanet");
		fw.append('f');
		char[] ch = { 'c', 'd', 'e' };
		fw.write(ch);
		fw.flush();
		fw.close();
	}
}
