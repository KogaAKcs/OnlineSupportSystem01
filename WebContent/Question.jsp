<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <jsp:useBean id="testData" class="ossServletControl.HomeControl" scope="request" />
<jsp:useBean id="listData" type="java.util.ArrayList<OSSmainPackage.Category>" scope="request" />
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, user-scalable=no" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<meta name="description" content="${description}" />

<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/materialize/0.95.1/css/materialize.min.css' />
<link rel='stylesheet' href='Question.css' />

<style>${style}</style>

<script src="http://cdn.rawgit.com/phi-jp/high/0.0.3/high.js"></script>
<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/materialize/0.95.1/js/materialize.min.js'></script>
</head>


<!--ヘッダー部分ー-->
<header>

<!--タイトル-->
<title>
オンライン学習支援システム
</title>
<div class='title'>
  <h1><img src="logo.png" alt=""></h1>
</div>

<body>

<form action="cgi-bin/formmail.cgi" method="post">


<!--メニューバー-->
<div class="row">
<div class='menubar hide-on-small-only show-on-medium-and-up'>
<a class="waves-effect waves-light btn">教室</a>
<a class="waves-effect waves-light btn">スケジュール</a>
<a class="waves-effect waves-light btn">問題</a>
<a class="waves-effect waves-light btn">成績</a>
<a class="waves-effect waves-light btn">お知らせ</a>
<a class="waves-effect waves-light btn">ログアウト</a>
</div>
<div class='menubar hide-on-med-and-up show-on-small'>
<div class="menu_mobail">
<a class="waves-effect waves-light btn">メニューバー</a>
</div>
</div>
</div>
</header>


<div class="container">

<!--見出し部分-->
<div class="row">
<td>問題一覧</td>
</div>


<!--問題一覧部分-->
<div class="row">
<!--カテゴリ部分-->
<div class="category">

<!--カテゴリリスト-->
<div class="Categorylist col s8 offset-s2">
<ul>
<form action="CategoryControl" method="post">
<% for(Object item : listData){
	OSSmainPackage.Category dc = (OSSmainPackage.Category)item; %>
  <input type="hidden" name="getなんたら" value="<% out.print(dc.getName()); %>">
  	  <li><a href="CategoryControl.submit()"><% out.print(dc.getName()); %><% } %></a></li>
  <li>基本情報</li>
  <li>基本情報</li>

</form>
</ul>
</div>

<!--プラスボタン部分-->
<div class="row">
<div class="InsertButton col s1 offset-s11">
<button>＋</button>
</div>
</div>

</div>
</form>
</body>
</html>