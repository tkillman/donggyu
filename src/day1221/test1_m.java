package day1221;

public class test1_m {

	public static void main(String[] args) {

		int[] score = new int[] { 80, 70, 80, 100, 95 };
		int[] rank = new int[score.length];

		for (int i = 0; i < rank.length; i++) {
			rank[i] = 1;
		}

		/*
		 * 80 1 +1 +1 70 1 +1 +1 +1 80 1 + 1 + 1 100 1 95 1 +1
		 * 
		 * 
		 * 0|1 0|2 0|3 0|4 1|2 1|3 1|4 2|3 2|4 3|4
		 */

		for (int i = 0; i < score.length - 1; i++) {
			for (int j = i + 1; j < score.length; j++) {
				System.out.println(i + " | " + j);
			}

		} // for문 종료

		for (int i = 0; i < score.length - 1; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i] > score[j]) {

					rank[j]++;
				} else if (score[i] < score[j]) {
					rank[i]++;
				}

			}
		} //for 문 종료
		
		
		for(int i=0;i<score.length;i++){
			
			System.out.printf("%d %d \n" , score[i],rank[i]);
			
		}

	}

}
