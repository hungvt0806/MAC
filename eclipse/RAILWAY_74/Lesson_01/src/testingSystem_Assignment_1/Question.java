package testingSystem_Assignment_1;
import java.time.LocalDate;

public class Question {
		int 				questionId;
		String 				content;
		CategoryQuestion 	categoryId;
		TypeQuestion 		type;
		int 				creatorId;
		LocalDate 				createDate;
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
