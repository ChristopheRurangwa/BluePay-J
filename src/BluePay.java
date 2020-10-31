import java.util.Scanner;

public class BluePay {

	public static void main(String[] args) {
		
		MoneyProcesses money=new MoneyProcesses();
		
		Accounts acct=new Accounts();
		Scanner scan=new Scanner(System.in);
		
		double charges=0.0;
		
		System.out.println("\n");
		System.out.println("             |---WELCOME TO BLUEPAY---|\n\n");
		System.out.println("||___________________******_______________________||");
		System.out.println("||                                                ||\n||");
		System.out.println("||1. CHECK CURRENT BALANCE.                       ||\n||");
		System.out.println("||                                                ||\n||");
		System.out.println("||2. ENTER AMOUNT TO BE CHARGED AFTER EVERY SWIPE.||\n||");
		System.out.println("||                                                ||\n||");
		System.out.println("||3. CHECK SAVINGS ACCOUNT.        		  ||\n||");
		System.out.println("||                                                ||\n||");
		System.out.println("||4. CHARGES MADE TO YOUR ACCOUNT.                ||\n||");
		System.out.println("||                                                ||\n||");
		System.out.println("||5. CHECK SWIPE-OCCURING PAYMENT.                ||\n||");
		System.out.println("||                                                ||\n||");
		System.out.println("||6. WITHDRAW FROM SAVING ACCOUNT.                ||\n||");
		System.out.println("||____________________******_____________________||\n");
		
		
		int choix;
		do {
			System.out.print("\n##->");
		 choix=scan.nextInt();
		 
		switch(choix) {
		
		case 1:
			{
			
			money.cardSwipped( 0.0, 0.0, 5673);}
			
			break;
		case 2:{
			
			System.out.print("Enter amount to be charged for every swipe.\n");
			charges=scan.nextDouble();
			money.cardSwipped(0, charges,Accounts.savingAcct(5673));
			
		     }
			break;
		case 3:{
			System.out.print("AVAILABLE AMOUNT IS: $"+Accounts.savingAcct(5673));
			}
			break;
		case 4:{
				
			
		       }
			break;
		case 5:
		
		
		}
		}while(choix<6);

	}

}
