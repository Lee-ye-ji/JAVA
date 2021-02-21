package ncs.test2;

public class Tv {
	private String name;
	private int price;
	private String description;
	
	public Tv() {} // �⺻ ������

	// 3���� Ŭ���� ������ �޴� ������
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

	// Tv ��ü�� �̸�, ����, ���� ���� String���� ����
	@Override
	public String toString() {
		return name + "  " + price + " " + description;
	}
	
	

}
