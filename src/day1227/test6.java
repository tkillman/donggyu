package day1227;

public class test6 {

	public static void main(String[] args) {
		
		////// 일반적인 익명으로 정의
		User4 ob = new User4() {
			
			@Override
			public void print() {
				System.out.println("print.....");
			}
		}; //print 재정의
		ob.print();
		
		
		///// 람다식 사용
		User4 u4 = ()->{
			System.out.println("람다식");
		};
		u4.print();
		
		
		/// 완전 간단 사용법, 
		User4 ob3 = ()-> System.out.println("aa");
		ob3.print();
		
		
	} //메인 메소드 종료

} //test6 클래스 종료



interface User4{
	public void print(); // 람다식을 만드려면 메소드가 하나만 있어야 한다.
	
}


@FunctionalInterface
interface Demo4{ // FunctionalInterface , 람다식을 사용하기 위해서 붙여주면 메소드를 하나만 정의해야한다.
	
	public void print();
	
}
