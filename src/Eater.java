/**
 * 
 */
public class Eater {
	public static final int TIME_IN_DAY = 1000;
	private static final EnergySource energySource = EnergySource.create(); //Will need to change to "Vending machine"
	  
	protected boolean takeCookie(){
    	  energySource.useEnergy(10);        	  
		  return true;
	}
	  
	protected boolean takeCandy(){
    	  energySource.useEnergy(10);        	  
		  return true; 
	}

}
