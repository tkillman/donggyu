package day1223;

import java.util.Scanner;

public class UserService_m {
		
		User_m[] data = new User_m[11];
		int count=1;
		Scanner sc = new Scanner(System.in);
		
	
	public User_m[] getData() {
			return data;
		}


		public int getCount() {
			return count;
		}



	public void put(){
		if(count>10){
			
			System.out.println("입력 범위 초과");
			return;
			
		}
		
		data[count] = new User_m(); 
		System.out.println("이름을 입력하세요.");
		data[count].setName(sc.next());
		System.out.println("나이를 입력하세요.");
		data[count].setAge(sc.nextInt());
		count++;
		
		
		
	}
	

}
