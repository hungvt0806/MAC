package entity;

public class CategoryQuestion {
	public int 		categoryId;
	public String 	name;
	@Override
	public String toString() {
		return "CategoryQuestion [name=" + name + "]";
	}
	
	
	
	public CategoryQuestion() {
		super();
	}



	public CategoryQuestion(int categoryId, String name) {
		super();
		this.categoryId = categoryId;
		this.name = name;
	}



	public int getCategoryId() {
		return categoryId;
	}



	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
}
