package day1223;

public class test6_m {
	
	public static void main(String[] args) {
		
		
		test4_m t4 = new test4_m();
		
		
		t4.setX(3);
		
		test5_m t5 = new test5_m(t4);		
		
		
		System.out.println(t5.x);
		
		// t4 객체를 t5가 공유하는 상황
		// t4의 값이 바뀌면 t5의 값도 바뀐다. 
		
		
		
		
	}
	

}
