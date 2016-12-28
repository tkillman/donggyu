package day1228;

public interface MyList_m<E> {

	void add(int index, E element);
	void remove(int index);
	int size();
	E get(int index);
	
	void set(int index, E element);
	
}
