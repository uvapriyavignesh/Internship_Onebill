package interfaces;

import java.util.Comparator;

public class compareImplement implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
			sort s=(sort)o1;
			sort s1=(sort)o2;
			if (s.getAge()<s1.getAge()) {
				return -1;
			}
			else if(s.getAge()>s1.getAge()) {
				return 1;
			}
			return 0;
	}
	

}
