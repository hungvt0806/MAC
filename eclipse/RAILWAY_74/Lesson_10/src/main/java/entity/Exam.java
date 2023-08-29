package entity;
import java.time.LocalDate;

public class Exam {
	public int 					id;
	public String 				code;
	public String 				title;
	public CategoryQuestion 	categoryId;
	public int 					duration;
	public int 					creatorId;
	public LocalDate 			createDate;
	
	
	
	public Exam() {
		super();
	}



	public Exam(int id, String code, String title, CategoryQuestion categoryId, int duration, int creatorId,
			LocalDate createDate) {
		super();
		this.id = id;
		this.code = code;
		this.title = title;
		this.categoryId = categoryId;
		this.duration = duration;
		this.creatorId = creatorId;
		this.createDate = createDate;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public CategoryQuestion getCategoryId() {
		return categoryId;
	}



	public void setCategoryId(CategoryQuestion categoryId) {
		this.categoryId = categoryId;
	}



	public int getDuration() {
		return duration;
	}



	public void setDuration(int duration) {
		this.duration = duration;
	}



	public int getCreatorId() {
		return creatorId;
	}



	public void setCreatorId(int creatorId) {
		this.creatorId = creatorId;
	}



	public LocalDate getCreateDate() {
		return createDate;
	}



	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	
	
}

