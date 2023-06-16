package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import config.ServletContextConfig;
import service.BookService;

/**
 * Servlet implementation class BookUpdateServlet
 */
@WebServlet("/BookUpdateServlet")
public class BookUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private final BookService bookService;
    public BookUpdateServlet() {
    	bookService = ServletContextConfig.getInstance().getBookService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("BookUpdatePage.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
        int id = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("booktitle");
        String author = request.getParameter("bookauthor");
        String publisher = request.getParameter("bookpublisher");
        int price = Integer.parseInt(request.getParameter("bookprice"));
        String info = request.getParameter("bookinfo");
        
        
	}

}
