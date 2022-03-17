package com.te.learn.oops.relationship.inheritence;

public class App20 {

	public static void main(String[] args) {
		Child c = new Child();
		Parent p = new Parent();
		
		boolean res = c instanceof Parent;
		boolean res_ = p instanceof Child;
		
		System.out.println("Is Parent type? " + res);
		System.out.println("Is Child type? " + res_);
	}

}
