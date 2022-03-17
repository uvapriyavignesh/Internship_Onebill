package interfaces;

import java.util.Arrays;

public class Student {

	public static void main(String[] args) {
		sort[] st= {new sort(1,56,"ravi",78),new sort(2,56,"ravi",987),new sort(3,90,"ravi",80),new sort(4,33,"ravi",87)};
		
        Arrays.sort(st,new compareImplement());
        for (sort sort : st) {
        	System.out.println(sort);
			
		}
	}
	

	
}
