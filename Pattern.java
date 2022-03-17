package com.te.learn;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) { // TODO Auto-generated method stub
		int a ;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		Pramidpattern p = new Pramidpattern();
		p.singlePattern(a);
		p.doublePattern(a);
		//p.diamond(a);

	}

}

class Pramidpattern {
	public void singlePattern(int a) {
		for (int i = 0; i < a; i++) {
			if (i != 0) {
				System.out.println(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");

			}
		}

	}

	
	public void doublePattern(int a) {

		for (int i = 0; i < a; i++) {
			if (i != 0) {
				System.out.println(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");

			}

		}

		for (int i = a; i > 0; i--) {
			if (i != 0) {
				System.out.println(" ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print("*");

			}

		}

	}

	public void diamond(int a) {
		int t;
		for (int i = a; i >= 0; i--) {
			System.out.println();
			for (int j = i; j >= 0; j--) {
				System.out.print("*");

				if (j == 0) {
					System.out.print("#");
					t = i - 10;
					for (int k = 0; k >= t; k++) {
						System.out.print("#");
					}
					System.out.println();

				}

			}
		}
	}

}
