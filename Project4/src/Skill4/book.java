package Skill4;

public class book {

	private String title;
	private String author;
	private double price;
	
	


public void setTitle(String title) {
	
	this.title = title;
	
}

public void setAuthor(String author) {
	this.author = author;
}

public void setPrice(double price) {
	this.price = price;
}

public String getTitle(){
	return title;
}

public String getAuthor(){
	return author;
}

public double getPrice() {
	return price;
}

public String toString() {
	return "Book - \n" + "Title-" + title + "\n"
			+ "Author -" + author + "\n" +
			"Price-" + price;
}

public static void main(String[] args) {
	book mybook = new book();
	
	mybook.setTitle("Harry Potter");
	mybook.setAuthor("J K Rowling");
	mybook.setPrice(300);
	
	System.out.println(mybook);
}







}


