package day1227;

import java.util.Scanner;



/*
 상속과 클래스
 생성자의 특징 : 상위 클래스의 생성자에 매개변수가 있는 생성자를 정의한 경우 반드시 디폴트 생성자를 명시해야한다.
 
 static과 final : static은 메소드 영역에 할당, final은 상수의 의미를 갖는다.
 
 abstract 클래스 
 사용 이유 : 1. 객체 생성이 불가능해서 메모리 할당을 하지 않아 사용 낭비가 없다. 
 		  2. 사용자가 오버라이딩 해야 할 메소드를 제시 할 수 있다.
 
 인터페이스
 멤버 변수 : public final abstract 가 붙었다고 생각. 즉 상수다.
메소드 : public abstract 가 붙었다고 생각. 즉 추상 메소드
 
사용 이유? 다중 상속이 가능하다. 
 */

public class test1 {

	public static void main(String[] args) {
		String str;// 대표적인 final 클래스 , 필드에 붙이면 값 수정 불가 파이널 변수는 대문자로 표현, 
		
		//User3 u3 = new User3(); 추상 클래스는 객체 생성 불가능.
		
	}
}


class  User1 { 

	public static final double PI; //PI의 초기화
	
	static {
		PI=3.14;
	}
	
	public User1(){} // Demo1이 User1을 상속한 상태에서 User1의 매개변수가 존재하는 생성자를 만든 경우 , 디폴트 생성자를 명시해주지 않으면 오류발생
					// 왜? 자식 클래스에 디폴트 생성자에는 super(); 가 존재하므로

	public User1(int n) {

	}
	
	
	public void print() {
	}

	public void print2(){}
	
	public void print3(){}
	

}

class Demo1 extends User1 {

	
	public int print(int b) {// 상위 클래스의 print 메소드와는 무관
		return 0;
	} 

	
	public void print() {  // 메소드 오버라이딩
		
	}

	
	/*void print2() {
	}// 하위 클래스의 접근 제어자는 상위 클래스의 접근 제어자보다 크거나 같아야한다. 오류 발생 상위 클래스의 print2메소드는 public > 하위 클래스의 print2 메소드는 default
*/
	
	
	/*public void print3() throws Exception {
	} // 예외 추가할 순 없다.*/

	
	// final , private, static 메소드 오버라이딩 안된다.

	
	// 안드로이드의 클래스들은  static class , 내부 클래스를 많이 쓴다.

	
	public Demo1() { // 만약 상위 생성자의 default 생성자가 없을 때는 명시적으로 매개변수가 있는 생성자를 불러 주어야 한다.
		super(10);		
	}

}


class User2{  //싱글턴 패턴 만들기 , 스피링의 기본 개념 , 객체는 하나만 생성된다.
	
	private static User1 user; //메소드 영역
	private User2(){}
	
	public static User1 getInstance(){
		
		if(user==null){
			user= new User1();
		}
		
		return user;
	} 
	
	// 객체를 하나만 생성해서 계속 쓰게되면 삭제하지 않아서 cpu를 적게 잡아먹게 된다. 
	//오라클의 로그인이나 카톡 로그인에서 connection 객체를 불러올 때 하나만 만들면 그만큼 효율적.
	
}

abstract class user3{ // 객체 생성 불가능.
	
	public void print(){}
	
}