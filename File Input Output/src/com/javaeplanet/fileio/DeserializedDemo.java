package com.javaeplanet.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializedDemo {
	public static void main(String[] args) {
		FileInputStream fis;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("abc.ser");
			ois = new ObjectInputStream(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Employee emp = new Employee();
		try {
			Employee emp1 = (Employee) ois.readObject();
			System.out.println(emp1);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
