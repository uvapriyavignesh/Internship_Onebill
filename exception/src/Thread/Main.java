package Thread;

public class Main {

	public static void main(String[] args) {
		System.out.println("start programe");
		Thread test=new Thread(new ThreadTest());
		ThreadTest2 test2=new ThreadTest2();
		test.start();
		test2.start();
		
		System.out.println(ThreadTest.st);

	}

}
