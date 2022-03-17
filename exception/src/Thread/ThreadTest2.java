package Thread;

import java.util.Collections;

public class ThreadTest2 extends Thread{
	@Override
    
	public void run() {
		for (int i=1;i<=ThreadTest.st.length()-1;i++) {
			ThreadTest.st.replace(i, i+1, ""+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

