package day1228;

import java.util.ArrayList;

import day1228.MyArrayList_m.MyArrayListIterator;

public class MyArrayListTest {
	
	
	public static void main(String[] args) {
		
		MyArrayList<String> mylist = new MyArrayList<>();
		
		
		mylist.add("hello");
		mylist.add("hello1");
		mylist.add("hello2");
		mylist.add("hello3");
		mylist.add("hello4");
		mylist.remove(4);
	
		
		System.out.println(mylist);
	
		
		
		
		
		
	}

}
