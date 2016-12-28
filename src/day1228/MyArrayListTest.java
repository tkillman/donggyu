package day1228;

public class MyArrayListTest {
	
	
	public static void main(String[] args) {
		
		MyArrayList<String> mylist = new MyArrayList<>();
		
		
		mylist.add("hello");
		mylist.add("hello1");
		mylist.add("hello2");
		mylist.add("hello3");
		mylist.add("hello4");
		
		System.out.println(mylist.size());
		mylist.remove(1);
		
		MyListIterator<String> iterator = mylist.listIterator();
		
		while(iterator.hasNext()){
			String str = iterator.next();
			System.out.print(str +" ");
			
		}
		
		
	}

}
