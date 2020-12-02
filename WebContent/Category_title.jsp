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
<!--  ../src/OSSmainPackage/Create_Category_Controller.java -->
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

  <form method="POST" action="./Create_Category_Controller">
  <br>
 <label>作成したい問題をもとに題名を入力してください</label>
    <br>
    <input class="inputs" type="text1" name="Name">

      <br>
          <input class="inputs" type="text1" name="CategoryID">
      <br>
          <input class="inputs" type="text1" name="TeacherID">
 <label>問題をすでにある問題集に追加したい場合は<br>
                      選択し、問題を作成してください</label>
    <br>

                <p>
                    <input type="checkbox"
                           id="test1" />
                    <label for="test1">31</label>
                </p>
                <p>
                    <input type="checkbox"
                           id="test2" />
                    <label for="test2">30</label>
                </p>
                  <p>
                    <input type="checkbox"
                           id="test3" />
                    <label for="test3">29</label>
                </p>
                   <p>
                    <input type="checkbox"
                           id="test4" />
                    <label for="test4">28</label>
                </p>

<input type="submit" value="問題を作成する">
</form>


</body>
</html>