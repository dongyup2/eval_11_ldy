package config;

import dao.BookDao;
import dao.BookDaoImpl;
import dao.UserDao;
import dao.UserDaoImpl;
import lombok.Getter;
import service.BookService;
import service.BookServiceImpl;
import service.UserService;
import service.UserServiceImpl;

@Getter
public class ServletContextConfig {
	private static ServletContextConfig instance = null;
	/*
	 * Custom IoC (객체관리)
	 */
	private BookDao bookDao;
	private BookService bookService;
	
	private UserDao userDao;
	private UserService userService;
	
	private ServletContextConfig() {}
	
	public static ServletContextConfig getInstance() {
		if(instance == null) {
			instance = new ServletContextConfig();
			instance.setIoc();
		}
		return instance;
	}
	private void setIoc() {
		if(bookDao == null) {
			bookDao = new BookDaoImpl();
		}
		if(bookService == null) {
			bookService = new BookServiceImpl();
		}
		if(userDao == null) {
			userDao = new UserDaoImpl();
		}
		if(userService == null) {
			userService = new UserServiceImpl();
		}
	}
}
