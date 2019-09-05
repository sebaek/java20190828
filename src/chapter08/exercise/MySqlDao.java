package chapter08.exercise;

public class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("mysql db select");
	}

	@Override
	public void insert() {
		System.out.println("mysql db insert");

	}

	@Override
	public void update() {
		System.out.println("mysql db update");

	}

	@Override
	public void delete() {
		System.out.println("mysql db delete");

	}

}
