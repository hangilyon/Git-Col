package main;

import java.util.Scanner;
import jindongsu.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =0;
		LoginInterface log = new Login();

		while(true) {
			System.out.println("1. 한길용 2. 이진원 3. 진동수 4. 이창훈 5. 이동호");
			num = sc.nextInt();
			switch(num) {
				case 1 : break;
				case 2 : break;
				case 3 : log.display(); break;
				case 4 : break;
				case 5 : break;
			}
		}
	}
}