
public class MoneyProcesses extends Accounts {
	
 
	public double cardSwipped( double cardCharges,double occurringCharges,double save) {
		
		super.checkingAcct( cardCharges, occurringCharges,save);
		
		
		
		if(sav.get(0)!=0.0) {
			
		System.out.println(" The current Total saving available is: $"+sav.get(0)+"\n");}
		
		if(sav.get(1)!=0.0) {
			
		System.out.println(" Your balance available is: $"+sav.get(1)+"\n");}
		
		
		if(sav.get(4)!=0.0||sav.get(3)!=0.0||sav.get(5)!=0.0) {
			
		System.out.println(" These charges were made to your account: "+"\n\n-App charges $"+sav.get(4)+" \n-Other card charges: $"+sav.get(3)+"\n\n");
		
		System.out.println(" $"+sav.get(5)+" will be charged after every swipe made.");
		}
		
		return 0;
		
	}
	
	
	
	
}
