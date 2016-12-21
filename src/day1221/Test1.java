package day1221;

public class Test1 {

	public static void main(String[] args) {

		/*
		 * 80 1+1+1+1 ->4 아래 값들과 비교해서 내가 잘했으면 상대 등수 +1 내가 못했으면 내 등수 +1 90 70 80
		 * 100 90
		 */

		int[] score = new int[] { 80, 90, 70, 80, 60 };

		int[] rank = new int[score.length];

		/*for (int i = 0; i < score.length; i++) {
			for (int j = i + 1; j < score.length; j++) {

				System.out.println(i + "|" + j);

				int t;
				if (score[i] > score[j]) {

					t = score[i];
					score[i] = score[j];
					score[j] = t;

				}

			}
		} //반복문 종료

		for(int num : score){
			System.out.print(num +" ");
		} // 순서대로 배열은 끝
*/		
		
		/*1:2 ,1:3,1:4,1:5
		2:3 ,2:4,2:5
		3:4, 3:5 
		4:5*/
		
		for(int i=0;i<rank.length;i++){
			rank[i]=1;	} //for 문 종료
		
		for(int i=0;i<score.length-1;i++ ){
			for(int j=i+1;j<score.length;j++){
				if(score[i]>score[j]){
					
					rank[j]++;// j가 공부를 못했으니까 1 더해준다.
					
				}else if(score[i]<score[j]){
					rank[i]++; // i가 공부를 못했으니까 1 더해준다.
				}
				
				
			}
		} //for 문 종료
		
		
		//등수를 보여주는 반복문
		/*for(int num : rank){
			System.out.print(num +" ");
		} //for 문 종료
		*/
		
		for(int i=0;i<score.length;i++){
			System.out.printf( "%d %d\n",score[i],rank[i]);
		} //for문 종료, printf 는 서식에 맞춰서 프린트해주는 것
		//%d 십진수로 표현하라
		
		
		
		
	}

}
