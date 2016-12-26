package day1226;

public class Test3 {

	public static void main(String[] args) {
			
		User1 oo = new Demo1(); // up casting 
		
		System.out.println(oo.b); // 5 , new를 하는 순간 진짜는 User1이 메모리 할당을 받는다. 필드는 자기 자신이 나온다.
		//System.out.println(oo.c); // 5 , new를 하는 순간 진짜는 User1이 메모리 할당을 받는다. 그래서 c는 접근이 불가능하다. c를 나오게 하려면?
		
		System.out.println( ((Demo1)oo).c ); // (Demo1)oo.c는 오류 '.'은 괄호보다 연산 순위가 높다. 
		
		
		
		oo.sub(); // Demo1 , 만약 User1에 sub() 메소드가 없으면 오류가 난다. , 자식 객체를 가리키 긴 하지만 컴퓨터는 User1만을 본다.
		
		Demo1 dd = (Demo1) oo; // down casting 
		dd.print();
		
		if(dd instanceof Demo1){
			Demo1 dd2 = (Demo1) oo;
			dd2.print();
		}
		
		Object ob = new Demo1(); // 업캐스팅
		System.out.println(((Demo1) ob).a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}


class User1{
	
	int a=10,b=5;
	public void print(){
		System.out.println(a +  " : " + b + " : " ); // 자식의 b는 접근 불가능
	}
	
	public void sub(){
		System.out.println("User1...");
	}
	
}


class Demo1 extends User1{
	
	int b=20, c=30;
	
	public void write(){
		System.out.println(a+" : "+b+" : "+c +" : " +super.b); // 아버지의 b를 부르는 방법.
	}
	
	//오버라이딩 된 메소드
	public void sub(){
		System.out.println("Demo1....");
	}
	
	
}