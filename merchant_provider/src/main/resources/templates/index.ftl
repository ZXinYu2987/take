<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/jquery-easyui-1.5.4.2/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="/jquery-easyui-1.5.4.2/themes/icon.css">
    <script type="text/javascript" src="/jquery-easyui-1.5.4.2/jquery.min.js"></script>
    <script type="text/javascript"src="/jquery-easyui-1.5.4.2/jquery.easyui.min.js"></script>
    <script type="text/javascript"src="/jquery-easyui-1.5.4.2/locale/easyui-lang-zh_CN.js"></script>
    <!--引入CSS-->
    <link rel="stylesheet" type="text/css" href="../webuploader-0.1.5/webuploader.css">
    <link href="/webuploader-0.1.5/style.css" type="text/css" rel="stylesheet"/>
    <!--引入JS-->
    <script type="text/javascript" src="/webuploader-0.1.5/webuploader.js"></script>
</head>

<body class="easyui-layout">
    <div data-options="region:'north',title:'地址栏',split:true" style="height:150px;">
        <center>
            <font size="7" color="#db7093">商品</font>
        </center>
    </div>
    <div data-options="region:'west',title:'菜单栏',split:true" style="width:150px;">

        <div id="aa" fit="true" class="easyui-accordion" style="width:300px;height:200px;">
            <div title="Title1" data-options="iconCls:'icon-save',href:'/merchantUrl/toMenu'" style="overflow:auto;padding:10px;">

            </div>
        </div>

    </div>
    <div data-options="region:'center',title:'展示区'" style="padding:5px;background:#eee;">

        <div id="tt" class="easyui-tabs" style="width:500px;height:250px;" fit="true" >
            <div title="Tab1" style="padding:20px;display:none;">
                tab1
            </div>

        </div>

    </div>
</body>

</html>