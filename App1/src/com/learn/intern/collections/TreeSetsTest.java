package com.learn.intern.collections;

import java.util.Comparator;
import java.util.Iterator;

import java.util.TreeSet;

public class TreeSetsTest {

	public void test() {
		Comparator<Employee> comparSid = (o1, o2) -> {
			Employee e1 = (Employee) o1;
			Employee e2 = (Employee) o2;
			if (e1.geteId() > e2.geteId())
				return 1;
			if (e1.geteId() < e2.geteId())
				return -1;
			return 0;
		};
		Comparator<Employee> comparAge = (o1, o2) -> {
			Employee e1 = (Employee) o1;
			Employee e2 = (Employee) o2;
			if (e1.geteAge() > e2.geteAge())
				return 1;
			if (e1.geteAge() < e2.geteAge())
				return -1;
			return 0;
		};
		TreeSet<Employee> tree = new TreeSet<Employee>(comparAge);
		tree.add(new Employee(3, 45, "arjun"));
		tree.add(new Employee(2, 34, "arun"));
		tree.add(new Employee(8, 65, "ravi"));
		tree.add(new Employee(8, 65, "ravi"));
		tree.add(new Employee(1, 65, "r7675"));
		System.out.println(tree);

		System.out.println("---------------- for each loop-----------------");
		for (Object object : tree) {
			System.out.println(object);

		}
		System.out.println("---------------- forward Iteretors-----------------");
		Iterator iterator = tree.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
