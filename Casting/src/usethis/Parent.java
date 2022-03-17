package usethis;

public class Parent extends Child {
	int a=17;
	int b=20;
	public Parent() {
		super();
		System.out.println("haa iam parent comn");
		
	}
	public Parent(int a, int b) {
		
		System.out.println("haa iam parent comn(24,78)");
		this.a = a;
		this.b = b;
	}
	@Override
	public  void Childs()
	{
		System.out.println("overload");
		
	}

}
