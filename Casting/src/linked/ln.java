package linked;

public class ln {
	private int a;
	private ln ob;
	private static String str;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public ln getOb() {
		return ob;
	}
	public void setOb(ln ob) {
		this.ob = ob;
		
	}
	
	static void sam(ln a) {
		str=str+(" Data:"+a.getA()+" Adress:"+a.getOb());
		try {
			sam(a.getOb());
		}
		catch(Exception e){
			
			
		}
		
			
		
	}
	public String getlin() {
		
		
		//return ""+getA()+" "+l.getA()+" "+l.getOb().getA();
		str="Data:"+getA()+" Adress:"+getOb();
		sam(ob);
			
		
			
			
		return str;
		
		
	}

}
