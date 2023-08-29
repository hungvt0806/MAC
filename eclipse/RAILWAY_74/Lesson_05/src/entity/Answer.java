package entity;

public class Answer {
	public int 			id;
	public String 		content;
	public Question 	questionId;
	public Boolean 		isCorrect;
	public Answer(int id, String content, Question questionId, Boolean isCorrect) {
		super();
		this.id = id;
		this.content = content;
		this.questionId = questionId;
		this.isCorrect = isCorrect;
	}
	
	

}
