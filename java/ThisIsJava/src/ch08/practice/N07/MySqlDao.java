package ch08.practice.N07;

public class MySqlDao implements DataAccesObject {
	final String DB = "MySql DB";
	
	@Override
	public void select() {
		System.out.println(DB + "에서 검색");
	}

	@Override
	public void insert() {
		System.out.println(DB + "에서 삽입");
	}

	@Override
	public void update() {
		System.out.println(DB + "에서 수정");
	}

	@Override
	public void delete() {
		System.out.println(DB + "에서 삭제");
	}

}
