package com.te.learn;

public class StaticTest {
	{
		System.out.println("hai am static!!!");
		StaticTest staticTest = new StaticTest();
		staticTest.anioth();
	}

	public StaticTest() {
		// TODO Auto-generated constructor stub
		System.out.println("constr");
	}

	public void anioth() {
		System.out.println("anoth");
	}

	public static void main(String[] args) {
		System.out.println("hai");
		StaticTest st = new StaticTest();

		// TODO Auto-generated method stub

	}

}
