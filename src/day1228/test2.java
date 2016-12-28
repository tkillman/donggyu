package day1228;

import java.util.ArrayList;
import java.util.Iterator;

public class test2 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("a");
		list.add("b");
		
		
		for(String str : list){
			System.out.print(str);
		}
		
		System.out.println();
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()){
			String str = iterator.next();
			
			System.out.print(str);
		}
		
		
		
		
		
	}
	
	
}
