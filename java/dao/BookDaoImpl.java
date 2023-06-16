package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import jdbc.DBcon;
import vo.BookVO;

public class BookDaoImpl implements BookDao{
	private DBcon pool;
	
	private String sql;
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public BookDaoImpl() {
		pool = DBcon.getInstance();
	}
	
	@Override
	public void insert(BookVO bookVO) throws Exception{ //추가 메소드
		sql = "INSERT INTO booktbl (title, author, publisher, price, binfo) VALUES(?,?,?,?,?)";
		con = pool.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,bookVO.getTitle());
			pstmt.setString(2,bookVO.getAuthor());
			pstmt.setString(3,bookVO.getPublisher());
			pstmt.setInt(4,bookVO.getPrice());
			pstmt.setString(5,bookVO.getBinfo());
			pstmt.executeQuery();
		} catch (Exception e) {
			
		}
	
	}

	@Override
	public BookVO selectOne() throws Exception{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<BookVO> selectAll() throws Exception{
		ArrayList<BookVO> bookList = new ArrayList<BookVO>();
		sql ="select * from booktbl";
		try {
			con = pool.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BookVO bookVO = new BookVO();
				bookVO.setBcode(rs.getInt("bcode"));
				bookVO.setTitle(rs.getString("title"));
				bookVO.setAuthor(rs.getString("author"));
				bookVO.setPublisher(rs.getString("publisher"));
				bookVO.setPrice(rs.getInt("price"));
				
				bookList.add(bookVO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bookList;
	}

	@Override
	public void update(BookVO bookVO) throws Exception{
		sql = "UPDATE booktbl set title=?, author=?, publisher=? price=?, binfo=? where bcode=? ";
		con = pool.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bookVO.getTitle());
			pstmt.setString(2, bookVO.getAuthor());
			pstmt.setString(3, bookVO.getPublisher());
			pstmt.setInt(4, bookVO.getPrice());
			pstmt.setString(5, bookVO.getBinfo());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete() throws Exception{
		// TODO Auto-generated method stub
		
	}

}
