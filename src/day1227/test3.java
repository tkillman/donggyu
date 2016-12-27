package day1227;

public class test3 {

	// 자바 8부터 인터페이스의 메소드를 정의 가능하게 됨. 디폴트 매소드
	// static 메소드를 재 정의 가능하도록
	// CRUD 디비 작업,
	

}

class OracleDAO {

	public void insert() {
	}

	public void read() {
	}

	public void update() {
	}

	public void delete() {
	}

}


class UserService { // 클래스가 OracleDAO에 의존관계가 있게 된다. 
	
	public static void main(String[] args) {
		OracleDAO dao = new OracleDAO();
		dao.insert();

	}

}

class MySqlDAO{ //MySql을 써야 되는 경우 UserService를 다 뜯어 고쳐야한다.
	
	
	
}
