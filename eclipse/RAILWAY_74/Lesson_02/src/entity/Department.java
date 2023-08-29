package entity;

public class Department {
	public int 	id;
	public String 	name;
	@Override
	public String toString() {
		return "Department [name=" + name + "]";
	}
	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
