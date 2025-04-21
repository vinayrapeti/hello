package day1;

import java.util.Scanner;

public class switchstatement {
public static void main(String[] args) {
	Scanner src = new Scanner(System.in);
	Displaymenu();
	int vote = src.nextInt();
	switch(vote) {
	case 1:
		TDP();
		break;
	case 2:
		janasena();
		break;
	case 3:
		ysrcp();
		break;
	case 4:
		bjp();
		
		break;
	default:
		System.out.println("unexpectedvote: " +vote);
	}
	
}

private static void bjp() {
	// TODO Auto-generated method stub
	System.out.println("bjp");
	
}

private static void ysrcp() {
	// TODO Auto-generated method stub
	System.out.println("ysrcp");
	
}

private static void janasena() {
	// TODO Auto-generated method stub
	System.out.println("janasena");
	
}

private static void TDP() {
	// TODO Auto-generated method stub
	System.out.println("TDP");
	
}

private static void Displaymenu() {
	// TODO Auto-generated method stub
	System.out.println("\t1.TDP");
	System.out.println("\t2.janasena");
	System.out.println("\t3.ysrcp");
	System.out.println("\t4.bjp");
	System.out.println("choose a vote :");
	
}
}
