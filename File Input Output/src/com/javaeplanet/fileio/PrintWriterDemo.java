package com.javaeplanet.fileio;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("zxc.txt");
		pw.append('c');
		pw.println(false);
		pw.println('a');
		pw.println("anish");
		pw.println(20.12);
		char[] ch = { 'e', 'r', 'h' };
		pw.println(ch);
		pw.flush();
		pw.close();

	}
}
