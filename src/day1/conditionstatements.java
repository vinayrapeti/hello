package day1;

import java.util.Scanner;

public class conditionstatements {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the user age :");
		int age = src.nextInt();
		if(age >= 18 && age<=120) {
			System.out.println("Elgible for pan card");
		}else {
			System.out.println("Not Eligible");
		}
		src.close();
	}

}
