package com.learn.intern.collections;

public class Test {
	private int sid;
	private int age;
	private String sname;

	public Test() {
		super();
	}

	public Test(int sid, int age, String sname) {
		super();
		this.sid = sid;
		this.age = age;
		this.sname = sname;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "test [sid=" + sid + ", age=" + age + ", sname=" + sname + "]";
	}

}
