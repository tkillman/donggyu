package day1228;

import java.util.ArrayList;

public class MyArrayListTest_m {

	public static void main(String[] args) {

		MyArrayList_m<String> list = new MyArrayList_m<>();

		list.add(0, "index0");
		list.add(1, "index1");
		list.add(2, "index2");
		list.add(1, "index1_1");
		list.add("index3");
		list.add("index4");
		list.add("index5");
		list.add("index6");
		list.set(0, " index0_0");

		System.out.println("list에 들어있는 데이터의 갯수 " + list.size());
		System.out.println("할당 된 공간 : " + list.capacity());
		System.out.println(list);

		MyListIterator_m<String> listIter = list.iterator();

		while (listIter.hasNext()) {
			System.out.print(listIter.next() + " ");
		}

	}

}
