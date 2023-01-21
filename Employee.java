package com.antra;

import java.util.Objects;

public class Employee {
	public static void main(String[] args) {
		Student s1 = new Student(101, "ramesh");
		Student s2 = new Student(102, "ramu");
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		Student s3 = new Student(101, "ramesh");
		System.out.println(s1.equals(s3));
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());

	}
}

class Student {
	private Integer sId;
	private String sName;

	public Student(Integer sId, String sName) {
		super();
		this.sId = sId;
		this.sName = sName;
	}

	@Override
	public int hashCode() {
		return this.sId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(sId, other.sId) && Objects.equals(sName, other.sName);
	}

}
