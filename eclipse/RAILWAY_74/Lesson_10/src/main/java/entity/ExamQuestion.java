package entity;

public class ExamQuestion {
	public int 			id;
	public Question 	questionId;
	
	
	
	public ExamQuestion() {
		super();
	}



	public ExamQuestion(int id, Question questionId) {
		super();
		this.id = id;
		this.questionId = questionId;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Question getQuestionId() {
		return questionId;
	}



	public void setQuestionId(Question questionId) {
		this.questionId = questionId;
	}
	
	
	
}
