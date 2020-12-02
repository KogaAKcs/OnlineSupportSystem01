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
<link rel='stylesheet' href='Answer_View2.css' />

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
	<div class="row">
	<!--問題文部分-->
	<div class="Question col s8 offset-s2">
	問題文あああああああああああああああ
	</div>
	</div>
	<!--選択肢部分-->
	<div class="row">
	<div class=Choice>
		<!--選択肢1-->
		<div class="Choice1 col s4 offset-s1">
		<button>a</button>　選択肢1ああああ
		</div>
		<!--選択肢2-->
		<div class="Choice2 col s4 offset-s2">
		<button>b</button>　選択肢2ああああ
		</div>
		</div>
		</div>
	<div class="row">
		<!--選択肢3-->
		<div class="Choice3 col s4 offset-s1">
		<button>c</button>　選択肢3ああああ
		</div>
		<!--選択肢4-->
		<div class="Choice4 col s4 offset-s2">
		<button>d</button>　選択肢4ああああ
		</div>
	</div>
</div>

</body>
</html>