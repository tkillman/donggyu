package day1227;

public class test4 {
	
	public static void main(String[] args) {
		
		Ademo2 a2= new Ademo2() { //익명 클래스
			
			@Override
			public void print() {
				
				System.out.println("print 재정의....");
				
			}
		}; 
		
		a2.write();
		
	}

}


interface Ademo2{
	public final int PI = 10; // public final 이 무조건 붙는다. ==값의 수정이 불가능.
	
	public void print();
	
	
	public default void write(){ // 자바 8부터 ~~~~ default를 붙이는 경우 인터페이스에서도 메소드를 정의 가능 
		System.out.println("default 메소드 .....");
	
	}
	
	
	public static int sum(int n){ //static을 붙이는 경우도 인터페이스 에서 메소드 정의 가능.
		int s=0;
		for(int i=1;i<=n;i++){
			s+=i;
		}
		return s;
	}
	
}

//람다식 --> 자바 8점때부터 추가 가능.

abstract class Atest2 implements Ademo2{
	
	// 원래 인터페이스의 print를 재정의해야 하는데 재 정의하기 싫으면 추상  클래스로 만들어서 implements 해라
	
	
}

interface Auser2{
}

interface Buser3{
}

interface Cuser2 extends Auser2,Buser3{
}

class XUser2 implements Auser2 , Buser3{
	
}



