package day1220;

import java.util.Scanner;

public class Test2 {
	
	
	public static void main(String[] args) {
		
		int s;
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.print("점수?");
			s = sc.nextInt();
			
			
			
			switch (s/10) {
			case 10:
				
			
			case 9:
				System.out.println("수입니다.");
				break;
			case 8:
				System.out.println("미입니다.");
				break;
			case 7:
				System.out.println("양입니다.");
				break;
			
			case 5:
				System.out.println("가입니다.");
				break;
			
			default:
				System.out.println("공부하세요");
				break;
				
			
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			sc.close();
		}
		
		
		
	}

}
