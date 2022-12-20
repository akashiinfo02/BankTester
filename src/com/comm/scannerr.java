package com.comm;

import java.util.Scanner;

public class scannerr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		bankaccount obj = new bankaccount ("Akash kumar " , "xzw123");
		obj.showMenu();
		
	

		
		System.out.println(" enter the number");
		Scanner cc= new Scanner(System.in);
		int  num = cc.nextInt();
		char a= cc.next().charAt(1);
		
		
		System.out.println(" the value entered is" + num);
		System.out.println(" the char is " + a);
	}
}
		
		
		
		class bankaccount {
			String customername;
			String customerId;
			double netbalance;
			int pretransaction;
			
			
			bankaccount(String cname,String cuid) {
				
				
				this.customername = cname;
				this.customerId = cuid;
				
			}
			
			void deposit(int amount) {
				
				if ( amount !=0) {
					 netbalance = netbalance + amount;
					 pretransaction = +amount;  // here + sign denotes adding amount
					 
				}
				
		
				}
			
			void withdraw (int amount) {
				
				if (amount !=0) {
					netbalance = netbalance - amount;
					pretransaction= -amount;  // -denotes withdral of the amount i.e deduction
	
				}
			}
			
			void getpretransaction() {
				
				if ( pretransaction > 0) {   /// deposit
					
					System.out.println(  " Amount Deposited is  " + pretransaction);
					
				}
				else if (pretransaction < 0) { /// withdraw
					
					System.out.println( " Amount deducted is "  + Math.abs(pretransaction));
					
				}
				
				else {
					System.out.println( " neither deposit nor withdraw is done");
				}
				
			}
			
			void showMenu() {
				
				char option = '\0';  // here we have inialized the char 
				Scanner scan = new Scanner (System.in);
				
				System.out.println( "welcome " + customername);
				System.out.println( "you customerid "+ customerId);
				System.out.println();
				
				System.out.println("A. Account details");
				System.out.println("B. Deposits");
				System.out.println("C. withdraws");
				System.out.println("D. Services");
				System.out.println("E. Exit");
				
				
				do {
					
					System.out.println(" enter the option");
					option = scan.next().charAt(0);
					
					switch (option) {
					
					case 'A' :
						System.out.println( " check account balance  &  previous transaction ");
						break;
						
					case 'B':
						System.out.println("know your amount deposited  "  );
						int amount1 = scan.nextInt();
						deposit(amount1);  /// here we are passing the amount to the deposit ..
						break;
						
					case 'C' :
						System.out.println(" recent withdraws ");
						int amount2 = scan.nextInt();
						withdraw(amount2);     ///////     here we are passing the amount to the withdraw method.
						break;
							
					case 'D' :
						System.out.println(" Explore services ");
						getpretransaction();
						break;
					
					case 'E' :
						System.out.println(" Exit ");
						break;
					
						
						default :
							System.out.println(" invalid input");
							break;
							
							
					
					}
				} while ( option != 'E') ;
				
				System.out.println(" thank u  for visting axis bank");
				
					
				
				} 
			}
		
					
					
		
		
				
			
			
			
		
		
	
