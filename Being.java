package com.te.learn;



public class Being {

	public static void main(String[] args) {
		Human human=new Human();
		human.setAge(20);
		Name an=human.help();
		human.setName(an);
		Name q=human.getName();
		q.setFirstName("ravi");
		q.setMiddleName("sandran");
		q.setLastName("sami");
		System.out.println();

	}

}
