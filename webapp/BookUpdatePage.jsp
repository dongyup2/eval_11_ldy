<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>도서정보 등록 폼</h1>
<hr>
<form onsubmit="return validateForm();" action="BookInsertServlet" method="post">
<table>
	<tr>
	<form onsubmit="return validateForm();" action="UpdateBookServlet" method="post">
   		<input type="hidden" name="id" value="${book.id}" />
    	<label>도서 제목 <input type="text" id="booktitle" name="booktitle" value="${book.title}"><br>
    	<label>저자 <input type="text" id="bookauthor" name="bookauthor" value="${book.author}"><br>
    	<label>출판사 <input type="text" id="bookpublisher" name="bookpublisher" value="${book.publisher}"><br>
    	<label>가격 <input type="number" id="bookprice" name="bookprice" value="${book.price}"><br>
    	<label>도서 정보 <textarea type="text" id="bookinfo" name="bookinfo">${book.info}</textarea><br>
    	<button type="submit">수정</button> <button type="reset">초기화</button>
</form>
	</tr>
</table>
</form>
</body>
<script>
function validateForm() {
    const booktitle = document.getElementById('booktitle');
    const bookauthor = document.getElementById('bookauthor');
    const bookpublisher = document.getElementById('bookpublisher');
    const bookprice = document.getElementById('bookprice');
    const bookinfo = document.getElementById('bookinfo');

    if (booktitle.value == "") {
        alert("도서 제목이 입력되지 않았습니다!");
        booktitle.focus();
        return false;
    }
    if (bookauthor.value == "") {
        alert("도서 저자가 입력되지 않았습니다!");
        bookauthor.focus();
        return false;
    }
    if (bookpublisher.value == "") {
        alert("도서 출판사가 입력되지 않았습니다!");
        bookpublisher.focus();
        return false;
    }
    if (bookprice.value == "") {
        alert("도서가격이 선택되지 않았습니다!");
        bookprice.focus();
        return false;
    }
    if (bookinfo.value == "") {
        alert("도서정보가 입력되지 않았습니다!");
        bookinfo.focus();
        return false;
    }
    return true;
}
</script>
</html>
