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

<form method="POST" action="LoginControl.java">

<!--タイトル-->
<title>オンライン学習支援システム</title>
<div class='title'>
  <h1><img src="logo.png" alt=""></h1>
  <h2>ログイン</h2>
</div>
<br>
<div class="container">
 <div class="signup">
  <div class="row">
    <form class="col s12">
      <div class="row">


      <div class="row">
        <div class="input-field col s12">
          <input id="mailaddress" type="email" class="validate">
          <label for="email">メールアドレス</label>
        </div>
      </div>
      <div class="row">
        <div class="input-field col s12">
          <input id="password" type="password" class="validate">
          <label for="password">パスワード</label>
        </div>
      </div>
      <br>
      <br>
      <br>
  <input type="submit" class='button6' value="ログイン">
      <br>
      <br>
      <br>
      <div class='button12'><a href="" class="btn btn--orange">パスワードを忘れた方は<br>こちら</a>
    </form>

  </div>
  <div>

  </input>
  </div>
</div>

</head>
</body>
</html>