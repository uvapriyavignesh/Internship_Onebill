package com.te.learn.oops.relationship.inheritence;

public class App19 {
	public static void main(String[] args) {
		BB bb = new BB();
		bb.aStaticMethod();
		
		AA aa = new BB();
		aa.aStaticMethod();
	}
}
