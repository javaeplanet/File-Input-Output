package com.javaeplanet.fileio;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	 int id;
	String name;
	String address;

	public Employee() {
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	public Employee(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

}
