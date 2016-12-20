package day1220;

public class Test3 {

	public static void main(String[] args) {

		int size = 7;
		int st = 0;
		st = size / 2;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < (size - st); j++) {

				System.out.print((j >= st) ? "*" : " ");

			}

			st = i < (size / 2) ? st - 1 : st + 1;
			System.out.println();

		}

	}
	
	/*
	2*1=2 3*1=3 4*1=4 5*1=5
	2*9=18		
			
	6*1=6 7*1=7  8*1=8 9
	 :*/
	
}
