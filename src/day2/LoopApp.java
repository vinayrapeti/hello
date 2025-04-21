package day2;

import java.util.Scanner;
public class LoopApp {
public static void main(String[] args) {
	Scanner src = new Scanner(System.in);
	int ch;
	do {
		Displaymenu();
		ch = Integer.parseInt(src.next());
		switch(ch) {
		case 1:
			withdraw();
		
		case 2:
			diposit();
			
		case 3:
			checkbalance();
		case 4:
			System.exit(0);
			break;
			
			default :
				System.out.println("invalid input");
		}
			
	
	}while(ch>0);
}

private static void Displaymenu() {
	System.out.println("Enter your choice: ");
	System.out.println("\t1.withdraw");
	System.out.println("\t2.diposit");
	System.out.println("\t2.checkbalance");
	
}

private static void checkbalance() {
	// TODO Auto-generated method stub
	int account =100000;
	int pin = 1234;
	Scanner src = new Scanner(System.in);
	System.out.println("Enter pin");
	int enteredpin =src.nextInt();
	if(enteredpin ==pin){
		System.out.println("Balance: "+account);
	}else {
		System.out.println("Wrong pin");
	}
	
}


private static void diposit() {
	// TODO Auto-generated method stub
	Scanner src = new Scanner(System.in);
	int account=100000;
	int pin=1234;
	System.out.println("how much amount will you diposit");
	int deposit=src.nextInt();
	System.out.println("Enter your pin");
	int enteredpin=src.nextInt();
	if(enteredpin == pin) {
		account=deposit+account;
		System.out.println("your balance is:" +account);
	}else {
		System.out.println("WRONG PIN");
	}

	
}


private static void withdraw() {
	// TODO Auto-generated method stub
	Scanner src = new Scanner(System.in);
	int account = 100000;
	int pin0 =1234;
	System.out.println("Select a account");
	System.out.println("1.current account");
	System.out.println("2.Savings account");
	int task=src.nextInt();
	if(task == 1) {
		System.out.println("enter the amount");
		int amount=src.nextInt();
		System.out.println("Enter your pin");
		int enteredpin = src.nextInt();
		if(enteredpin== pin0) {
			if(amount <=account) {
				System.out.println("Your transaction is Successfull");	
			}else {
				System.out.println("Insuffucient Funds");
		}
		}else {
			System.out.println("WRONG PIN");		
	}
	}else {
		System.out.println("enter the amount");
		int amount=src.nextInt();
		System.out.println("Enter your pin");
		int pin111 =src.nextInt();
		if(pin111 == pin0) {
			if(amount <=account) {
				System.out.println("Your transaction is Successfull");	
			}else {
				System.out.println("Insuffucient Funds");
		}
		}else {
			System.out.println("WRONG PIN");
		}
	
	}
}
}



