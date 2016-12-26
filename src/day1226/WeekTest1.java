package day1226;

import java.util.Calendar;
import java.util.Scanner;

public class WeekTest1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		int y, m, d;
		
		
		try {
			
			System.out.print("날짜입력[YYYY-MM-DD]?");
	        str=sc.next();

	        
	        String [] ss=str.split("-");
	        y=Integer.parseInt(ss[0]);
	        m=Integer.parseInt(ss[1]);
	        d=Integer.parseInt(ss[2]);
	        
	        //Calendar 는 추상 클래스 , 추상 클래스와 인터페이스의 차이점 정리하기.
	        // 추상 클래스는 객체를 만들 수 없다. 자식 클래스를 이용해서 만들자.
	        
	        // genInstance()는 객체를 만들어 주는 메소드
	        Calendar cal= Calendar.getInstance();
	        
	        
	        
	        cal.set(Calendar.YEAR, y); //연도 세팅
	        cal.set(Calendar.MONTH, m-1); // 월은 0~11 로 표현된다. 미국식 표현 , 배열로 처리하기 편해서 이렇게 해준다.
	        cal.set(Calendar.DATE, d);  // 날짜에 40 이 들어가도 자신이 알아서 월로 바꿔서 처리한다.

	      //다시 가져온다.
	 
	        y = cal.get(Calendar.YEAR); 
	        m = cal.get(Calendar.MONTH)+1; //가져올 때는 11이 12월이므로 +1을 해준다.
	        d = cal.get(Calendar.DATE);
	        System.out.printf("날짜:%04d-%02d-%02d\n",
	        						y, m, d) ; 

	        
	        
	        // 처음 시작 요일
	       
	        //sday에도 오늘 날짜가 들어온다. 하지만 다른 객체!!!!!!!
	       
	        Calendar sday = (Calendar)cal.clone(); //객체를 복제한다. 복제의 개념을 정확히 이해하자. 
	        
	      //DAY_OF_WEEK 요일을 구하는 방법. 1~7까지 나옴. 일요일1, 토요일7
	        int _m1 = cal.get(Calendar.DAY_OF_WEEK) - 1; 
	        
	        
	        sday.add(Calendar.DAY_OF_MONTH, _m1*-1); // 오늘이 목요일이면 5이고 위에서 _m1이 4를 만드므로 5-4하면 1이 나온다. 즉 그 주의 일요일 값이 나온다.

	        int y1 = sday.get(Calendar.YEAR); 
	        int m1 = sday.get(Calendar.MONTH)+1; 
	        int d1 = sday.get(Calendar.DATE);
	        System.out.printf("주시작일:%04d-%02d-%02d\n",
	                              y1, m1, d1) ;
	         
	        
	        // 마지막 요일
	        Calendar eday = (Calendar)cal.clone();
	        int _m2 = 7 - cal.get(Calendar.DAY_OF_WEEK); //만약 오늘이 수요일이면 4이고 3을 더하면 7이 되므로 더해야 되는 숫자는 7-4
	       
	        eday.add(Calendar.DAY_OF_MONTH, _m2);  // 토요일
	        int y2 = eday.get(Calendar.YEAR);
	        int m2 = eday.get(Calendar.MONTH)+1;
	        int d2 = eday.get(Calendar.DATE);
	        System.out.printf("주마지막일:%04d-%02d-%02d\n",
	                              y2, m2, d2) ;
		}catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("형식에 맞지 않습니다.");
			
		} finally {
			sc.close();
		}

	}

}
