package pro1;


import java.util.ArrayList;

public class Author {

	String name;
	ArrayList<BookList> bookList;
	
	public ArrayList<BookList> getBookList() {
		return bookList;
	}
	public void setBookList(ArrayList<BookList> bookList) {
		this.bookList = bookList;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}