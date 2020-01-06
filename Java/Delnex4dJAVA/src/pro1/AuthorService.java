package pro1;

import java.util.ArrayList;

public class AuthorService {
	public static void main(String[] args) {
		BookList bl1 = new BookList("ALCHEMIST");
		BookList bl2 = new BookList("MAN WHO SOLD IS FERRARI");

		Author au = new Author();
		au.setName("PAULO CHOLEO");

		ArrayList<BookList>books = new ArrayList<>();

		books.add(bl1);
		books.add(bl2);

		au.setBookList(books);

		System.out.println(au.getName());

		ArrayList<BookList>bkk=au.getBookList();
		for(BookList b:bkk) {
			System.out.println(b.getName());
		}		
	}
}
