package entity;

public class Answer {
	public int 			id;
	public String 		content;
	public Question 	questionId;
	public Boolean 		isCorrect;
	
	
	public Answer() {
		super();
	}


	public Answer(int id, String content, Question questionId, Boolean isCorrect) {
		super();
		this.id = id;
		this.content = content;
		this.questionId = questionId;
		this.isCorrect = isCorrect;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public Question getQuestionId() {
		return questionId;
	}


	public void setQuestionId(Question questionId) {
		this.questionId = questionId;
	}


	public Boolean getIsCorrect() {
		return isCorrect;
	}


	public void setIsCorrect(Boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	
	

}
