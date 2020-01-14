package fr.epita.quiz.datamodel;

public class MCQQuestion {
	private Long id;
	private String Question;
	private String[] Topic;
	private Integer Difficulty;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public String[] getTopic() {
		return Topic;
	}
	public void setTopic(String[] topic) {
		Topic = topic;
	}
	public Integer getDifficulty() {
		return Difficulty;
	}
	public void setDifficulty(Integer difficulty) {
		Difficulty = difficulty;
	}
	


}
