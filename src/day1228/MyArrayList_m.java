package day1228;

public class MyArrayList_m<E> implements MyList_m<E> {

	private Object[] elements;
	private int size;

	public MyArrayList_m() {
		allocator(10);
	}

	public void allocator(int capacity) {
		Object[] temp = new Object[capacity];

		if(elements!=null && size>0){
			System.arraycopy(elements, 0, temp, 0, size);
		}
		
		elements = temp;

	}

	public E elements(int index) {
		return (E) elements[index];
	}

	public void add(E element){
		
		add(size,element);
		
		
	}
	
	
	@Override
	public void add(int index, E element) {

		if(size>=elements.length){
			allocator(size+10);
		}
		
		
		for (int i = size - 1; i >= index; i--) {
			elements[i + 1] = elements[i];
		}

		size++;

		elements[index] = element;

	}

	@Override
	public void remove(int index) {

		for (int i = index; i < size - 1; i++) {
			elements[i] = elements[i + 1];
		}
		elements[size - 1] = null;

		size--;

	}

	@Override
	public int size() {

		return size;
	}

	@Override
	public E get(int index) {

		if (index >= size) {
			throw new ArrayIndexOutOfBoundsException();
		}

		return elements(index);
	}

	@Override
	public String toString() {
		
		StringBuffer sb = new StringBuffer("[");
		
		for(int i=0;i<size;i++){
			sb.append(elements(i) +",");
		}
		sb.append("]");
		
		return sb.toString();
		
	}
	
	public int capacity(){
		return elements.length;
	}

	@Override
	public void set(int index, E element) {
		
		elements[index] = element;
		
	
	}
	
	public MyArrayListIterator iterator(){
		return new MyArrayListIterator();
	}
	
	
	class MyArrayListIterator implements MyListIterator_m<E>{
		int nextIndex=0;
		
		@Override
		public boolean hasNext() {
			if(nextIndex>=size){
				return false;
			}
			return true;
			
		}

		@Override
		public E next() {
			return elements(nextIndex++);
			
		}
		
	}
	
	
	
	
	
	
}
