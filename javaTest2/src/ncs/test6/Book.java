package ncs.test6;

public class Book {
	private String category;
	private String bookName;
	private double bookPrice;
	private double bookDiscountRate;
	
	public Book() {}
	
	public Book(String category, String bookName, double bookPrice, double bookDiscountRate) {
		super();
		this.category = category;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public double getBookDiscountRate() {
		return bookDiscountRate;
	}

	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}

	@Override
	public String toString() {
		return  category + "\t" + bookName + "\t" + bookPrice
				+ "�� \t" + bookDiscountRate + "%";
	}
	
	
	
	
}
