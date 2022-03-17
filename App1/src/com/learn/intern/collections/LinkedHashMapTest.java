package com.learn.intern.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapTest {
	public void test() {
		Comparator comparator = (o1, o2) -> {
			Employee employee = (Employee) o1;
			Employee employee1 = (Employee) o2;
			if (employee.geteAge() > employee1.geteAge())
				return 1;
			if (employee.geteAge() < employee1.geteAge())
				return -1;
			return 0;

		};
		TreeMap<Employee, Employee> linkedHash1 = new TreeMap<Employee, Employee>(comparator);
		linkedHash1.put(new Employee(3, 45, "arjun"), new Employee(3, 45, "arjun"));
		linkedHash1.put(new Employee(1, 35, "ravi"), new Employee(1, 35, "ravi"));
		linkedHash1.put(new Employee(2, 67, "ram"), new Employee(2, 67, "ram"));
		linkedHash1.put(new Employee(4, 77, "kalai"), new Employee(4, 77, "kalai"));
		for (Map.Entry<Employee, Employee> iterable_element : linkedHash1.entrySet()) {
			System.out.println("key:" + iterable_element.getKey() + " values: " + iterable_element.getValue());

		}

	}

}
