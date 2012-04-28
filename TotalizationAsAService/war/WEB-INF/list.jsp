<%@ page language="java" contentType="text/html; charset=windows-31j"
    pageEncoding="windows-31j"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.List" %>
<%@page import="com.ynujc.totalization.jdo.Jansi" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-31j">
<title>メンバー一覧</title>
</head>
<body>
	<%List<Jansi> jansiList = (List<Jansi>)request.getAttribute("memberList"); %>
	<table>
		<tr><th>id</th><th>姓</th><th>名</th><th>ニックネーム</th><th>年度</th><th>コメント</th><th></th></tr>
		<%for(Jansi jansi : jansiList) {%>
			<tr>
				<td><%=jansi.getJansiId().getName() %></td>
				<td><%=jansi.getJansiFamilyNameKana() %></td>
				<td><%=jansi.getJansiFirstNameKana() %></td>
				<td><%=jansi.getJansiNickName() %></td>
				<td><%=jansi.getYear() %></td>
				<td><%=jansi.getComment() %></td>
				<td><input type="button"/></td>
			</tr>
		<%} %>
		<tr>
			<td><input type="text" name="jansiId"/></td>
			<td><input type="text" name="jansiFamilyName"/></td>
			<td><input type="text" name="jansiFirstName"/></td>
			<td><input type="text" name="jansiNickName"/></td>
			<!-- めんどいのでとりあえず1個 -->
			<td><select><option>2005</option></select></td>
			<td><input type="text" name="comment"/></td>
		</tr>
	</table>
</body>
</html>