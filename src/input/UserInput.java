package input;

import java.util.Scanner;

public class UserInput {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static int getInt(){
		System.out.print("Integer input: ");
		return Integer.parseInt(scanner.nextLine());
	}
	
	public static int getInt(int min, int max){
		boolean userIsNotAnIdiot = true;
		int x;
		do {
			System.out.println("Please input an integer between " + min + " and " + max);
			x = getInt();
			if (x >= min && x <=max){
				userIsNotAnIdiot = true;
			}
			else {
				System.out.println("Error.  Input must be between " + min + " and " + max);
				userIsNotAnIdiot = false;
			}
		} while(!userIsNotAnIdiot);
		return x;
	}
	public static char getChar(){
		System.out.print("Character input: ");
		return scanner.nextLine().charAt(0);
	}
	
	public static char getChar(char min, char max) {
		min = Character.toUpperCase(min);
		max = Character.toUpperCase(max);
		boolean userIsNotAnIdiot = true;
		char x;
		do {
			System.out.println("Please input a character between " + min + " and " + max);
			x = getChar();
			char temp = x;
			temp = Character.toUpperCase(temp);
			if (temp >= min && temp <=max){
				userIsNotAnIdiot = true;
			}
			else {
				System.out.println("Error.  Input must be between " + min + " and " + max);
				userIsNotAnIdiot = false;
			}
		} while(!userIsNotAnIdiot);
		return x;
	}
	
	public static double getDouble(){
		System.out.print("Double input: ");
		return Double.parseDouble(scanner.nextLine());
	}
	
	public static double getDouble(double min, double max){
		boolean userIsNotAnIdiot = true;
		double x;
		do {
			System.out.println("Please input a double between " + min + " and " + max);
			x = getDouble();
			if (x >= min && x <=max){
				userIsNotAnIdiot = true;
			}
			else {
				System.out.println("Error.  Input must be between " + min + " and " + max);
				userIsNotAnIdiot = false;
			}
		} while (!userIsNotAnIdiot);
		return x;
	}
	
	public static String getString(){
		System.out.print("String input: ");
		return scanner.nextLine();
	}
	
	public static String getString(int min, int max){
		boolean userIsNotAnIdiot = true;
		String x;
		do {
			System.out.println("Please input a string between " + min + " and " + max + " characters long");
			x = getString();
			if (x.length() >= min && x.length() <=max){
				userIsNotAnIdiot = true;
			}
			else {
				System.out.println("Error.  Input must be between " + min + " and " + max);
				userIsNotAnIdiot = false;
			}
		} while(!userIsNotAnIdiot);
		return x;
	}
	
	
	public static void main(String[] args){
		System.out.println("Integer input test.");
		System.out.println("Integer: " + getInt(0,100));
		
		System.out.println("Character input test.");
		System.out.println("Character: " + getChar('A','Z'));
		
		System.out.println("Double input test.");
		System.out.println("Double: " + getDouble(0,100));
		
		System.out.println("String input test.");
		System.out.println("String: " + getString(0,40));
	}
}
