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
<link rel='stylesheet' href='Header1.css' />

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
<table>
<tbody>
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
</tbody>
</table>

</header>





<div class="container">


<div class="row">



<!--左2-->
<div class="col s2 hide-on-small-only">
<!--教室ー-->
<div class="room">
<table>
<tbody>
	教室
</tbody>
</table>
</div>
<!--スケジュールー-->
<table>
<tbody>
    スケジュール



</tbody>
</table>
</div>



<!--真ん中８ー-->
<div class="col s8">
<!--メインー-->
<table>
<tbody>
    メイン

</tbody>
</table>
</div>



<!--右２ー-->
<div class="col s2 hide-on-small-only">
<!--フレンド通知ー-->
<table>
<tbody>
   notice
</tbody>
</table>
<!--お知らせー-->
<table>
<tbody>
友達
</tbody>
</table>
</div>


</div>
</div>
</body>
</html>