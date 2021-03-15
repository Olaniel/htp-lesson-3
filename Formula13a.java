package by.htp.less02.main;

import java.util.Scanner;

public class Formula13a {

	public static void main(String[] args) {// comment
		double a;
		double b;
		double c;
		double d;
		double result;
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a: ");
		while(!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Enter a: ");
		}
		a = sc.nextDouble();		
		sc.nextLine();

		System.out.print("Enter b: ");
		while(!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Enter b: ");
		}
		b = sc.nextDouble();		
		sc.nextLine();
		
		System.out.print("Enter c: ");
		while(!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Enter c: ");
		}
		c = sc.nextDouble();		
		sc.nextLine();
		
		System.out.print("Enter d: ");
		while(!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Enter d: ");
		}
		d = sc.nextDouble();		
		sc.nextLine();
		
		result = ((b + Math.sqrt(b*b + 4*a*c))/2*a) - (Math.pow(a, 3)*c) + b;
		
		System.out.println("Result = " + result);
		
	}

}
