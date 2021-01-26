package com.javaeplanet.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableDemo {
	public static void main(String[] args) {
		Student s = new Student(2, "ANISH", "TENALI");
		FileOutputStream fos;
		ObjectOutputStream oos;

		try {
			fos = new FileOutputStream("def.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileInputStream fis;
		ObjectInputStream ois;

		try {
			fis = new FileInputStream("def.ser");
			ois = new ObjectInputStream(fis);

			Student std = (Student) ois.readObject();

			System.out.println(std.id + "," + std.name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
