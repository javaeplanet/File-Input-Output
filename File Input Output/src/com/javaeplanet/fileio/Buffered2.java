package com.javaeplanet.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered2 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		fw = new FileWriter("E:\\xyz\\abc.txt");
		bw = new BufferedWriter(fw);
		fr = new FileReader("E:\\xyz\\abc.txt");
		br = new BufferedReader(fr);
		bw.write("all the power lies with in you");
		bw.flush();
		bw.close();
		String line = br.readLine();
		while (line != null) {
			System.out.println(line);

			line = br.readLine();
		}
		br.close();
	}
}
