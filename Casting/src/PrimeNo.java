import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter the number:");
		Scanner s= new Scanner(System.in);
		a=s.nextInt();
		Prime p=new Prime();
		b=p.sam(a);
		if (b<=2) {
			System.out.println(a+" is prime number");
		}
		else {
			System.out.println(b+" is not prime number");
		}
		
		
		

	}

}
class Prime{
	public int sam(int a) {
		int c=0;
		for (int i=1;i<=a/2;i++) {
			if (a%i==0) {
				c++;
				continue;
				
			}
			
		}
		return c;
		
	}
	
	
}
