package day1223;

public class UserResult {

	private User[] data;
	private int cnt;
	private UserService service;

	
	public UserResult(UserService service) {

		
		// 서비스의 객체를 아직 생성하지 않았다.
		this.service = service;//!!!!!!!!!!!!!!! 생성된 객체를 넘겨받았다.
		data = this.service.getData();
		cnt = this.service.getCount();
		

	}

	
	public void print() {

		for (int i = 0; i <= cnt; i++) {
			
			System.out.println("cnt 숫자 :" +cnt);
			
			System.out.println(data[i].getName() + ":" + data[i].getAge());
		}

	}

}
