<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: huang
  Date: 2017/7/5
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:if test="#request.employees == null || request.employees.size() == 0">
    <p>没有任何员工信息</p>
</s:if>
<s:else>
    <table border="1" cellpadding="10" cellspacing="0">
        <tr>
            <td>ID</td>
            <td>LASTNAME</td>
            <td>EMAIL</td>
            <td>BIRTH</td>
            <td>CREATETIME</td>
            <td>DEPT</td>
            <td>DELETE</td>
            <td>EDIT</td>
        </tr>
        <s:iterator value="#request.employees">
            <tr>${id}</tr>
            <tr>${lastName}</tr>
            <td>${email}</td>
            <td>
                <s:date name="birth" format="yyyy-MM-dd hh:mm:ss"/>
            </td>
            <td>${department.departmentName }</td>
            <td>
                <a href="emp-delete?id=${id }" class="delete">Delete</a>
                <input type="hidden" value="${lastName }"/>
            </td>
            <td>
                <a href="emp-input?id=${id }">Edit</a>
            </td>
        </s:iterator>
    </table>
</s:else>

</body>
</html>
