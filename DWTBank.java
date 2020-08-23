package bankingApp;

import java.util.Scanner;

public class DWTBank {

	public static void main(String[] args) {
		
		
		//BankAccount object created with values set by constructor variables.
		
		BankAccount ba = new BankAccount("ABC","A123");
		ba.showMenu();

		}

	}

	//Scanner "not closed" -- Suppression annotation added to stop "resource leak."

 	@SuppressWarnings("resource")
 
 	class BankAccount {
	 
	 //Declaration of Class variables
	 
	 int amount;
	 int balance;
	 int previousTransaction;
	 String customerName;
	 String customerId;
	 
	 //Constructor passing Class variables with new values.
	 
	 BankAccount(String cname,String cid) {
		 
		 customerName = cname;
		 customerId = cid;
		 
	 	}
	 
	 //Methods for user transactions.
	 
	 void deposit(int amount) {
		 
		 if(amount != 0)
		 
		 {
			 balance = balance + amount;
			 previousTransaction = amount;
		 }
		 
	 }
		
      void withdraw(int amount) {
			 
			 if(amount != 0)
				 
			 {
				 balance = balance - amount;
				 
				 //Balance set to negative to reflect withdrawal. 
				 
				 previousTransaction = -amount;
			 }
			 
      	}
			 
	 void getPreviousTransaction() {
		 
		 if(previousTransaction > 0 ) 
			 
		 { 
			 System.out.println("Deposited: "+previousTransaction);
		 }
		 
		 else if (previousTransaction < 0 ) 
		 { 
			 System.out.println("Withdrawn: "+Math.abs(previousTransaction));
		 }
		 
		 else 
		 {
			 System.out.println("No Transaction Occurred.");
		 }
	 }
	
	 void showMenu() {
	 } 
	 
	 	{
		 //Declaration of variable initialized with any value.
		 
		 char option = '\0';
		 
		 //Scanner object created to take user input.
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 //Print statements for user input options.
		 
		 System.out.println("Welcome "+customerName);
		 System.out.println("Your ID is "+customerId);
		 
		 //Line break for application display design.
		 
		 System.out.println("\n");
		 System.out.println("1. Check Balance");
		 System.out.println("2. Deposit");
		 System.out.println("3. Withdraw");
		 System.out.println("4. Previous Transaction");
		 System.out.println("5. Exit");
	 
		 do {
			 
		 //Print statements for application display design and user input.
			 
			 System.out.println("===============================");
			 System.out.println("Select Option.");
			 System.out.println("===============================");
			 
			 //Option variable set to capture user input and display corresponding menu 
			 //selection with index position value set by initial option declaration.
			 
			 option = scanner.next().charAt(0);
			 
			 //Print statement for application display design.
			 System.out.println("\n");
			 
			 //Option variable passed into switch case to be compared with each case;
			 //When match found the corresponding code will be executed.
			 
			 switch(option) {
			 
			 case '1':
				 
				//Print statements for application display design and user input.
				 
				 System.out.println("---------------------------------");
				 System.out.println("Balance = "+balance);
				 System.out.println("---------------------------------");
				 System.out.println("\n");
				 break;
				 
			 case '2':
				 
				//Print statements for application display design and user input.
				 
				 System.out.println("----------------------------------");
				 System.out.println("Enter an amount to deposit:");
				 System.out.println("----------------------------------");
				 
				 //Scanner to take user input for "deposit."
				 int amount = scanner.nextInt();
				 
				 //Amount variable passed into deposit method.
				 deposit(amount);
				 
				//Print statements for application display design.
				 System.out.println("\n");
				 break;
				 
			 case '3':
				 
				 //Print statements for application display design and user input.
				 
				 System.out.println("----------------------------------");
				 System.out.println("Enter an amount to withdraw:");
				 System.out.println("----------------------------------");
				 
				 //Scanner to take user input for "withdraw."
				 int amount2 = scanner.nextInt();
				 
				 //Amount variable passed into deposit method.
				 deposit(amount2);
				 
				//Print statements for application display design.
				 System.out.println("\n");
				 break;
				 
			 case '4':
				 
				 //Print statements for application display design and user input.
				 
				 System.out.println("----------------------------------");
				 
				 //Calls getPreviousTransaction method.
				 getPreviousTransaction();
				 
				 System.out.println("----------------------------------");
				 
				//Print statements for application display design.
				 
				 System.out.println("\n");
				 break;
				 
			 case '5': 
				//Print statements for application display design.
				 
				 System.out.println("**********************************");
				 break;
				 
				 //Default set for invalid input option by user.
				 
				 default:
					 System.out.println("Invalid Option. Please try again.");
					 break;
					 }
		 		}
		 
		 		//
				 while(option != '5');
			 
			 		System.out.println("Thank you for banking with DWTBank. Have a great Day.");

			 	};
			{
		}
 	}	

		

 
	 
 