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

	
	
}

