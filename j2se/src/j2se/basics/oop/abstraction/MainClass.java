package j2se.basics.oop.abstraction;

public class MainClass {
	public static void main(String[] args) {
		ProductDao pDao = new ProductDao();
		pDao.connect();
		pDao.save(new Product());
		pDao.disconnect();
	}
}
