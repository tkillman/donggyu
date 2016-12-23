package day1223;

import java.util.Scanner;

public class UserService {

	private User[] data = new User[10]; //유저의 객체를 선언할 변수만 선언한 것
	
	
	private int cnt ; // 몇명까지 받았는가?
	private Scanner sc = new Scanner(System.in);

	
	public User[] getData() {
		return data;
	}

	public int getCount() {
		return cnt;
	}

	public void input() {
		if (cnt >= 10) {

			System.out.println("정원 초과....");
			return;

		}
		
		
		data[cnt] = new User();
		//!!!!!! 오늘의 핵심!!!!! 변수만  선언한 것으로 끝나지 말고 생성자로 메모리 할당하자!
		System.out.print("이름 :?");
		data[cnt].setName(sc.next()); 
		
		// nullpointexception 
		
		System.out.println("나이 ?");
		data[cnt].setAge(sc.nextInt());
		
		cnt++;
		System.out.println("cnt 값 : " +cnt);
		
	} //input 메소드 종료

	
	
	
}
