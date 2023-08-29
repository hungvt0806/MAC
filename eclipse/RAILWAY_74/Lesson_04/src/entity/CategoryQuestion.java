package entity;

public class CategoryQuestion {
	public int 		categoryId;
	public String 	name;
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
