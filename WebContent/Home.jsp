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
<link rel='stylesheet' href='Home1.css' />

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

<!--メニューバー-->
<div class="container">
<div class="row" >

<div class="menu" style="display:inline-flex">
<div class='menubar hide-on-small-only show-on-medium-and-up' >
<form name="HomeControl"action="HomeControl" method="post"style="margin:0px 15px;float:left">
<input type="hidden" name="Classroom" value="教室" >
  	  <a href="javascript:HomeControl[0].submit()" class="waves-effect waves-light btn">教室</a>
  	  </form>
  	  <form name="HomeControl"action="HomeControl" method="post"style="margin:0px 15px;float:left">
<input type="hidden" name="Sucedule" value="スケジュール" >
  	  <a href="javascript:HomeControl[1].submit()" class="waves-effect waves-light btn">スケジュール</a>
  	  </form>
  	  <form name="HomeControl"action="HomeControl" method="post"style="margin:0px 15px;float:left">
<input type="hidden" name="Category" value="科目一覧">
  	  <a href="javascript:HomeControl[2].submit()" class="waves-effect waves-light btn">科目一覧</a>
  	   </form>
  	    <form name="HomeControl"action="HomeControl" method="post"style="margin:0px 15px;float:left">
<input type="hidden" name="Result" value="成績">
  	  <a href="javascript:HomeControl[3].submit()" class="waves-effect waves-light btn">成績</a>
  	  </form>
  	  <form name="HomeControl"action="HomeControl" method="post"style="margin:0px 15px;float:left">
<input type="hidden" name="Notice" value="お知らせ">
  	  <a href="javascript:HomeControl[4].submit()" class="waves-effect waves-light btn">お知らせ</a>
  	   </form>
  	   <form name="HomeControl"action="HomeControl" method="post"style="margin:0px 15px;float:left">
<input type="hidden" name="Logout" value="ログアウト">
  	  <a href="javascript:HomeControl[5].submit()" class="waves-effect waves-light btn">ログアウト</a>
  	   </form>
  	   </div>
  	   </div>


</div>
<div class='menubar hide-on-med-and-up show-on-small'>
<div class="menu_mobail">
<a class="waves-effect waves-light btn">メニューバー</a>
</div>
</div>
</div>
</header>



<div class="container">
<div class="row">
<!--左2-->
<div class="hidari col s3">
<!--教室-->
<div class="room">
<td>教室</td>
</div>
<!--スケジュール-->
<div class="schedule">
<td>スケジュール</td>
</div>
</div>


<!--真ん中８-->
<div class="mannaka col s6">
<!--メインー-->
<div class="main">
<td>メイン</td>
</div>
</div>


<!--右２ー-->
<div class="migi col s3">
<!--お知らせ-->
<div class="notice">
<td>お知らせ</td>
</div>
<!--お知らせー-->
<div class="chat">
<td>チャット</td>
</div>
</div>
</div>


</div>
</body>
</html>