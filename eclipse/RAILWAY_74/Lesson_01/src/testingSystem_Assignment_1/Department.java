package testingSystem_Assignment_1;

public class Department {
	int 	id;
	String 	name;
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
