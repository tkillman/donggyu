package day1222;

public class test2 {
	
	test1 t1;
	int x;
	public test2(test1 t1) {
		this.t1=t1;
		this.x= t1.getX();
	
	}

	
	public void print(){
		System.out.println(x);
	}
	
	
}
