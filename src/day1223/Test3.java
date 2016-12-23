package day1223;

public class Test3 {
	
	
	public static void main(String[] args) {
		
		String s="asd123dfasf4567asf345";
		
		//숫자를 없애자~~
		//replace는 정규 표현식 사용 불가,
		//replaceAll는 정규 표현식 사용 가능
		
		System.out.println("--------1.숫자를 없애는 결과값 ---------");
		s =s.replaceAll("\\d", ""); //숫자를 없애라.
		System.out.println(s);
		
		
		System.out.println("--------2.숫자 있는 곳을 잘라라 ---------");
		String[] ss = s.split("\\d"); //숫자 있는 곳을 잘라라.
		
		
		
		for(String a :ss){
			System.out.println(a);
		}
		
		
		System.out.println("--------3.숫자도 짜르고 공백도 없애라  ---------");
		s="우리 1 나라 34  대한민국";
		
		s= s.replaceAll("\\d|\\s", "");  //정규표현식을 보자~!!! 실무에 유용하다. \\d는 숫자란 뜻, \\s 는 공백이라는 뜻
		System.out.println(s);
		
		
		s="123456789";
		
		System.out.println("--------4.3과 6과 9를 별표로 바꿔라  ---------");
		s = s.replaceAll("[369]", "*"); //3과 6과 9를 별표 표시로 바꿔라.
		System.out.println(s);
		
		//s= s.replaceAll("(3|6|9)", "*"); (369)는 삼백육십구라는 의미, |는 또는 이라는 의미, 3 또는 6 또는 9
		
		
		System.out.println("--------5.String의 바이트 배열을 구해라. ---------");
		String s1="bced";
		String s2="bcea";
		
		
		byte[] b = s1.getBytes(); // string의 바이트 배열을 구하는 방식.
		
		
		for(byte a: b){
			System.out.print(a + " ");
		}
		
		System.out.println();
		System.out.println("--------6.s1과 s2가 달라지는 부분의 아스키 코드 차이를 구해라 ---------");
		
		System.out.println(s1.compareTo(s2));
		// 3 나옴 ,  bce는 같고 d와 a가 달라졌다. a와 d의 아스키 코드는 3 차이
		
		
		
		s1="SEOUL";
		s2="seoul";
		System.out.println("--------7.s1과 s2가 대소문자를 구분하지 않도록 비교하는 법---------");
		System.out.println(s1.equals(s2)); //대소문자 구분
		
		System.out.println(s1.equalsIgnoreCase(s2)); // 대소문자를 구분하지 않는다.
		
		
		System.out.println("--------8.s1과 s2가 앞 부분만 같은지 비교하고 싶을 때---------");
		s1="seoul Korea";
		s2="seoul";
		System.out.println(s1.startsWith(s2));
		// 앞부분만 비교하고 싶다.
		
		
		s1 = "ab.cd.gif";
		
		System.out.println("--------9.마지막 파일 확장자만 추출하고 싶을 때---------");
		//마지막 문자 추출
		s2 = s1.substring(s1.lastIndexOf("."));
		System.out.println(s2);
		
		//1~100까지 출력하는데 10단위로 출력하고 369는 별표
		
		//수식 ? 3+10 
		
		
		// ArrayList의 관련된 
		// ==> 추상화, 1.데이터  2.기능		// iterator 
		
		//Calendar  class 이용
		
			// 	2016-12-18, 2016-12-24		2016-12-23 오늘 날짜를 기준으로 그 주의 시작일과 마지막일이 찍히도록
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
