package com.javaeplanet.fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) throws IOException {

		FileOutputStream fos;
		ObjectOutputStream oos;

		fos = new FileOutputStream("abc.ser");
		oos = new ObjectOutputStream(fos);
		Employee emp = new Employee(2, "anish", "hyd");
		oos.writeObject(emp);
		System.out.println("Employee object serialized ");
	}
}
