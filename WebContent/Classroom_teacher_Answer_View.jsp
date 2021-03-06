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
<link rel='stylesheet' href='classroom_tav.css' />
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
<p>正答解答状況</p>

  <div class="divider"></div>
  <div class="section">
<div class="row">
    <div class="col s2">


    <div class="disp-area">
      <div id="smallArea">
        <span>木下匠</span>
      </div>
      <div id="largeArea">
        <span>応用情報午前30年春</span>
        <br>
        <span>問11</span>
      </div>
</div>
</div>
<div>
<table class="col s10">
<br>
<br>
<br>
        <thead>
          <tr>
              <th>問1</th>
              <th>問2</th>
              <th>問3</th>
              <th>問4</th>
              <th>問5</th>
              <th>問6</th>
              <th>問7</th>
              <th>問8</th>
              <th>問9</th>
              <th>問10</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>ア</td>
            <td>ウ</td>
            <td>エ</td>
            <td>ア</td>
            <td>ウ</td>
            <td>エ</td>
            <td>ア</td>
            <td>ウ</td>
            <td>エ</td>
            <td>エ</td>
          </tr>

        </tbody>
      </table>
</div>
 </div>
 </div>

  <div class="divider"></div>
  <div class="section">
<div class="row">
    <div class="col s2">


    <div class="disp-area">
      <div id="smallArea">
        <span>篠崎大輔</span>
      </div>
      <div id="largeArea">
        <span>応用情報午前30年春</span>
        <br>
        <span>問15</span>
      </div>
</div>
</div>
<div>
<table class="col s10">
<br>
<br>
<br>
        <thead>
          <tr>
              <th>問1</th>
              <th>問2</th>
              <th>問3</th>
              <th>問4</th>
              <th>問5</th>
              <th>問6</th>
              <th>問7</th>
              <th>問8</th>
              <th>問9</th>
              <th>問10</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>ア</td>
            <td>ウ</td>
            <td>エ</td>
            <td>ア</td>
            <td>ウ</td>
            <td>エ</td>
            <td>ア</td>
            <td>ウ</td>
            <td>エ</td>
            <td>エ</td>
          </tr>

        </tbody>
      </table>
</div>
</div>
</div>
 <div class="divider"></div>
  <div class="section">
<div class="row">
    <div class="col s2">


    <div class="disp-area">
      <div id="smallArea">
        <span>坂元晴紀</span>
      </div>
      <div id="largeArea">
        <span>応用情報午前30年春</span>
        <br>
        <span>問35</span>
      </div>
</div>
</div>
<div>
<table class="col s10">
<br>
<br>
<br>
        <thead>
          <tr>
              <th>問1</th>
              <th>問2</th>
              <th>問3</th>
              <th>問4</th>
              <th>問5</th>
              <th>問6</th>
              <th>問7</th>
              <th>問8</th>
              <th>問9</th>
              <th>問10</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>ア</td>
            <td>ウ</td>
            <td>エ</td>
            <td>ア</td>
            <td>ウ</td>
            <td>エ</td>
            <td>ア</td>
            <td>ウ</td>
            <td>エ</td>
            <td>エ</td>
          </tr>

        </tbody>
      </table>
</div>
</div>
</div>


</body>
</html>