package com.learn.intern.collections;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateTest {
	public void test() {
		/*
		 * Predicate<Integer> pre = a -> { if (a % 2 == 0) return true; return false; };
		 * Predicate<Integer> pre1 = new Predicate<Integer>() {
		 * 
		 * @Override public boolean test(Integer t) { if (t % 2 == 0) return true; //
		 * TODO Auto-generated method stub return false; }
		 */
		// };
		System.out.println("enter the string: ");
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();

		Predicate<String> pre3 = a -> (a.length() <= 5) ? true : false;
		Predicate<Integer> pre4 = a -> a % 2 == 0;
		Function<String, Boolean> func1 = a -> {
			a = a.toLowerCase();
			String str = "";
			for (int i = a.length() - 1; i >= 0; i--) {
				str = str + a.charAt(i);

			}
			if (str.compareTo(a) == 0)
				return true;
			return false;

		};
		System.out.println("given String is palindrom   " + func1.apply(s1));

	}
}
