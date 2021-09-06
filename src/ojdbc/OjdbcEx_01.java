package ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//JDBC 라이브러리 사용 방법
//	1. JDBC 드라이버(driver) 로드
//	2. DB 접속(연결, Connection)
//	3. SQL쿼리 수행
//	4. 결과값 처리
//	5. 연결 종료

public class OjdbcEx_01 {
	public static void main(String[] args) {
//		1. JDBC 드라이버(driver) 로드
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) { //클래스가 없을 경우에 대한 예외 처리
			e.printStackTrace();
		}
		
		
		// --- OJDBC 사용에 필요한 변수들 ---
		Connection conn = null; //DB연결 객체(접속 객체)
		
		Statement st = null; //SQL구문 저장 및 SQL구문 수행 객체
		ResultSet rs = null; //조회 결과 반환 객체 (결과 집합 처리)
		//-----------------------------------
		
//		2. DB 접속(연결, Connection)
		
		try {
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe"
					, "scott"
					, "tiger");

		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
//		3. SQL쿼리 수행
//		4. 결과값 처리
//		5. 연결 종료
		
	}
}
