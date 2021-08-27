package main;

import java.util.Scanner;

import HanGilYong.ATM;
import HanGilYong.ATM_inter;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =0;
		num = sc.nextInt();
		System.out.println("1. 한길용 2. 이진원 3. 진동수 4. 이창훈 5. 이동호");
		switch(num) {
		case 1 : 
			ATM_inter atm = new ATM();
			atm.display();
			break;
		case 2 : break;
		case 3 : break;
		case 4 : break;
		case 5 : break;
		}
	}
}
