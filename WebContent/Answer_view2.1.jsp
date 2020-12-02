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
<link rel='stylesheet' href='Answer_View2.1.css' />

<style>${style}</style>

<script src="http://cdn.rawgit.com/phi-jp/high/0.0.3/high.js"></script>
<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/materialize/0.95.1/js/materialize.min.js'></script>
</head>

<!--ヘッダー部分-->
<header>
<!--タイトル-->
<title>

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
<!--ボディー部分-->
<body>
<div class="container">
	<!--解説部分-->
	<div class="row">
		<!--解説文-->
		<div class="manual">
		解説文ああああ
		</div>
	</div>
	<!--解答部分-->
	<div class="row">
		<!--解答-->
		<div class="Answer">
		解答ああああ
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

</body>
</html>