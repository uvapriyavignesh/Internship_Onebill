import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		int b,c;
		int a;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number of digits:");
		c=scanner.nextInt();
		System.out.println("enter the digits:");
		
		a=scanner.nextInt();
		ams as=new ams();
		b=as.tes(a,c);
		if (a==b) {
			System.out.println(b+" is a Amstrong number");
			
		}
		else {
			System.out.println(b+" is not a Amstrong number");
			
		}
		

	}

}
class ams{
	public int tes(int a,int c) {
		int tes,res = 0;
		for (int i=0;i<=c;i++)
		{
		tes=a%10;
		
		res=res+(tes*tes*tes);
		a=a/10;
		}
		return res;
		
	}
}
