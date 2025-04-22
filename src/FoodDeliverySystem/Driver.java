package FoodDeliverySystem;

import java.util.*;

public class Driver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String menu1[]={"Pizza","Burger","Pasta","Sandwich","Fries"};
		Restaurant res1=new Restaurant("KFC", menu1);
		String menu2[]= {"Biriyani","Fried Rice","Chilli Chicken","Fish Fry","Chowmin"};
		Restaurant res2=new Restaurant("Oudh", menu2);
		Restaurant res[]= {res1,res2};
		System.out.println("Enter Your Name : ");
		String name=sc.nextLine();
		Customer customer=new Customer(name);
		System.out.println("Select Restaurant");
		for(int i=0;i<res.length;i++) {
			System.out.println("1 -> Restaurant 1");
			System.out.println("2 -> Restaurant 2");
		}
		System.out.println("Enter Your Choice");
		int n=sc.nextInt();
		while(true) {
			for(int i=0;i<res[n].menu.length;i++) {
				System.out.println((i+1)+" - "+res[n].menu[i]);
			}
			System.out.println("Enter Your Food");
			
		}
	}
}
