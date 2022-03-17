package com.te.learn.oops.abstraction.interfaces.functional;

import java.util.Comparator;

public class CompareEmployeeBasedOnAge implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee employee1 = (Employee) o1;
		Employee employee2 = (Employee) o2;
		if (employee1.geteAge() > employee2.geteAge())
			return 1;
		else if (employee1.geteAge() < employee2.geteAge())
			return -1;
		return 0;
	}

}
