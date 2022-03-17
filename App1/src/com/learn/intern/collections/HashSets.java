package com.learn.intern.collections;

import java.util.HashSet;

public class HashSets {
	public void testSets() {
		HashSet<Employee> Sets=new HashSet();
		Sets.add(new Employee(1, 45, "arjun"));
		Sets.add(new Employee(1, 45, "arjun"));
		Sets.add(new Employee(1, 45, "arjun"));
		
		for (Employee integer : Sets) {
			System.out.println(integer);
			
		}
		
		
		
	}

}
