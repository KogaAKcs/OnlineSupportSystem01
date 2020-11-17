<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, user-scalable=no" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<meta name="description" content="${description}" />

<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/materialize/0.95.1/css/materialize.min.css' />
<link rel='stylesheet' href='sakamoto.css' />
<link rel='stylesheet' href='signup.css' />
<style>${style}</style>

<script src="http://cdn.rawgit.com/phi-jp/high/0.0.3/high.js"></script>
<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/materialize/0.95.1/js/materialize.min.js'></script>

<!--タイトル-->
<title>オンライン学習支援システム</title>
</head>

<body>
<form method="POST" action="C:/pleiades/workspace/OnlineSupportSystem01/WebContent/testResult.jsp">
<div class="title">
  <h1><img src="logo.png" alt=""></h1>
  <h2>アカウント新規登録</h2>
</div>
<br>
<div class="container">
 <div class="signup">
  <div class="row">

     <div class="row">
        <div class="input-field col s12">
          <input id="TeacherID" type="text" class="validate">
          <label for="先生ID">先生ID</label>
        </div>
      </div>
      <div class="row">
        <div class="input-field col s6">
          <input id="name" type="text" class="validate">
          <label for="name">名前</label>
        </div>
      </div>

      <div class="row">
        <div class="input-field col s12">
          <input id="email" type="email" class="validate">
          <label for="email">メールアドレス</label>
        </div>
      </div>
      <div class="row">
        <div class="input-field col s12">
          <input id="password" type="password" class="validate">
          <label for="password">パスワード</label>
        </div>
      </div>

	<input type="submit" value="新規登録" class=button6 />


  </div>
  </div>
</div>

</form>
</body>
</html>