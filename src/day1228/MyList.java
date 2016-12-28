package day1228;



public interface MyList<E> {
	
	// 첫번째 인덱스에 데이터 추가
	public void addFirst(E element);
	
	// 데이터 추가
	public void add(E element);
	
	// 특정 인덱스에 데이터 추가
	public boolean add(int index, E element);
	
	// 특정 인텍스의 데이터 리턴
	public E get(int index);
	
	// 특정 인덱스의 데이터 변경
	public E set(int index, E element);
	
	// 요소의 개수
	public int size();
	
	// 특정 인덱스의 데이터 지우기
	public E remove(int index);
	
	// 특정 데이터 지우기
	public boolean remove(E element);
	
	// 전체 지우기
	public void clear(); 
	
	// 특정 데이터의 인덱스 구하기
    public int indexOf(E element);
    
    // 버퍼의 크기를 배열의 크기로 변경하기
    public void trimToSize();
    
    // 버퍼의 크기를 리턴하는 메소드 , 
    public int capacity();
    
    // 반복자 리턴
    public MyListIterator<E> listIterator();
    
}
