package day1226;

public class test3_m {

	public static void main(String[] args) {

		human h = new User3();

		User3 u3 = (User3) h;

		
		
		System.out.println(u3.z);

	}

}

class User3 extends human {
	int z;

}

class human {
	int x;
	int y;
}