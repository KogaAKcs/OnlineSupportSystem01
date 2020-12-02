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
<!--  ../src/OSSmainPackage/Create_Question_Controller_Sele.java -->
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
<p>問題を作成しましょう！</p>

<form method="POST" action="./Create_Question_Controller_Sele">
<div class='button8'><a href="Create_Question_View_Sele.jsp" class="btn btn--white1">選択問題</a>
 	                 <a href="Create_Question_View_Dec.jsp" class="btn btn--white2">記述問題</a></div>
 <div>
<select name="categoryID" style="display: block">
<option value="1">セキュリティ</option>
<option value="2">ストラテジ</option>
<option value="3">ソフトウェア</option>
<option value="4">ハードウェア</option>
<option value="5">法務</option>
</select>

</div>
<br>
  <div class="item">
    <label class="label">１.問題を作成してください</label>
    <br>
    <input class="inputs" type="text1" name="question">
  </div>

  <div class="item">
    <label class="label">２.画像が必要な場合は挿入してください</label>
    <br>
    <input type="file" name="picture" accept="image/jpeg, image/png">
  </div>

  <div class="item">
    <label class="label">３.解答群を作成してください</label>
    <br>
    解答「A」：<input class="inputs" type="text1" name="answer1">
    <br>
    解答「B」：<input class="inputs" type="text1" name="answer2">
    <br>
    解答「C」：<input class="inputs" type="text1" name="answer3">
    <br>
    解答「D」：<input class="inputs" type="text1" name="answer4">
  </div>

  <div class="item">
    <label class="label">４.解答を作成してください</label>
    <br>
    <input class="inputs" type="text1" name="correctanswer">
  </div>
<div class='button8'><a href="" class="btn btn--white1">下書きに保存してキャンセル</a>
 	                 <a href="" class="btn btn--white2">続けて作成！</a>
 	                 <br>
 	                 <a href="" class="btn btn--white1">キャンセル</a>

 	                 </div>
 	                 <input type="submit" value="作成完了！"/>
</form>

</body>
</html>