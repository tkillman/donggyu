package day1226;

public class test1_mm {
	
	public static void main(String[] args) {
		
		String str = "김*가*원";
		
		String[] arr = str.split("\\*");
		
		for(String a : arr){
			
			System.out.println(a);
			
		}
		
	}

}
