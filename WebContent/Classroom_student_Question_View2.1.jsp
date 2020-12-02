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
<link rel='stylesheet' href='Classroom_student_Question_View2.css' />

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
<div class="Classroom_Question">
<!--解説部分-->
	<div class="row">
		<!--解答-->
		<div class="Answer">
		解答ああああ
		</div>

		<br>
		<br>
		<br>

		<!--解説文-->
		<div class="manual">
		解説文ああああ
		</div>
	</div>

	<!--ボタン部分-->
	<div class="row">
		<!--解答ボタン-->
		<div class="BackquestionButton col s4 offset-s1">
		<button>問題文へ</button>
		</div>
		<!--次の問題へボタン-->
		<div class="NextquestionButton col s4 offset-s2">
		<button>次へ</button>
		</div>
	</div>
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