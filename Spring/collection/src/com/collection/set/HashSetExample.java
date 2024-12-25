package com.collection.set;

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
		return id; // Hash code based only on ID
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		CustomObject that = (CustomObject) obj;
		return id == that.id && name.equals(that.name); // Compare both ID and Name
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
		CustomObject obj2 = new CustomObject(1, "Bob"); // Same ID, different name

		set.add(obj1);
		set.add(obj2); // Will be added because equals() considers them different

		System.out.println("HashSet: " + set);
	}
}
