package day1226;

import java.util.Scanner;

public class test1_m {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str;
		System.out.println("수식 입력");
		str = sc.next();

		String[] cal = new String[] { "*", "+", "-", "/" };

		for (String o : cal) {
			int idx;
			char c;
			
			
			idx = str.indexOf(o);

			c = str.charAt(idx);

			int n1, n2;

			n1 = Integer.parseInt(str.substring(0, idx));
			n2 = Integer.parseInt(str.substring(idx + 1));

			
			if (c == '*') {
				System.out.println(n1 * n2);
			}

		}

	}

}
