package testingSystem_Assignment_1;

public class CategoryQuestion {
	int 	categoryId;
	String 	name;
	@Override
	public String toString() {
		return "CategoryQuestion [name=" + name + "]";
	}
	public CategoryQuestion(int categoryId, String name) {
		super();
		this.categoryId = categoryId;
		this.name = name;
	}

}
