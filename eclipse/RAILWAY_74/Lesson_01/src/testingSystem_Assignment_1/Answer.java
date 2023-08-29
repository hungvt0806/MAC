package testingSystem_Assignment_1;

public class Answer {
	int 		id;
	String 		content;
	Question 	questionId;
	Boolean 	isCorrect;
	public Answer(int id, String content, Question questionId, Boolean isCorrect) {
		super();
		this.id = id;
		this.content = content;
		this.questionId = questionId;
		this.isCorrect = isCorrect;
	}

	
}
