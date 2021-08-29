package jindongsu;

import java.util.Scanner;

public class Login implements LoginInterface {

	public void display() {
		System.out.println("1.로그인 2.로그아웃 3.아이디찾기 4.비밀번호찾기");
		System.out.print(">>> ");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		switch(choice) {
			case 1 : login();  break;
			case 2 : logout(); break;
			case 3 : findId(); break;
			case 4 : findpw(); break;
		}
	}

	public void login() {
		System.out.println("로그인 했습니다!!");
	}

	public void logout() {
		System.out.println("로그아웃 했습니다!!");
	}

	public void findId() {
		System.out.println("아이디를 찾았습니다!!");
	}

	public void findpw() {
		System.out.println("비밀번호를 찾았습니다!!");
	}

}
