package day1228;


// List : Vector < Arraylist < LinkedList  // 동기화 , Vector 동기화 지원 , ArrayList 동기화 지원 안함.
//StringBuffer 동기화 지원 , StringBuilder
//Hashtable 동기화 지원, Hashmap 

// TreeSet 정렬되는 Set comparate가 구현되어 있어야 함.,

// 뮤택스.. 세마포.... 동기화에 관련된 용어


//추상화... 데이터 상태 , 메소드 기능 

public interface MyListIterator<E> { //설계도 
	
	public boolean hasNext(); //다음 데이터가 있는가~?
	public E next(); // 다음 데이터를 가져올 때
	public boolean hasPrevious(); // 이전 데이터 있니~?
	public E previous(); // 이전 데이터를 가져온다.
	public void add(E element); // 데이터 추가
	public void remove(); // 데이터 삭제
	
}
