package HanGilYong;

import java.util.Scanner;

public class ATM implements ATM_inter{

	public void display() {
		System.out.println("1. 입금 2. 출금 3. 잔액내역");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		case 1 : inputMoney();
			break;
		case 2 : outputMoney(); 
			break;
		case 3 : balance(); 
			break;
		}
		
	}

	public void inputMoney() {
		System.out.println("돈을 입금합니다.");
	}

	public void outputMoney() {
		System.out.println("돈을 출금합니다.");
	}

	public void balance() {
		System.out.println("현재 얼마 남았습니다.");
	}

}
