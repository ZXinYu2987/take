<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <ul>
        <li>
            <h2>
                <a href="javascript:selectMer('查询','aaaa');">查询</a>
            </h2>
        </li>
    </ul>

<script>

    //查询方法
    function selectMer(title,content){
        var status=$("#tt").tabs("exists",title);
        if(!status){
            $('#tt').tabs('add',{
                title:title,
                href:"/merchantUrl/toList",
                closable:true,
                cache:true
            });
        }else{
            $("#tt").tabs("select",title);
        }
    }
</script>
</body>
</html>