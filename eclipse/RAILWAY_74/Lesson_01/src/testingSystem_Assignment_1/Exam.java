package testingSystem_Assignment_1;
import java.time.LocalDate;

public class Exam {
		int 				id;
		String 				code;
		String 				title;
		CategoryQuestion 	categoryId;
		int 				duration;
		int 				creatorId;
		LocalDate 			createDate;
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
