package day1220;

public class TEst1 {
	
	
	public static void main(String[] args) {
		
		float a=0;
		double b=0;
		
		for(int i=1;i<=10000;i++){
			a+=100000;
			b+=100000;
		}
		
		
		System.out.println((a/100000));
		// float 4 바이트 라서 오차 발생 
		
		
		System.out.println((b/100000));
		// double은 메모리는 많이 차지하지만 정밀도는 높아진다.
	}// 메인 메소드

	
	
}
