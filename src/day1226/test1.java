package day1226;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		/*
		 * int idx; idx = s.indexOf("-"); idx = s.indexOf("+"); idx =
		 * s.indexOf("*"); idx = s.indexOf("/");
		 */
		String[] oo = { "+", "-", "/", "*" };

		for (String o : oo) {
			int idx;
			char c;
			int n1, n2;

			idx = s.indexOf(o);

			if (idx > 0) {

				c = s.charAt(idx);
				n1 = Integer.parseInt(s.substring(0, idx));
				n2 = Integer.parseInt(s.substring(idx + 1));

				System.out.println(n1);
				System.out.println(n2);

				if (c == '+') {

					System.out.println(n1 + n2);
				} else if (c == '-') {
					System.out.println(n1 - n2);
				} else if (c == '*') {
					System.out.println(n1 * n2);
				} else if (c == '/') {
					System.out.println(n1 / n2);
				}

			}

		}

	}

}
