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
		
		
		
		public Question() {
			super();
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



		public int getQuestionId() {
			return questionId;
		}



		public void setQuestionId(int questionId) {
			this.questionId = questionId;
		}



		public String getContent() {
			return content;
		}



		public void setContent(String content) {
			this.content = content;
		}



		public CategoryQuestion getCategoryId() {
			return categoryId;
		}



		public void setCategoryId(CategoryQuestion categoryId) {
			this.categoryId = categoryId;
		}



		public TypeQuestion getType() {
			return type;
		}



		public void setType(TypeQuestion type) {
			this.type = type;
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
