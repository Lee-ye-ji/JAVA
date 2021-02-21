package ncs.test2;

public class Tv {
	private String name;
	private int price;
	private String description;
	
	public Tv() {} // 기본 생성자

	// 3개의 클래스 변수를 받는 생성자
	public Tv(String name, int price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}

	// getter-setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// Tv 객체의 이름, 가격, 설명 정보 String으로 리턴
	@Override
	public String toString() {
		return name + "  " + price + " " + description;
	}
	
	

}
