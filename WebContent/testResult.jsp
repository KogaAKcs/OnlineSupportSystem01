<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="testData" class="OSSmainPackage.teacher" scope="request" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>テスト：出力結果</title>
</head>
<body>

テスト結果は!<br>

<tr>

<td><% out.println( testData.getTeacherID() ); %></td>
<td><% out.println( testData.getPassword() ); %></td>
<td><% out.println( testData.getMailaddress() ); %></td>
<td><% out.println( testData.getName() ); %></td>

</tr>

</body>
</html>