package day1227;

/*
 * 얻을 수 있는 이점!!!!!! 보안에 굉장히 유리하다.
 * 
 * */

public class test5 {
	
	public static void main(String[] args) {
		
	//	User3 ob = new User3(); 오류 , User3은 Demo3에 속해있으므로
		
		//static 중첩 클래스 사용
		Demo3.User3 ob = new Demo3.User3(); //Demo3의 객체가 없어도 User3의 객체 생성이 가능, static 중첩 클래스이므로
		ob.write();
		
		//내부 클래스 사용 
		Demo3 oo = new Demo3(); //1. 먼저 Demo3의 객체를 생성해야 한다.
		Demo3.Sam3 ss = oo.new Sam3(); 
		ss.write();
		
		
		Button.OnClickListener ob2 = new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				
				System.out.println("버튼 클릭");
			}
		};
		
		ob2.onClick();
		
	}
}

class Demo3{
	static int a = 10;
	int b=20;
	
	//static 중첩 클래스
	public static class User3{ //클래스 안에 클래스, 메소드 안에 클래스 가능.
		int c=30;
		public void write(){
			//System.out.println(b); 에러발생 , b를 사용 못하는 것은 Demo3이 메모리 할당을 받아야만 사용 가능하므로 static 중첩 클래스에서는 쓸 수 없다.
			System.out.println(a + " : " + c);
			
		}
		
	}
	
	
// 내부 클래스	
	public class Sam3{
		int c=30;
		
		public void write(){
			System.out.println(a + " : "+ b +" : " + c);
		}
		
		public void sub(){ //밖에서 이 객체를 만들어서 쓰기 보다는 자신의 내부에서 객체를 생성하고  이용하려고 내부 클래스를 쓴다.
			Sam3 ss= new Sam3();
			ss.write();
			
		}
		
	}
}

class Button {
	
	// 클래스 안에 내부 인터페이스
	public interface OnClickListener{ 
		public void onClick();
	}
}







