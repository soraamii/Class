package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTest {

   public static void main(String[] args) {
      

      
      try {
         // 1. 드라이버 로드 : Class.forName("클래스의 풀네임");
         // Class.forName("oracle.jdbc.driver.OracleDriver"); // 자바7.0부터는 생략가능
      
         // 2. Conection 객체를 생성 : 연결 정보
         // jdbcUrl
         
         //ofacle연결
         String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
         Connection conn = DriverManager.getConnection(dbUrl, "hr", "tiger");
      
         // Mysql 연결
        // String dburl = "jdbc:mysql://localhost:3306/project";
         //Connection conn = DriverManager.getConnection(dburl, "himedia", "tiger");
         
         // 3. Statement / PreparedStatement => sql 실행 요청
         
         //insert sql
         String sql = "update dept set dname = ?, loc = ? where deptno = ?";
         PreparedStatement pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, "디자인팀");
         pstmt.setString(2, "제주");
         pstmt.setInt(3, 50);
         
         int result = pstmt.executeUpdate();
         
         if(result > 0) {
        	 System.out.println("데이터가 수정되었습니다.");
         }
         
         pstmt.close();
         conn.close();
         
//      } catch (ClassNotFoundException e) {
//         // TODO Auto-generated catch block
//         e.printStackTrace();
      } 
      catch (SQLException e) {
         // TODO Auto-generated catch block
         //System.out.println("연결 실패.....");
         e.printStackTrace();
      }
      


   }

}