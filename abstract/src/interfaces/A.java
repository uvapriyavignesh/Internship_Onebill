package interfaces;

public interface A {
	default void m1() {
		System.out.println("a");
	}
	default void m2() {
		System.out.println("a1");
	}


}
