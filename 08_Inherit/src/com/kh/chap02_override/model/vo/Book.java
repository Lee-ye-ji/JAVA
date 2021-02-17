package com.kh.chap02_override.model.vo;

// ��� Ŭ������ Object Ŭ������ �ļ�. ��, �ֻ��� Ŭ������ �׻� Object
// --> ��� Ŭ������ Object�� �ִ� �޼ҵ带 �������̵� �� �� ����
// API���� Object Ŭ������ �޼ҵ� Ȯ���ϱ�
public class Book extends Object {
	private String title;
	private String author;
	private int price;

	public Book() {
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String information() {
		return "title : " + title + ", author : " + author + ", price : " + price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	/*
	 * @Override public String toString() { return "title : " + title +
	 * ", author : " + author + ", price : " + price; }
	 */

	/*
	 * // �����ϰ� ����
	 * 
	 * @Override public boolean equals(Object obj) { // this (�� ��ü) vs obj (���� ���
	 * ��ü) // Book Object Book other = (Book)obj; // obj Ÿ���� Book���� ����ȯ ����
	 * 
	 * // this vs other if(title.equals(other.getTitle()) &&
	 * author.equals(other.getAuthor()) && price == other.getPrice()) { return true;
	 * } return false; }
	 * 
	 * // �����ϰ� ����
	 * 
	 * @Override public int hashCode() { // ��� ������ ���� �ؽ��ڵ带 �����ϱ� // title + author +
	 * price -> ���ڿ� // String Ŭ������ hashCode()�� ���� �� ���� ���� return (title + author +
	 * price).hashCode(); // -> ���� ���ڿ��� ��� �ش� ���ڿ��� hashCode�� ������ �̹� String Ŭ������ ������
	 * �Ǿ� ���� }
	 */

	// ��Ŭ�������� �����ϴ� �ڵ� �ϼ� ver
	// ���� ȿ���������� �ڵ�� ������
	@Override
	public int hashCode() {
		// �ؽ��ڵ� ���� �浹(��ø)������ ������ �ʵ��� �Ҽ��� ����ϴ� ���(��, �浹�� ���̴� ���)
		
		final int prime = 31; // 31�̶�� ���ڰ� �Ҽ��̸鼭 Ȧ������ Hash���� ��� �浹�� ���� �� ����

		int result = 1;
		
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// 1. �ּҰ� �� - �ּҰ� ������ �翬�� ���� ���� �����ϰ� �����Ƿ� ���� ��ü�� true ��ȯ
		if (this == obj)
			return true;
		// 2. �ּҰ��� null���� �� - null�̶�°� �����ϴ� �� ���ٴ� �ǹ��̹Ƿ� ���� ��ġ�� ������ false ����
		if (obj == null)
			return false;
		// 3. Ŭ������ �� - �����ڷ����� ���� ������ �ٸ� �ڷ����̶�� �Ҹ� -> ���� ��ġ�� ������ false ����
		if (getClass() != obj.getClass())
			return false;
		// ������� ������ �켱 1�� �հ�
		// �� �ʵ�� �񱳸� ���� obj ����ȯ
		Book other = (Book) obj;
		// title �ʵ� ���� �Ѵ� null�̰ų� ���� �� false ���� �ȹ���
		if (title == null) { // this.title�� null�̰�
			if (other.title != null) // other.title�� null �� �ƴѰ��
				return false; // �翬�� ���� �����Ƿ� false����

		} else if (!title.equals(other.title)) // this.title�� null�� �ƴ� ��� other.title�� ������ ���ڿ��� �ƴϸ�
			return false; // false ����

		// ���� �����ϰ� �۾�
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;

		// price �ʵ� ���� ���� �ʵ��� �޸� �⺻ �ڷ����̱� ������ ���� ��ġ�ϴ��� ����
		if (price != other.price)
			return false;

		// ���� ���ǵ��� �� �ش���� �ʾƼ� ������� �´ٸ� ��� �ʵ尪���� ��ġ�ϴٴ� ���̱� ������ true�� ����
		return true;
	}

}