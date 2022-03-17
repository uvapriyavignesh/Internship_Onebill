package Thread;

public class ThreadTest implements Runnable  {
    static StringBuilder st=new StringBuilder("Ajay is bad boy.skjdhkashdfhasdhf");
    void test() {
    	synchronized (this){
    		for (int i=0;i<=st.length()-1;i++) {
    			System.out.println("r:"+st.charAt(i));
    			try {
    				Thread.sleep(90);
    			} catch (InterruptedException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    		}
    		}
    }
	public void run() {
		ThreadTest tt=new ThreadTest();
		tt.test();
		
		
	}
	
	

}
