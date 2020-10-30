
public class MoneyProcesses extends Accounts {
	
 
	public double cardSwipped(double avalBal, double cardCharges,double occurringCharges,double save ) {
		
		
		super.checkingAcct(avalBal, cardCharges, occurringCharges,save);
		
		
		if(sav.get(0)!=0) {
			
		System.out.println("The current Total saving available is: "+sav.get(0));}
		
		if(sav.get(2)!=0) {
			
		System.out.println("Your balance available is: "+sav.get(2));}
		
		if(sav.get(4)!=0||sav.get(3)!=0||sav.get(5)!=0) {
			
		System.out.println("These charges were made to your account: "+"App charges"+sav.get(4)+"Other charges: "+sav.get(3));
		
		System.out.println("$"+sav.get(5)+" will be charged after every swipe charges.");
		}
		
		return 0;
		
	}
	
	
	
	
}
