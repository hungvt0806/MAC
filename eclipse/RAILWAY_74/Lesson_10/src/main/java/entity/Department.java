package entity;

public class Department {
	public int 	id;
	public String 	name;
	
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}



	public Department() {
		super();
	}

	

	public Department(int id) {
		super();
		this.id = id;
	}

	

	public Department(String name) {
		super();
		this.name = name;
	}



	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
