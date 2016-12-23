package day1223;

public class test {
	
	public static void main(String[] args) {
		
	
		String s1 = "seoul";// 0x10
		String s2 = "seoul"; // 0x10
		String s3 = new String("seoul");// 0x30
		
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		System.out.println(s1.hashCode()); // 객체를 찾을 때 쉽게 찾기 위해서... 안의 데이터값을 참고로 해서 만든다. 그래서 s1과 s3의 인스턴스는 다른데 hascode는 같은 결과
		System.out.println(s3.hashCode());
		
		
		String s="seoul"; //0x10에 넣는다
		 
		
		s+="korea"; //새로운 0x20을 할당하고 0x10을 회수한다.
		
		System.out.println(s);
		
		
	}

}
