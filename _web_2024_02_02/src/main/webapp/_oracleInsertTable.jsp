<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>   
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>

<%
    Class.forName("oracle.jdbc.driver.OracleDriver");
    try ( 
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
        
    ) {
        
        String[][] score = {
            { "4", "김하나", "50", "60", "70" }, 
            { "5", "김두울", "65", "75", "85" }, 
            { "6", "김세엣", "60", "80", "70" }
        };
        
        for (int i = 0; i < score.length; i++) {
            String sql = String.format(
                    "insert into score values (%s, '%s', %s, %s, %s)",
                    score[i][0], score[i][1], score[i][2], 
                    score[i][3], score[i][4]);
            
            
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();
            out.println("쿼리 실행 성공 : " + sql + "<br>");
        }
        
    } catch(Exception e) {
        e.printStackTrace();
    }
%>

</body>
</html>