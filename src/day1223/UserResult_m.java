package day1223;

public class UserResult_m {
	
	UserService_m service;
	User_m[] data;
	int count;
	
	public UserResult_m(UserService_m service) {
		this.service = service;
		data = service.getData();
		count = service.getCount();
	
	}
	
	public void print(){
		System.out.println(count);
		for(int i=1;i<count;i++){
			System.out.println("회원번호 :" + i + "회원 이름 : " + data[i].getName() + "회원 나이 : " + data[i].getAge());
		}
		
	}
	

}
