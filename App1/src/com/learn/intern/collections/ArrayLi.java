package com.learn.intern.collections;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLi {
	public void name() {
		ArrayList array = new ArrayList();
		array.add(new Test(1,34,"ravi"));
		array.add(new Test(2,45,"raj"));
		array.add(new Test(1,24,"ram"));
		System.out.println("++++++++++++++print object++++++++++");
		System.out.println(array);
		System.out.println("++++++++++++++1/1 for++++++++++");
		for (int i=0;i<=array.size()-1;i++) {
			System.out.println(array.get(i));
		}
		System.out.println("++++++++++++++for each++++++++++");
		for (Object object : array) {
			System.out.println(object.toString());
			
		}
		System.out.println("++++++++++++++iterators++++++++++");
		Iterator it=array.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	
	

}
