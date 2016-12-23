package day1223;

import java.util.Scanner;

public class UserApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ch;

		UserService service = new UserService();
		
		
		try {

			while (true) {
				do {
					
					System.out.print("1.입력 2. 출력 3. 종료 => ");
					ch = sc.nextInt();
					
					

				} while (ch < 1 || ch > 3);

				switch (ch) {
				case 1:
					service.input();
					break;
			
				case 2:
				
					UserResult result = new UserResult(service);
					result.print();
					
					break;
					
				case 3:
					System.out.println("종료합니다");
					System.exit(0);
					break;

				}

			}

		} catch (Exception e) {
			// TODO: handle exception
			
			
			e.printStackTrace();
		}

	}// 메인 메소드 종료

	
	
	
	
}
