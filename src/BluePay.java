import java.util.Scanner;

public class BluePay {

	public static void main(String[] args) {
		
		MoneyProcesses money=new MoneyProcesses();
		
		Accounts acct=new Accounts();
		Scanner scan=new Scanner(System.in);
		
		double charges=0.0;
		double val=0.0;
		double amntwd;
		
		System.out.println("\n");
		System.out.println("             |---WELCOME TO BLUEPAY---|\n\n");
		System.out.println("||___________________******_______________________||\n||");
		System.out.println("||1. ENTER OWED AMOUNT.                            ||\n||");
		System.out.println("||                                                ||\n||");
		System.out.println("||2. CHECK CURRENT BALANCE.                       ||\n||");
		System.out.println("||                                                ||\n||");
		System.out.println("||3. ENTER AMOUNT TO BE CHARGED AFTER EVERY SWIPE.||\n||");
		System.out.println("||                                                ||\n||");
		System.out.println("||4. CHECK SAVINGS ACCOUNT.        		  ||\n||");
		System.out.println("||                                                ||\n||");
		System.out.println("||5. CHARGES MADE TO YOUR ACCOUNT.                ||\n||");
		System.out.println("||                                                ||\n||");
		System.out.println("||6. Exit.                                        ||\n||");
		System.out.println("||                                                ||\n||");
		System.out.println("||____________________******______________________||\n");
		
		
		int choix;
		do {
			System.out.print("\n##->");
		 choix=scan.nextInt();
		 
		switch(choix) {
		
		case 1:{
			System.out.println("Enter the amount owed.");
			System.out.print("$");
			amntwd=scan.nextDouble();
			System.out.print("Enter amount to be charged for every swipe.\n");
			System.out.print("$");
			charges=scan.nextDouble();
			
			Accounts.loanLoad(charges, amntwd);
		}
			
			
			break;
		case 2:{
			
			money.cardSwipped( 0.0, 0.0, 5673);}
			break;
		case 3:{
			
			System.out.print("Enter amount to be charged for every swipe.\n");
			charges=scan.nextDouble();
			money.cardSwipped(0, charges,Accounts.savingAcct(5673));
			
		     }
			
			
			break;
		case 4:System.out.print("AVAILABLE AMOUNT IS: $"+Accounts.savingAcct(5673));
			break;
		case 5:
		{System.out.print("Enter amount to be charged for every swipe, enter 0.0 for not none.\n");
		charges=scan.nextDouble();
	Accounts.charg(400,charges,Accounts.savingAcct(5793));

   }
			break;
		case 6: System.exit(0);break;
		default:{
			System.out.print("Wrong selection, Try again...");
			choix=scan.nextInt();
			
		}
		
		
		}
		}while(choix<6);

	}

}
