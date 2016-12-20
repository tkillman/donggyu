package day1220;

import java.util.Arrays;

public class Test5 {

	public static void main(String[] args) {

		int[] num = new int[10]; // num[0]~ num[9]
		num[0] = 10;
		num[1] = 4;
		num[2] = 6;
		num[3] = 9;

		// int[] num1 = new int[]{ 5,3,2,4,5,6}; 배열의 초기화

		// int [] num ={5,4,3,2,1};

		// Arrays.sort(num);

		/*
		 * System.out.println(" 정렬전..."); for(int i : num){ // for each 문장 컴마
		 * 오른쪽은 list, 배열 가능 System.out.print(i +" "); } System.out.println();
		 */

		int t;

		for (int i = 0; i < num.length - 1; i++) {

			for (int j = i + 1; j < num.length; j++) {

				// System.out.println(i + ":" + j);
				if (num[i] > num[j]) {
					t = num[i];
					num[i] = num[j];
					num[j] = t;

				}

			}

		}

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "");
		}

		// myBatis , 분석
	}

}
