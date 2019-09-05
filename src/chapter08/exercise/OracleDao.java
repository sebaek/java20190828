package chapter08.exercise;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("oracle db select");

	}

	@Override
	public void insert() {
		System.out.println("oracle db insert");
	}

	@Override
	public void update() {
		System.out.println("oracle db update");
	}

	@Override
	public void delete() {
		System.out.println("oracle db delete");
	}

}
