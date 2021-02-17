package com.kh.chap02_override.model.vo;

// 모든 클래스는 Object 클래스의 후손. 즉, 최상위 클래스는 항상 Object
// --> 모든 클래스는 Object에 있는 메소드를 오버라이딩 할 수 있음
// API에서 Object 클래스의 메소드 확인하기
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
	 * // 간단하게 구현
	 * 
	 * @Override public boolean equals(Object obj) { // this (현 객체) vs obj (비교할 대상
	 * 객체) // Book Object Book other = (Book)obj; // obj 타입을 Book으로 형변환 해줌
	 * 
	 * // this vs other if(title.equals(other.getTitle()) &&
	 * author.equals(other.getAuthor()) && price == other.getPrice()) { return true;
	 * } return false; }
	 * 
	 * // 간단하게 구현
	 * 
	 * @Override public int hashCode() { // 멤버 값들의 합의 해쉬코드를 리턴하기 // title + author +
	 * price -> 문자열 // String 클래스의 hashCode()를 통해 그 값을 리턴 return (title + author +
	 * price).hashCode(); // -> 같은 문자열의 경우 해당 문자열의 hashCode는 같도록 이미 String 클래스에 재정의
	 * 되어 있음 }
	 */

	// 이클립스에서 제공하는 자동 완성 ver
	// 보다 효율적이지만 코드는 복잡함
	@Override
	public int hashCode() {
		// 해쉬코드 값이 충돌(중첩)현상이 생기지 않도록 소수로 계산하는 방법(즉, 충돌을 줄이는 방법)
		
		final int prime = 31; // 31이라는 숫자가 소수이면서 홀수여서 Hash했을 경우 충돌을 줄일 수 있음

		int result = 1;
		
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// 1. 주소값 비교 - 주소가 같으면 당연히 같은 곳을 참조하고 있으므로 같은 객체로 true 반환
		if (this == obj)
			return true;
		// 2. 주소값이 null인지 비교 - null이라는게 참조하는 게 없다는 의미이므로 비교할 가치도 없으니 false 리턴
		if (obj == null)
			return false;
		// 3. 클래스명 비교 - 참조자료형이 같지 않으면 다른 자료형이라는 소리 -> 비교할 가치도 없으니 false 리턴
		if (getClass() != obj.getClass())
			return false;
		// 여기까지 왔으면 우선 1차 합격
		// 각 필드들 비교를 위해 obj 형변환
		Book other = (Book) obj;
		// title 필드 값이 둘다 null이거나 같을 때 false 리턴 안받음
		if (title == null) { // this.title가 null이고
			if (other.title != null) // other.title가 null 이 아닌경우
				return false; // 당연히 같지 않으므로 false리턴

		} else if (!title.equals(other.title)) // this.title이 null이 아닌 경우 other.title과 동일한 문자열이 아니면
			return false; // false 리턴

		// 위와 동일하게 작업
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;

		// price 필드 값은 위의 필드들과 달리 기본 자료형이기 때문에 값만 일치하는지 본다
		if (price != other.price)
			return false;

		// 위의 조건들이 다 해당되지 않아서 여기까지 온다면 모든 필드값들이 일치하다는 말이기 때문에 true로 리턴
		return true;
	}

}
