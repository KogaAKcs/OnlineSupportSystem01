<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>テストサインアップ</title>
</head>
<body>
<!-- ../src/OSSmainPackage/LoginControl.java -->
<form method="POST" action="./LoginControl">

<label >先生ID<br />
<input name="TeacherID" type="text" /><br />
</label>

<label >名前<br />
<input name="name" type="text" /><br />
</label>

<label >メルアド<br />
<input name="email" type="email" /><br />
</label>

<label >パスワード<br />
<input name="password" type="password" /><br />
</label>

<input type="submit" value="新規登録"  />
</form>
</body>
</html>