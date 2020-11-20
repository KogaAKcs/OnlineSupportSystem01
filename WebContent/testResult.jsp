<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="testData" class="OSSmainPackage.teacher" scope="request" />
<jsp:useBean id="listData" class="java.util.ArrayList" scope="request" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>テスト：出力結果</title>
</head>
<body>

テスト結果は!<br>


<% for(Object item : listData){
	OSSmainPackage.teacher th = (OSSmainPackage.teacher)item; %>

<tr>

<td><% out.println( th.getTeacherID() ); %></td>
<td><% out.println( th.getPassword() ); %></td>
<td><% out.println( th.getMailaddress() ); %></td>
<td><% out.println( th.getName() ); %></td>

</tr>

<% } %>

</body>
</html>