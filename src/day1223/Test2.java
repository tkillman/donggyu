package day1223;

public class Test2 {

	public static void stringTest() {

		Runtime rt = Runtime.getRuntime();

		System.out.println("String...");
		System.out.println("실행전 :" + rt.freeMemory());

		long s = System.currentTimeMillis();

		String str = "a";

		for (int i = 0; i < 100000; i++) {

			str += "a";
		}
		
		long e = System.currentTimeMillis();

		System.out.println("문자열 길이 :" + str.length());
		System.out.println("실행 시간 : " + (e - s) + "ms");
		System.out.println("실행 후 : " + rt.freeMemory());

	}

	
	public static void stringBuffertest() {

		Runtime rt = Runtime.getRuntime();

		System.out.println("StringBuffer...");
		System.out.println("실행전 :" + rt.freeMemory());

		long s = System.currentTimeMillis();

		StringBuffer sb = new StringBuffer("a");

		for (int i = 0; i < 100000; i++) {

			sb.append("a");
		}
		
		long e = System.currentTimeMillis();

		System.out.println("문자열 길이 :" + sb.length());
		System.out.println("실행 시간 : " + (e - s) + "ms");
		System.out.println("실행 후 : " + rt.freeMemory());

	}

	
	
	public static void main(String[] args) {

		stringTest();
		
		System.out.println();
		
		stringBuffertest();
		
		// 메모리 사용량과  처리 속도가 굉장한 차이가 있다.
		//string은 새로운 주소를 받고 옛 주소를 회수해야되지만
		//buffer는 원래 주소에 값을 계속 더하고 간다.
		
		
	}

}
