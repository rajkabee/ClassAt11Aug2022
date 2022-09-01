package j2se.basics.oop.abstraction;

import java.util.ArrayList;

public class ProductDao extends AbstractDao<Product>{

	@Override
	public int save(Product t) {
		System.out.println("Product added to the database!");
		return 0;
	}

	@Override
	public Product getOne(int id) {
		System.out.println("the product is a pen!");
		return null;
	}

	@Override
	public ArrayList<Product> getAll() {
		System.out.println("all the products read from the database");
		return null;
	}

	@Override
	public int update(Product t) {
		System.out.println("Product updatad in the database!");
		return 0;
	}

	@Override
	public int delete(int id) {
		System.out.println("product deleted from the database!");
		return 0;
	}

}
