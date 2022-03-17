package com.te.learn.basic.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Application {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();

		arrayList.add(new Student(1, "Name01", 22));
		arrayList.add(new Student(2, "Name02", 20));
		arrayList.add(new Student(3, "Name03", 19));
		arrayList.add(new Student(4, "Name04", 25));

		System.out.println("1st =====================");
		// 1st - Just printing!
		System.out.println(arrayList);

		System.out.println("2nd =====================");
		// 2nd - for loop!
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

		System.out.println("3rd =====================");
		// 3rd - Foreach!
		for (Object student : arrayList) {
			System.out.println(student);
		}

		System.out.println("4th =====================");
		// 4th - Iterator
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("5th =====================");
		// 5th - ListIterator
		ListIterator listIterator = arrayList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}

}
