var timer = null;
$.ajax({
  url: '/stream.php',
  type: 'POST',
  cache: false,
  xhrFields: {
    onloadstart: function(){
      var xhr = this;
      var resTextLen = 0;
      timer = setInterval(function(){
        /// レスポンス全体のテキスト
        var resText = xhr.responseText;
        /// 新たに追加されたレスポンスだけ切り取り
        var newResText = resText.substring(resTextLen);

        /// 更新部分があるならデータ表示
        if(resText.length > resTextLen){
          newResText.split("\n").forEach(function(line){
            var json = [];
            try {
              json = JSON.parse(line);
            }catch(e){
              //console.error('Failed to parse JSON');
              return;
            }

            resTextLen = resText.length;

            /// 更新部分だけをコンソール表示
            console.log('json : ', json);
          }, 100);
        }
      });
    }
  },
  success: function(){
    /// 全部終わったらタイマー解除
    setTimeout(function(){
      clearInterval(timer); }, 1000);
  },
  error: function(){
    /// エラーが起きてもタイマー解除
    clearInterval(timer);
  }
});