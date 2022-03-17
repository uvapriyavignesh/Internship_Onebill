package com.learn.intern.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class SampleLinkedList {
	public void test() {
		LinkedList<Employee> linkedList = new LinkedList<Employee>();
		linkedList.add(new Employee(1, 45, "arjun"));
		linkedList.add(new Employee(2, 34, "arun"));
		linkedList.add(new Employee(8, 65, "ravi"));
		System.out.println(linkedList);
		System.out.println("---------------- for loop-----------------");
		for (int i = 0; i <= linkedList.size() - 1; i++) {
			System.out.println(linkedList.get(i));
		}
		System.out.println("---------------- for each loop-----------------");
		for (Object object : linkedList) {
			System.out.println(object);

		}
		System.out.println("---------------- forward Iteretors-----------------");
		ListIterator iterator=linkedList.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("---------------- backward Iteretors-----------------");
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}

	}

}
