package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import config.ServletContextConfig;
import service.BookService;
import vo.BookVO;

@WebServlet("/BookInsertServlet")
public class BookInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final BookService bookService;
 
    public BookInsertServlet() {
        bookService = ServletContextConfig.getInstance().getBookService();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("BookRegform.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("도서 등록요청");
		response.setContentType("text/plain; charset=utf-8");
		
		BookVO bookVO = BookVO.builder()
						.title(request.getParameter("booktitle"))
						.author(request.getParameter("bookauthor"))
						.publisher(request.getParameter("bookpublisher"))
						.price(Integer.parseInt(request.getParameter("bookprice")))
						.binfo(request.getParameter("bookinfo"))
						.build();
		
		try {
			bookService.addBook(bookVO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
