package day1221;

public class test3_m {

	public static void main(String[] args) {
		test tt = new test();
		
		System.out.println(tt.upper('a'));
		System.out.println(tt.isupper(' '));
	}

}

class test{
	
	public char upper(char ch){
	
		return ch>='a' && ch<='z' ? (char) (ch-32) :ch;
	}
	
	public boolean isupper(char ch){
		return ch>='A' && ch <='Z';
	}
	
}