package interfaces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class sortAppMain  {

	public static void main(String[] args) {
		sort[] st= {new sort(1,56,"ravi",78),new sort(2,56,"ravi",987),new sort(3,90,"ravi",80),new sort(4,33,"ravi",87)};
		
		Comparator cage=(a,b) -> { 
		sort s1=(sort)a;
		sort s2=(sort)b;
		if (s1.getAge()>s2.getAge())
			return 1;
		else if (s1.getAge()<s2.getAge())
			return -1;
		return 0;
		};
		Comparator cmark=(a,b) -> { 
			sort s1=(sort)a;
			sort s2=(sort)b;
			if (s1.getMark()>s2.getMark())
				return 1;
			else if (s1.getMark()<s2.getMark())
				return -1;
			return 0;
			};
			Comparator cid=(a,b) -> { 
				sort s1=(sort)a;
				sort s2=(sort)b;
				if (s1.getsId()>s2.getsId())
					return 1;
				else if (s1.getsId()<s2.getsId())
					return -1;
				return 0;
				};
		do {
		System.out.println("sort on basics.....");
		System.out.println("1.Age \n2.marks\n3.id");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();

		
		
		switch(i) {
		case 1:
			Arrays.sort(st,cage);
			break;
		case 2:
			Arrays.sort(st,cmark);
			break;
		case 3:
			Arrays.sort(st,cid);	
			break;
		default:
			System.out.println("in valid input");
			
	
		}
		
		for (sort sort : st) {
			System.out.println(sort);
			
		}
		System.out.println("do you want to continue(1/0):");
		int ch=s.nextInt();
		if (ch==0) {
			break;
		}
		else {
			continue;
		}
		
		}while(true);
		
		
		

	}

}
