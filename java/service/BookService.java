package service;

import java.util.ArrayList;

import vo.BookVO;

public interface BookService {
	public void addBook(BookVO bookVO) throws Exception;
	public BookVO getBookById(int bookId) throws Exception;
	public ArrayList<BookVO> getAllBooks() throws Exception;
	public void updateBook(BookVO bookVO) throws Exception;
	public void removeBook(int bookId) throws Exception;

}
