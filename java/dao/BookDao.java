package dao;

import java.util.ArrayList;

import vo.BookVO;

public interface BookDao {
	public void insert(BookVO bookVO) throws Exception;
	public BookVO selectOne ()throws Exception;
	public ArrayList<BookVO> selectAll() throws Exception;
	public void update(BookVO bookVO) throws Exception;
	public void delete() throws Exception;
}
