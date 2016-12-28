package day1228;

public class MyArrayList<E> implements MyList<E> {

	/*
	 * 데이터 : 진짜 데이터를 저장할 배열 [] , 사이즈 담을 변수
	 * 
	 */

	private Object[] elementData;
	private int size;

	public MyArrayList() { // 초기 생성시 10 사이즈
		capacityAllocation(10);
	}

	private void capacityAllocation(int capacity) { // ArrayList의 기본 사이즈는 10
													// ,데이터가 늘어나면 더 할당된다.
		Object[] temp = new Object[capacity];

		if (elementData != null && size > 0) { // 초기 사이즈는 0 , 0이 아니라는 것은 무엇인가
												// 들어와 있는 상태
			System.arraycopy(elementData, 0, temp, 0, size);

		}

		elementData = temp;

	}

	@SuppressWarnings("unchecked")
	private E elementData(int index) { // 해당 인덱스의 데이터를 리턴할 메소드
		return (E) elementData[index];
	}

	@Override
	public void addFirst(E element) { //
		add(0, element);

	}

	@Override
	public void add(E element) { // 맨 끝

		if (size >= elementData.length) {
			capacityAllocation(elementData.length + 10);
		}

		elementData[size++] = element;

	}

	@Override
	public boolean add(int index, E element) { // 해당 인덱스에 추가

		if (index < 0 || index > size) { // 추가하려는 index가 size 보다 크면
			return false;
		}

		if (size >= elementData.length) { // ArrayList의 방에 모두 데이터가 차 있는 경우 추가하려고
											// 해도 공간이 부족하므로 늘려준다.
			capacityAllocation(elementData.length + 10);
		}

		for (int i = size - 1; i >= index; i--) { // 한칸씩 뒤로 미룬다 . 1,2,3 에 앞에 10을
													// 추가하면 10,1,2,3 이 되므로
			elementData[i + 1] = elementData[i];
		}

		elementData[index] = element;
		size++;

		return false;

	}

	@Override
	public E get(int index) {

		if (index >= size) {
			throw new ArrayIndexOutOfBoundsException(); // runtime 오류 ,
														// unchecked 예외.
		}

		return elementData(index);
	}

	@Override
	public E set(int index, E element) {
		if (index >= size) {
			throw new ArrayIndexOutOfBoundsException(); // runtime 오류 ,
														// unchecked 예외.
		}

		E old = elementData(index);
		elementData[index] = element;

		return old;

	}

	@Override
	public int size() {

		return size;
	}

	@Override
	public E remove(int index) {

		if (index >= size) {
			throw new ArrayIndexOutOfBoundsException(); // runtime 오류 ,
														// unchecked 예외.
		}

		// 뒤에 있는걸 한칸씩 땡겨온다.

		E remove = (E) elementData[index];

		for (int i = 0; i < size-1 ; i++) {
			elementData[i - 1] = elementData[i];
			size--;
			elementData[size] = null; // 맨 마지막에 있는 걸 하나

		}
		return remove;

	}

	@Override
	public boolean remove(E element) {
		for (int i = 0; i < size; i++) {
			if (elementData[i].equals(element)) {
				remove(i);
				return true;
			}
		}

		return false;
	}

	@Override
	public void clear() {

		for (int i = size; i >= 0; i--) {
			elementData[i] = null;
		}

		size = 0;

	}

	@Override
	public int indexOf(E element) {
		for (int i = 0; i < size; i++) {
			if (elementData[i].equals(element)) {

				return i;
			}
		}
		return -1;
	}

	@Override
	// 요소 크기로 배열 방 크기를 다시 조정
	public void trimToSize() {
		capacityAllocation(size);

	}

	@Override
	public int capacity() {

		return elementData.length; // 최대 넣을 수 있는 용량
	}

	@Override
	public MyListIterator<E> listIterator() {

		
		return new MyListIteratorImpl();
	}

	private class MyListIteratorImpl implements MyListIterator<E>{
		
		private int nextIndex = 0;
		
		@Override
		public boolean hasNext() { // 사이즈보다 다음 인덱스가 작을 경우
			
			return nextIndex <size(); 
			
		}

		@Override
		public E next() {
			
			return elementData(nextIndex++);
			
		}

		@Override
		public boolean hasPrevious() {
			
			return nextIndex>0;
		}

		@Override
		public E previous() { //이전 데이터를 리턴 받음.
			
			return elementData(--nextIndex);
			
		}

		@Override
		public void add(E element) {
			MyArrayList.this.add(nextIndex++,element);
			
		}

		@Override
		public void remove() {
			MyArrayList.this.remove(nextIndex-1);
			nextIndex--;
			
		}
		
	}
	
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[");
		for (int i = 0; i < size; i++) {
			sb.append(elementData[i]);
			if(i<size -1){
				sb.append(",");
			}
			
		}

		sb.append("]");

		return sb.toString();
	}

}

