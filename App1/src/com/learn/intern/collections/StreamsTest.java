package com.learn.intern.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {
	public void test() {
		ArrayList<Employee> l1 = new ArrayList<Employee>();
		l1.add(new Employee(3, 45, "arjun"));
		l1.add(new Employee(2, 34, "arun"));
		l1.add(new Employee(8, 65, "ravi"));
		l1.add(new Employee(8, 65, "ravi"));
		l1.add(new Employee(1, 65, "r7675"));
		System.out.println(l1);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		List<Employee> l2 = new ArrayList<Employee>();
		l2 = l1.stream().filter(a -> (a.geteAge() < 50) ? true : false).collect(Collectors.toList());
		System.out.println(l2);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		List<Employee> l3 = new ArrayList<Employee>();
		l3 = l1.stream().sorted((Employee o1, Employee o2) -> {
			if (o1.geteAge() > o2.geteAge()) {
				return 1;
			}
			if (o1.geteAge() < o2.geteAge()) {
				return -1;
			}
			return 0;
		}).collect(Collectors.toList());

		System.out.println(l3.stream());
	}

}
