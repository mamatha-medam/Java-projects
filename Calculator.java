package Myprojects;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in)	;
		System.out.println("enter a number:");
		int  a = sc.nextInt();
		int  b = sc.nextInt();
		System.out.println("caluculator:+,-,/,*,%");
		char cal=sc.next().charAt(0);
		if(cal=='+') {
		System.out.println("result:"+(a+b));	
		}
		else if(cal=='-') {
			System.out.println("result:"+(a-b));	
			}
		else if(cal=='*') {
			System.out.println("result:"+(a*b));	
			}
		else if(cal=='/') {
			if(b!=0) {
			System.out.println("result:"+(a/b));	
			}
			else {
				System.out.println("zero is invalid");
			}
}
		else if(cal=='%') {
			System.out.println("result:"+a%b);
			
		}
		else {
			System.out.println("invalid");
		}
sc.close();
}
}