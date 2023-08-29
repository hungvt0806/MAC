package entity;
import java.time.LocalDate;

public class Question {
	public int 					questionId;
	public String 				content;
	public CategoryQuestion 	categoryId;
	public TypeQuestion 		type;
	public int 					creatorId;
	public LocalDate 			createDate;
		@Override
		public String toString() {
			return "Question [questionId=" + questionId + "]";
		}
		public Question(int questionId, String content, CategoryQuestion categoryId, TypeQuestion type, int creatorId,
				LocalDate createDate) {
			super();
			this.questionId = questionId;
			this.content = content;
			this.categoryId = categoryId;
			this.type = type;
			this.creatorId = creatorId;
			this.createDate = createDate;
		}
		
		
}
