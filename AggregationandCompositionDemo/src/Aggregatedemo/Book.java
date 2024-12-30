package Aggregatedemo;


public class Book {
	
	int bookId;
	String bookName;
	Author author; //this is the other object in book object called aggregation
	
	public Book(int bookId,String bookName, Author author)
	{
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
	}
	public void showDetails()
	{
		System.out.println("BookId:"+bookId+" "+"BookName:"+bookName);
		System.out.println("AuthorName:"+author.authorName+" "+"Author Age:"+author.authorAge);
	}

	public static void main(String[] args) {
		
		Author author = new Author("Balaji",60);
		Book book = new Book(1,"Java",author);
		book.showDetails();
		

	}

}
