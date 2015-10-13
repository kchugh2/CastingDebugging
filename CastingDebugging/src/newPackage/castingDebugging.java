package newPackage;

import java.util.Scanner;

public class castingDebugging {
	public static void main(String[] args) {
		Scanner cookie = new Scanner(System.in);
		String input;
		int accumulator = 0;
		
		System.out.print("Gimme a number :");
		input = cookie.next();
		while (input != "")
		{
			accumulator += Integer.valueOf(input);
			
			System.out.println(" running total => " + accumulator);
			System.out.print("Next number : ");
			input = cookie.next();
		}
	}
}
