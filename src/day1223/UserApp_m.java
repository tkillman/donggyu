package day1223;

import java.util.Scanner;

public class UserApp_m {

	public static void main(String[] args) {

		UserService_m service = new UserService_m();

		Scanner sc = new Scanner(System.in);
		int cnt;

		while (true) {

			do {
				System.out.println("1번은 입력 ,2번은 출력,3번은 종료");
				cnt = sc.nextInt();

			} while (cnt > 3 || cnt < 1);

			switch (cnt) {
			case 1:
				service.put();
				break;
			case 2:

				UserResult_m result = new UserResult_m(service);
				result.print();
				
				break;
			case 3:
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
				break;
			} // 스위치문

		}//무한 루프

	}

}
