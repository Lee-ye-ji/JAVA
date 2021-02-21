package ncs.test4;

public class ProductTest {

	public static void main(String[] args) {
		Product p = new Product("°¶·°½Ã s7", 563500, 3);
		System.out.println(p.information());
		int purchase = p.getPrice() * p.getQuantity();
		System.out.println("ÃÑ ±¸¸Å °¡°Ý : " + purchase + "¿ø");

	}

}
