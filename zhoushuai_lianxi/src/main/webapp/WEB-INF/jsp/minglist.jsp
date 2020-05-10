<%--
  Created by IntelliJ IDEA.
  User: progr
  Date: 2019/8/20
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>--%>
<html>
<head>
	<%--<fmt:formatDate value="" pattern="" />--%>
    <title>Title</title>
    <link rel="stylesheet" href="static/css/css.css">
    <script type="text/javascript" src="static/js/jquery-1.8.2.min.js"></script>
    <script>
            function shan(id,tid) {
                location="shan?id="+id+"&tid="+tid
            }
            function ca() {
                var mohu=$("#mohu").val()
                location="minglist?mohu="+mohu

            }
    </script>
</head>
<body>
<h1>考试明细列表</h1>
试卷名称<input type="text" id="mohu">
<input type="button" onclick="ca()" value="查询">
<a href="shilist">试卷列表</a>
    <table border="1">
        <tr>
            <td>序号</td>
            <td>试卷名称</td>
            <td>阶段</td>
            <td>要求明细</td>
            <td>分数</td>
            <td>是否是效果分</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${list}" var="li" varStatus="r">
            <tr>
                <td>${r.index+1}</td>
                <td>${li.name}</td>
                <td>${li.duan}</td>
                <td>${li.yao}</td>
                <td>${li.fen}</td>
                <td>${li.xiao}</td>

                <td>
                    <button onclick="shan('${li.id}',${li.tid})">删除</button>
                </td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
