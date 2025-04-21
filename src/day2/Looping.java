package day2;

import java.util.Scanner;

public class Looping {
public static void main(String[] args) {
	Scanner src = new Scanner(System.in);
	System.out.println("Enter your number");
	int n=src.nextInt();
	for (int i=0;i<=n;i++) {
		System.out.println(i);
	}
}
}

