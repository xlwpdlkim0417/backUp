<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f0f0;
        margin: 0;
        padding: 20px;
    }
    .container {
        max-width: 400px;
        margin: auto;
        background: #fff;
        padding: 20px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        border-radius: 8px;
    }
    h2 {
        text-align: center;
        color: #333;
    }
    form {
        display: flex;
        flex-direction: column;
    }
    input[type=text], input[type=password] {
        padding: 10px;
        margin: 10px 0;
        border: 1px solid #ddd;
        border-radius: 4px;
    }
    button {
        background-color: #007bff;
        color: white;
        padding: 10px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        margin-top: 10px;
    }
    button:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>

<div class="container">
    <h2>Login Form</h2>
    <form method="get" id="loginfrm">
        아이디 <input type="text" name="id">
        패스워드 <input type="text" name="pw"> <!-- Changed type to password -->
    </form>
    <button onclick="login()">로그인</button>
    <button onclick="checkCookie()">로그인 확인</button>
    <button onclick="logout()">로그아웃</button><br><br>
    <button onclick="makeCookie()">회원가입</button>
    <button onclick="viewCookie()">쿠키 확인</button>
    
</div>

<script type="text/javascript">
    function login() {
        document.getElementById('loginfrm').action = 'login.jsp'
        document.getElementById('loginfrm').submit();
    }
    function logout() {
        document.getElementById('loginfrm').action = 'logout.jsp'
        document.getElementById('loginfrm').submit();
    }
    function makeCookie() {
        document.getElementById('loginfrm').action = 'makeCookie.jsp'
        document.getElementById('loginfrm').submit();
    }
    function viewCookie() {
        document.getElementById('loginfrm').action = 'viewCookie.jsp'
        document.getElementById('loginfrm').submit();
    }
    function deleteCookie() {
        document.getElementById('loginfrm').action = 'deleteCookie.jsp'
        document.getElementById('loginfrm').submit();
    }
    function checkCookie() {
        document.getElementById('loginfrm').action = 'loginCheck.jsp'
        document.getElementById('loginfrm').submit();
    }
</script>
</body>
</html>