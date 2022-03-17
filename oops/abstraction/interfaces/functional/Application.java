package com.te.learn.oops.abstraction.interfaces.functional;

import java.util.Arrays;

public class Application {

	public static void main(String[] args) {
		Student[] stuArray = { new Student(1, "Name01", 22, 88.01), new Student(2, "Name02", 20, 80.01),
				new Student(3, "Name03", 25, 79.01), new Student(4, "Name04", 19, 77.01) };

		Arrays.sort(stuArray);

		for (Student student : stuArray) {
			System.out.println(student);
		}

	}

}
