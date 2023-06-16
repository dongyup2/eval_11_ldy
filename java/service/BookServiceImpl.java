package service;

import java.util.ArrayList;

import config.ServletContextConfig;
import dao.BookDao;
import vo.BookVO;

public class BookServiceImpl implements BookService{

	private final BookDao bookDao;
	
	public BookServiceImpl() {
		bookDao = ServletContextConfig.getInstance().getBookDao();
	}
	
	
	@Override
	public void addBook(BookVO bookVO) throws Exception { //책 추가 서비스 
		bookDao.insert(bookVO);
	}
	
	@Override
	public BookVO getBookById(int bookId) throws Exception { // 책 조회 서비스
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<BookVO> getAllBooks() throws Exception {//책 전체조회 서비스
		return bookDao.selectAll();	 
	}

	@Override
	public void updateBook(BookVO bookVO) throws Exception { // 책 수정 서비스
		bookDao.update(bookVO);
		
	}

	@Override
	public void removeBook(int bookId) throws Exception { // 책 삭제 서비스
		// TODO Auto-generated method stub
		
	}

}
