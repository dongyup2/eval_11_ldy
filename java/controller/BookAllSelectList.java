package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import config.ServletContextConfig;
import service.BookService;
import vo.BookVO;

/**
 * Servlet implementation class BookAllSelectList
 */
@WebServlet("/BookAllSelectList")
public class BookAllSelectList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private final BookService bookService;
	   
    public BookAllSelectList() {
        bookService = ServletContextConfig.getInstance().getBookService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<BookVO> bookList = bookService.getAllBooks();
			request.setAttribute("bookList", bookList);
			
			request.getRequestDispatcher("BookListSelect.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
