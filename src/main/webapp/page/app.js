/**
 * Created by yang_gao on 2017/3/10.
 */
var app = new Vue({
    el:".content",
    data:{
        message:"hello vue",
        input:"",
        currentRoute: window.location.pathname,
        todoList: [{
            date: '2016-05-02',
            content: '王小虎',
            address: '上海市普陀区金沙江路 1518 弄'
        }, {
            date: '2016-05-04',
            content: '王小虎',
            address: '上海市普陀区金沙江路 1517 弄'
        }, {
            date: '2016-05-01',
            content: '王小虎',
            address: '上海市普陀区金沙江路 1519 弄'
        }, {
            date: '2016-05-03',
            content: '王小虎',
            address: '上海市普陀区金沙江路 1516 弄'
        }]
    },
    methods:{
    }
});
