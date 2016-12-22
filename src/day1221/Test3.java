package day1221;

public class Test3 {

	public static void main(String[] args) {

		User3 oo = new User3();
		System.out.println(oo.sum(100));

		System.out.println(oo.upper('c'));

		System.out.println(oo.isUpper('K'));

		System.out.println(oo.isLeap(2015));

		System.out.println(oo.grade(90));

		int a=20; //
		oo.sub(a); // a는 실 매개변수,
		
		System.out.println(a); //20이 찍힌다. call by value == 변수가 다른 변수다.
		
		int[] arr ={1,2,3};
		oo.sub(arr); // arr 는 래퍼런스 변수
		System.out.println(arr[0]); //11 나온다. call by reference 
		
		
		
		
		
	} // 메인 메소드 종료

} // Test3 클래스 종료

class User3 {

	// 컴퓨터가 일을 할 수 있는 가장 작은 단위 , 한 가지 일만 하도록 하자-> 메소드
	// 소문자인 경우 대문자로 변환 , 필드와 메소드는 대문자로 시작하면 안된다!!!!!!!!!!!!!!
	public int sum(int n) { // 매개변수, 파라미터, 반드시 자료형을 써줘야한다.
		int s = 0;

		// 1~n까지의 합을 구하라.
		for (int i = 1; i <= n; i++) {
			s += i;
		}

		return s;
	}

	public char upper(char ch) {

		return ch >= 'a' && ch <= 'z' ? (char) (ch - 32) : ch;
	} // upper 메소드 종료

	
	public boolean isUpper(char ch) {
		// 대문자면 true , 소문자면 false
		return ch >= 'A' && ch <= 'Z';
	} // isUpper 메소드 종료

	
	public boolean isLeap(int year) {
		// 윤년인지 판별
		// 년도가 4의 배수이고 100의 배수가 아니거나 400의 배수이면

		/*
		 * boolean result = true;
		 * 
		 * if (year % 4 == 0) { if (year % 100 != 0 && year % 400 == 0) { result
		 * = true; }
		 * 
		 * }
		 * 
		 * return result;
		 */

		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

	} // isLeap 메소드 종료

	// 점수에 따른 평점 (95~100 : 4.5, 90~94 : 4.0 ...)

	public double grade(int s) {
		double result;

		if (s >= 95) {
			result = 4.5;
		} else if (s >= 90) {
			result = 4.0;
		} else if (s >= 85) {
			result = 3.5;
		} else {
			result = 0;
		}

		return result;

	} // grade 메소드 종료

	public void sub(int a) { //

		a += 10;
		//void인 경우 return 생략 가능
	
	} //sub 메소드 종료

	public void sub(int[] n){
		
		n[0] +=10;
		
	}
	
	
	
}
