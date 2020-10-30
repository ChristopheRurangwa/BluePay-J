import java.util.ArrayList;


public class Accounts {
	
	
	static ArrayList<Double> sav=new ArrayList<>();
	
	/**
	 * 
	 * @param savings
	 * @param addi
	 * @return
	 */
	
	public static double savingAcct(double save) {
		double savings = 0;
		
		double total=savings+save;
		
		
		sav.add(0,total);
		
		return sav.get(0);
	}
	
	
	/**
	 * process all charges
	 * @param avalBal
	 * @param cardCharges
	 * @param occurringAmount
	 * @return 
	 */
	
	public static double checkingAcct(double avalBal, double cardCharges,double occurringCharges,double save ) {
		
		avalBal=savingAcct(save);//$
		
		final double appCharges=0.10;// cents 
		

		double balance= avalBal-cardCharges-appCharges-occurringCharges;
		 
		sav.add(1, balance);
		sav.add(2,avalBal);
		sav.add(3,cardCharges);
		sav.add(4,appCharges); 
		sav.add(5,occurringCharges);
		
		return sav.get(1);
	}
	
	
	
	

}
