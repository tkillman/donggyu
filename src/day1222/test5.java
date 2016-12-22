package day1222;

public class test5 {
		int a;
		Integer b;
		Integer c=0; //jdk 1.5 버전 이후부터
	
	public static void main(String[] args) {

		User1 oo = new User1();
		oo.print(5);

		int sum = oo.sum(10);
		System.out.println(sum);
		
		int result = oo.pow(2, 2);
		System.out.println(result);
		
		byte b =10;
		oo.write(b);
		
		short ss = 10;
		oo.write(ss);
		
		Short ss1 = 10;
		oo.write(ss1);
		
		long a = 10;
		oo.write(a);
		
		test5 t5= new test5();
		
		t5.sub1();
		//t5.sub2(); 오류 , 객체는 초기화되지 않는다.
		t5.sub3();
			
		
		User2 u2 = new User2();
		User2 u2_1 = new User2();
		
		
		
	} //메인 메소드 종료

	public void sub1(){
		int s = a+10;
		System.out.println(s);
	}
	public void sub2(){
		int s = b+10;
		System.out.println(s);
	}
	public void sub3(){
		int s = c+10;
		System.out.println(s);
	}
	
	
}

class Demo1{ // 언제 쓸까? 싱글턴 패턴 ... spring은 모두 싱글턴 패턴, 디자인 패턴
	private Demo1(){
		
	}
}









class User1 {
	public void print(int n) {

		if (n >= 1) {

			print(n - 1); // 자신이 자신을 호출 , 재귀 호출
			// 출력 못한 5를 STACK에 저장해 놓는다.
			// 출력 못한 4를 STACK에 저장해 놓는다.
			// 출력 못한 3를 STACK에 저장해 놓는다.
			// 출력 못한 2를 STACK에 저장해 놓는다.
			// 출력 못한 1를 STACK에 저장해 놓는다.
			// LIFO

			System.out.println(n);

		}
	}
	
	public int sum(int n){ // 탐색기에서 파일 안에 있는 폴더들을 다 삭제할 때 사용
		return n>=1? n+sum(n-1) : n ;
	}
	
	// a의 b pow(2,10)  ==> 1024 양수인 경우
	
	/*public int pow(int a,int b){
		int result=1;
		
		for(int i=0;i<b;i++){
			result *=a;
		}
		
		return result;
	}*/
	
	//일백2십오 + 34사 = 계산하는 프로그램
	public int pow(int a, int b){
		return b>0? a*pow(a,b-1) : 1;
	}
	
	
	//byte=> Byte, char=>Charater , 
	public void write(int a){
		System.out.println("int");
	}
	
	public void write(Long a){ //warrper 클래스 
		System.out.println("Long");
	}
	
	public void write(Short a){ //warrper 클래스 
		System.out.println("Short");
	}
	
	public void write(short a){
		System.out.println("short");
	}
	
}

class User2{ // 객체 생성시
	int a; // 1.a에 대한 메모리 할당
	{
		a=10; // 2. 초기화 블럭이 존재하면 초기화 블럭 실행
		System.out.println("초기화 블럭");
	}
	
	static int b; // 클래스 변수 , 정적 변수  , new와는 전혀 상관이 없다. == 메모리 할당과는 상관이 없다.
	{
		b=10;
	}
	
	static { //스태틱 변수 초기화 방법
		b=10;
	}
	
	public User2() { //3. 생성자 실행
		System.out.println("생성자");
	}
}

