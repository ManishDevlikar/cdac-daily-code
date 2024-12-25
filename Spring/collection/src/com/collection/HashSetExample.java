package com.collection;

import java.util.HashSet;

class CustomObject {
	int id;
	String name;

	CustomObject(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode() invoked for: " + name);
		return id; // Custom hash code
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals() invoked for: " + name);
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		CustomObject that = (CustomObject) obj;
		return id == that.id && name.equals(that.name);
	}

	@Override
	public String toString() {
		return "CustomObject{id=" + id + ", name='" + name + "'}";
	}
}

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<CustomObject> set = new HashSet<>();

		CustomObject obj1 = new CustomObject(1, "Alice");
		CustomObject obj2 = new CustomObject(1, "Alice");

		set.add(obj1); // hashCode() and equals() will be called
		set.add(obj2); // hashCode() and equals() will be called again

		System.out.println("HashSet: " + set);
	}
}
