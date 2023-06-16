<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>도서 목록 보기 화면</h1>
<hr>
<h3>도서 목록</h3>
<table border = "1px">
	<thead>
		<th>도서번호</th>
		<th>도서 제목</th>
		<th>저자</th>
		<th>출판사</th>
		<th>가격</th>
	</thead>
	<tbody>
		<c:forEach var="book" items="${bookList}">
            <tr>
                <td>${book.bcode}</td>
                <td>${book.title}</td>
                <td>${book.author}</td>
                <td>${book.publisher}</td>
                <td>${book.price}</td>
            </tr>
        </c:forEach>
	</tbody>
</table>
</body>
</html>