package ATMMachine;

import java.util.Scanner;

class ATM{
	float balance;
	int PIN = 0000;
	
	public void checkpin() {
		System.out.println("Enter your pin");
		Scanner sc = new Scanner(System.in);
		int enteredpin = sc.nextInt();
		if(enteredpin==PIN) {
			menu();
		}
		else {
			System.out.println("Enter a valid PIN: ");
			Scanner sc1 = new Scanner(System.in);
			int pin = sc1.nextInt();
			menu();
		}
		
	}
	
	public void menu() {
		System.out.println("Enter your choice");
		System.out.println("1. Chech a/c balance");
		System.out.println("2. Withdraw money");
		System.out.println("3.Deposit money");
		System.out.println("4. Exit");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		if(option==1) {
			checkBalance();
		}
		else if(option==2) {
			withdrawMoney();
			
		}
		else if(option==3) {
			depositMoney();
			
		}
		else if(option==4) {
			return;
			
		}
		else {
			System.out.println("Enter a valid choice");
		}
	}
	
	public void checkBalance() {
		System.out.println("Balance:" + balance);
		menu();
	}
	public void withdrawMoney() {
		System.out.println("Enter Amount to withdraw");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		if(amount>balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			balance = balance - amount;
			System.out.println("Money withdrawl successfully");
			
		}
		menu();
	}
	
	public void depositMoney() {
		System.out.println("Enter the amount");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		balance = balance + amount;
		System.out.println(" Money deposited successfully");
		menu();
	}
	
}




public class ATMMachine {

	public static void main(String[] args) {
		ATM obj = new ATM();
		obj.checkpin();

	}

}
