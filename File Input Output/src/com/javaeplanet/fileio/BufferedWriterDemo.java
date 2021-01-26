package com.javaeplanet.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("abc.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		bw.write("javaworld");
		bw.newLine();
		char[] ch = { 'c', 'd', 'f' };
		bw.write(ch);
		bw.flush();
		bw.close();
	}
}
