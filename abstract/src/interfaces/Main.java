package interfaces;

public class Main  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B t=new test();
		t.m1();
		//t.m2();

	}

}
class test implements A,B{
	@Override
	public void m1() {
		//System.out.println("my implementation");
		A.super.m1();
		
	}
}
