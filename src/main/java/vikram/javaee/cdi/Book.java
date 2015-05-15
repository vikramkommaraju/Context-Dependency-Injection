package vikram.javaee.cdi;

public class Book {
	
	private String title;
	private Float price;
	private String desciption;
	private String number;
	
	
	public Book(String title, Float price, String desciption, String number) {
		super();
		this.title = title;
		this.price = price;
		this.desciption = desciption;
		this.number = number;
	}


	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", desciption="
				+ desciption + ", number=" + number + "]";
	}
	
	
	
	
	

}
