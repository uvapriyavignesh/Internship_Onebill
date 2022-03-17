package Exceptionsample;

import java.util.Scanner;

public class Ex {
	
	public void test(int a) throws CheckedException {
		
		if (a<=0)
		{
			throw new CheckedException("i==0");
		}
		
	}
	public static void main(String[] args) {
		Ex e=new Ex();
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		try {
			e.test(a);
			System.out.println(a);
		} catch (CheckedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	

}
