package com.date;

import java.util.Scanner;

public class Vehicle_service {
	public static void printLogin(float Total,float t_cost,float e_cost,float gs_cost,float f_cost,float prod) {
		Scanner sc=new Scanner(System.in);
		int opp,tyre;
		
		Boolean yes = true;
		  System.out.println("\n\t\t\tOptions :-\n\t\t\t 1) Enter 1 for tyres relative problem ?");
		  System.out.println("\t\t\t 2) Enter 2 for Fual Tank relative problem ?");
		  System.out.println("\t\t\t 3) Enter 3 for Engine relative problem  ?");
		  System.out.println("\t\t\t 4) Enter 4 for General service relative problem  ?");
		  System.out.println("\t\t\t 5) Enter 5 Little problems product price and server tax is 200 ?\n");
		 
		  System.out.println("\t\t\tplease select your options ?\n");
		  opp=sc.nextInt();
		  if(opp == 1) {
			  t_cost = 400;
			  System.out.println("\t\t\tCost of tyre : "+t_cost);
			  
				  System.out.println("\t\t\tHow many tyre wants change ?");
				  tyre=sc.nextInt();
				  t_cost *= tyre;
				  System.out.println("\t\t\t"+t_cost);
			 
		  }else if(opp == 2) {
			  f_cost = 1500;
			  System.out.println("\t\t\t Cost of Fuel tank "+f_cost);
			 	  
		  }else if(opp == 3) {
			  e_cost = 5000;
			  System.out.println("\t\t\tcost of Engine "+e_cost);
			  
		  }else if(opp == 4) {
			  gs_cost = 1000;
			  System.out.println("\t\t\tcost of general service "+gs_cost);
			  
		  }else if(opp == 5) {
			  System.out.println("\t\t\tEnter cost of product ");
			  prod = sc.nextFloat();
			  prod = prod+200;
			  System.out.println("\t\t\tcost of Engine "+prod);			
		  }
		  else {
			  System.out.println("\t\t\tInvalid Option!...");
		  }
		  Total = e_cost + f_cost + gs_cost + t_cost+ prod+ prod;
		  
		  System.out.println("\t\t\tDo you wants add one more option Enter true/false...");
		    yes=sc.nextBoolean();
  
		  if(yes == true) {
			
			 printLogin(Total, t_cost, e_cost, gs_cost, f_cost, prod);
		  }else {
			  String name,issue ,vehicle;
			  sc.nextLine();
			  System.out.println("\t\t\tEnter your Owner Name : ");
			  name=sc.nextLine();
			  System.out.println("\t\t\tEnter your Vehice Name Name : ");
			  vehicle=sc.nextLine();
			  System.out.println("\t\t\tEnter your issue Name : ");
			  issue=sc.nextLine();
			  System.out.println("\t\t\t**************************************************************");
			  System.out.println("\t\t\tVEHICLE SERVICE CENTER");
			  System.out.println("\t\t\t----------------------\n");
			  System.out.println("\t\t\t Owner Name      : "+name);
			  System.out.println("\t\t\t vehicle Name    : "+vehicle);
			  System.out.println("\t\t\t Issues          : "+issue);
			  System.out.println("\t\t\t Total Bill      : "+Total);
			  System.out.println("\t\t\t**************************************************************");

		  }		  
		sc.close();  
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int wh;

		System.out.println("\n\t\t\tWELCOME TO SERVICE CENTER\n");
		System.out.println("\t\t\t-------------------------");
		System.out.println("\n\t\t\tPlease Enter number of Wheelers : ");
		wh=sc.nextInt();
		if(wh==2 || wh ==3 || wh == 4) {
			
		  printLogin(0, 0, 0, 0, 0, 0);
		  
		}else {
			System.out.println("\t\t\tNot accepet!...");
		}sc.close();
	}
}
