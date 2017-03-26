/**
 * Created by yang_gao on 2017/3/10.
 */
var app = new Vue({
    el:".banner",
    data:{
        message:"hello vue",
    },
    methods:{
      parseBanner :function(){
          var str =document.getElementById("banner_pre").innerHTML;
          str = str.substr(8,str.length);
          document.getElementById("banner_pre").innerHTML = str;
      }
    }
});