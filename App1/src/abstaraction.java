
public class abstaraction {

	public static void main(String[] args) {
		samp s=new test();
		s.name();
		test t=(test)s;
		s.name();
		t.ame();
		// TODO Auto-generated method stub

	}

}
abstract class samp{
	public abstract void name();
}
class test extends samp{

	@Override
	public void name() {
		System.out.println("iii");
		
	}
	public void ame() {
		
	}
	
}
