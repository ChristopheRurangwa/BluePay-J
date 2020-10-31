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
		double savings = 100;
		
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
	
	public static double checkingAcct( double cardCharges,double occurringCharges,double save) {
		
		double avalBal=savingAcct(save);//$
		
		final double appCharges=0.10;// cents 
		

		double balance= avalBal-cardCharges-appCharges-occurringCharges;
		 
		sav.add(1,balance);
		sav.add(2,avalBal);
		sav.add(3,cardCharges);
		sav.add(4,appCharges); 
		sav.add(5,occurringCharges);
		
		return sav.get(1);
	}
	
	public static double charg( double cardCharges,double occurringCharges,double save) {
		
		checkingAcct(cardCharges, occurringCharges,save);
		
		System.out.println("Card charges: $"+sav.get(3));
		System.out.println("App charges: $"+sav.get(4));
		System.out.println("Occurring charges: $"+sav.get(5));
		
		return 0;
		
	}
	
	
	
	

}
