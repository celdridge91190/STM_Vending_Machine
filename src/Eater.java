/**
 * 
 */
public class Eater {
	public static final int TIME_IN_DAY = 1000;
	private static final VendingMachine vend = VendingMachine.create();
	  
	protected boolean takeCookie(long units){
		  vend.buyCookies(units);
		  return true;
	}
	  
	protected boolean takeCandy(long units){
    	  vend.buyCandy(units);        	  
		  return true; 
	}

}
