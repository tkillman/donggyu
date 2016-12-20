package day1220;

public class Test6 {
	///***************개선된 버블 소트
	public static void main(String[] args) {

		int[] num = { 5, 3, 7, 1, 10 };

		int t;

		boolean flag;
		int pass = 1;

		do {
			flag = false;
			
			
			for (int i = 0; i < num.length - pass; i++) {

				if (num[i] > num[i + 1]) {
					t = num[i];
					num[i ] = num[i+1];
					num[i+1] = t;
					flag =true;
				}

			}
			pass++;

		} while (flag);

		
		System.out.println("정렬 후");
		
		for(int n : num){
		System.out.print(n +" ");}
		
		
	}

}
