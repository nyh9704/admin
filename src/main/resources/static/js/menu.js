let $;
let rootMenu = [];
layui.use(['jquery', 'layer'], function(){
    $ = layui.jquery;
});

$(function (){
    $.ajax({
        url:"listMenus",
        type:"post",
        success:function(data){
            loadMenu(data.result);
        }
    })
})

function loadMenu(menuArry){
    //加载一级菜单
    for(let i = 0; i<menuArry.length; i++){
        if(menuArry[i].rootId == 0){
            let str = "";
            str+="<li id="+menuArry[i].menuId+" class='layui-nav-item layui-nav-itemed'><a href='javascript:;'>"+menuArry[i].menuName+""+"<span class='layui-nav-more'></span>"+"</a></li>";
            $("#menuUl").append(str);
            rootMenu.push(menuArry[i]);
        }
    }
    //加载二级菜单
    for(var i = 0; i<menuArry.length; i++){
        for(var j = 0; j<rootMenu.length; j++){
            if(menuArry[i].rootId == rootMenu[j].menuId){
                var str = "";
                str+=" <dl class='layui-nav-child'><dd><a href='javascript:;'>"+menuArry[i].menuName+"</a></dd></dl>";
                $("#"+menuArry[j].menuId).append(str);
                console.log(str);
            }
        }
    }
}