package day1220;

public class Main {
	
	
	public static void main(String[] args) {
		
		int a=10, b=5;
		
		a=a^b;
		b=b^a;
		a=a^b;
		
		
		
//		24:(11000) 16 8 4 2 1
//		12:(01100) 16 8 4 2 1
//     &    01000		
//	   |    11100	
//     ^	10100 xor 회로
		
		
		
		System.out.println(a +":" +b);
		// 둘의 값이 스와핑되는 것을 알 수 있다.
		
		
	//	float a;
	//	a=1/2+1/2; 결과 : 0.0f이다. 묵시적 형변환이 일어난다.
		
		
		a= 1/2. + 1/2; // 컴파일 오류  
		// 단정도형 실수 1.0
		// 배정도형 실수
		
		정 연산자 => 정
		실 연산자 =>정
		실 연산자 =>실 
		
		
	}

}
