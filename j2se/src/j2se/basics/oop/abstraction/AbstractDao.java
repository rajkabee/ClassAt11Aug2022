package j2se.basics.oop.abstraction;

public abstract class AbstractDao<T> implements DataAccessObject<T>{
	@Override
	public void connect() {
		System.out.println("Connected to the database!");
	}
	@Override
	public void disconnect() {
		System.out.println("Disconnected form the database!");
	}
	
	}
