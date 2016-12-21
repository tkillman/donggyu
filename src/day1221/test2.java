package day1221;

public class test2 {
	static int a = 10; // 클래스 영역

	public static void main(String[] args) {
		int a; // 스택 영역

		Rect ob1 = new Rect();
		// 생성자의 역할~? 1.메모리 할당
		// 2.데이터 초기화

		Rect ob2 = new Rect(); // 만약 다른 넓이를 구할 때

		ob1.set(10, 5);
		System.out.println("ob1의 넓이 : " + ob1.area());
		System.out.println("ob2의 넓이 : " + ob2.area());

	}

} // test 2 클래스 종료

class Rect {

	private int width, height; // 힙 영역
	/*
	 * { width =40; }
	 */

	public Rect() { // 컴파일러가 불러올 때!!!! 자동적으로 생성

	}

	public void set(int w, int h) {
		width = w;
		height = h;
	}

	public int area() {
		// sin 30 1/2 30에 따라 1/2이 결정되므로 매개변수로 준다.
		return width * height;
	} // area 메소드

	public int len() {
		return (width + height) * 2;
	}

	
	
	
}
