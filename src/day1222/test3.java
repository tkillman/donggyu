package day1222;

public class test3 {

	public static void main(String[] args) {
		test1 t1 = new test1();

		t1.setX(3);

		test2 t2 = new test2(t1);

		t2.print();

	}

}
