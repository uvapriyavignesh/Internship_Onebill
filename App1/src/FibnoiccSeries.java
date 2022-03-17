import java.util.Scanner;

public class FibnoiccSeries {

	public static void main(String[] args) {
		int a=0,b=1,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the destination :");
		
		c=s.nextInt();
		
		
		
		fib fib=new fib();
		fib.tes(a, b, c);
		

	}

}
class fib{
	public void tes(int a,int b,int c) {
		int temp;
		for (int i=0;i<=c;i++) {
			if (a>=c) {
				break;
			}
			else {
		System.out.print(a+" ");
			}
		temp=a;
		a=b;
		b=a+temp;
		}
		
		
		
		
		
	}
}
