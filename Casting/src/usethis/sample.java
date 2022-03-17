package usethis;

public class sample {
	int a;
	int b;
	public sample(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public sample() {
		// TODO Auto-generated constructor stub
		
	}
	@Override
	public boolean equals(Object a) {
		sample s=(sample) a;
		if (this.a==s.a && this.b==s.b ) {
			return true;
			
		}
		return false;
		
	}
	

}
