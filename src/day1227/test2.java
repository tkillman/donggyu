package day1227;

/*정렬 프로그램을 짜고 싶다.

*추상화 필드 : values[]
*	 메소드 : 비교 
*
*compare() //비교하고
*swap() //바꿔주고
*length() // 데이터가 몇개인지
*
*sort() ==> 버블 소트
*
*
*
*
*
*/

public class test2 {

	public static void main(String[] args) {

		int[] data = new int[] { 6, 10, 8, 2 };

		SortInt s = new SelectionSortInt();

		s.sort(data);

		for (int n : data) {
			System.out.print(n + " ");

		}

		System.out.println();

		SortInt b = new BubbleSortInt();

		b.sort(data);

		for (int k : data) {
			System.out.print(k + " ");

		}

	}

}

abstract class SortInt {

	private int[] values;

	protected abstract void sorting(); // abstract가 없었다면 상속받아서 객체를 만들어서 재정의 해야
										// 되는데 메모리 낭비가 생긴다. , 사용자에게 재정의를 원하는
										// 메소드를 abstract로 지정해준다.

	public void sort(int[] values) {
		this.values = values;
		sorting();
	}

	protected int length() {
		if (values == null) {
			return -1;
		}

		return values.length;

	}

	protected final int compare(int i, int j) {

		return values[i] - values[j];

	}

	protected final void swap(int i, int j) {
		int t;
		t = values[i];
		values[i] = values[j];
		values[j] = t;

	}

}

class SelectionSortInt extends SortInt {

	@Override
	protected void sorting() {

		for (int i = 0; i < length() - 1; i++) {
			for (int j = i + 1; j < length(); j++) {
				if (compare(i, j) > 0) {
					swap(i, j);
				}

			}
		}

	}

}

class BubbleSortInt extends SortInt {

	@Override
	protected void sorting() {
		int pass = 1;
		boolean b;

		do {
			b = false;
			for (int i = 0; i < length() - pass; i++) {
				if (compare(i, i + 1) > 0) {
					swap(i, i + 1);
				}

			}
			pass++;
		} while (b);

	}

}



