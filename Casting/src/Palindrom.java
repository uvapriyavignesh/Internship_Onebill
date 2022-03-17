
public class Palindrom {

	public static void main(String[] args) {
		int a=199;
				String b,res;
		pln p=new pln();
		b=p.name(a);
		res=""+a;
		
		
		if (b.compareTo(res)==0) {
			System.out.println(a+" is a palindrom");
			
			
		}
		else {
			System.out.println(a+" is not a palindrom");
		}
		
		
		

	}

}
class pln{
	public String name(int a) {
		String re = "";
		
		for (int i=0;i<3;i++) {
		re=re+a%10;
		a=a/10;
		
		}
		return re;
		
		
	}
}
