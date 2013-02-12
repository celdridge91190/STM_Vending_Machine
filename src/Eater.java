/**
 * 
 */
public class Eater implements Runnable {
	public static final int TIME_IN_DAY = 1000;
	protected int numDays;
	
	private VendingMachine vend;
	public Eater(VendingMachine vend, int numDays){
		this.vend = vend;
		this.numDays = numDays;
	}
	  
	protected boolean takeCookie(long units){
		  vend.buyCookies(units);
		  return true;
	}
	  
	protected boolean takeCandy(long units){
    	  vend.buyCandy(units);        	  
		  return true; 
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
