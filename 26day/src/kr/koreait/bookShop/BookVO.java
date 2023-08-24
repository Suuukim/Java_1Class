package kr.koreait.bookShop;

import java.util.Date;

public class BookVO {
	
	private String title;		// 도서명
	private String author;		// 저자명
	private String publisher;	// 출판사명
	private Date date;			// 출판일
	private double price;		// 가격
	
	public BookVO() {}
	public BookVO(String title, String author, String publisher, Date date, double price) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.date = date;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookVO [title=" + title + ", author=" + author + ", publisher=" + publisher + ", date=" + date
				+ ", price=" + price + "]";
	}
	
}
