package abstraction;

public class Abstraction {

}
abstract class a{
	static {
		System.out.println("haii i am static");
	}
	{
		System.out.println("i am non static");
	}
	a(){
		System.out.println("con no argu");
	}
	a(int a){
		this();
		System.out.println("con with argu");
		
	}
	public abstract void man();
}
class b extends a{
	public void man() {
		System.out.println("haii iam man");
		
		
	}
	b(){
		super(67);
		System.out.println("i am cont of b");
	}
	}
