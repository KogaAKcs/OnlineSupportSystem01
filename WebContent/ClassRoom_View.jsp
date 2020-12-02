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
<link rel='stylesheet' href='sakamoto.css' />
<link rel='stylesheet' href='signup.css' />
<style>${style}</style>

<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script src="http://cdn.rawgit.com/phi-jp/high/0.0.3/high.js"></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/materialize/0.95.1/js/materialize.min.js'></script>
<script>
$(document).ready(function(){
$('select').formSelect();
});
</script>
</head>
<body>

<!--ヘッダー部分ー-->

<!--タイトル-->
<title>
オンライン学習支援システム
</title>
<div class='title'>
  <h1><img src="logo.png" alt=""></h1>
</div>


<!--メニューバー-->
<table>
<tbody>

	<div class="row">
        <div class='menubar hide-on-small-only show-on-medium-and-up'>
            <a class="waves-effect waves-light btn">教室</a>
            <a class="waves-effect waves-light btn">スケジュール</a>
            <a href="Create_Question_View_Sele.jsp" class="waves-effect waves-light btn">問題</a>
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
<body>
    <body>

          <div class="row">
      <div class="col s3 offset-s1">11/18 18:55 教室が作成されました<br>11/18 20:04 古閑先生が問題を作成しました</div>
      <div class="col s3 offset-s1">＜生徒＞<br>木下匠<br>篠崎大輔<br>坂元晴紀<br>坂井渓人<br></div>
<div class="col s3 offset-s1"><span class="flow-text">11/19 14:05 問題難しい<br>11/18 20:04 お腹すいた<br><br></span></div>
      <div class="col s12"><br></div>
      <div class="col s3 offset-s5">＜先生＞<br>古閑敦也</div>
      <div class="col s3 offset-s1"><br>aaaaaaaaaa</div>
      <div class="col s1">6</div>
      <div class="col s1">7</div>
      <div class="col s1">8</div>
      <div class="col s1">9</div>
      <div class="col s1">10</div>
      <div class="col s1">11</div>
      <div class="col s1">12</div>
    </div>


    </body>
    </body>

</html>