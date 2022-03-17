package linked;

public class linkedmain {

	public static void main(String[] args) {
		ln l= new ln();
		l.setA(20);
		ln l1=new ln();
		l.setOb(l1);
		l1.setA(56);
		ln l2=new ln();
		l2.setA(59);
		l1.setOb(l2);
		l2.setOb(null);
		

		System.out.println(l.getlin());


	}

}
