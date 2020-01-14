package fundamental_project;

import java.util.List;

import fr.epita.quiz.datamodel.MCQQuestion;
import fr.epita.quiz.datamodel.MCQQuestionsCSVDAO;

public class testMCQQuestionCSVDAO {

	public static void main(String[] args) {
		MCQQuestion mcqQuestion = new MCQQuestion();
		MCQQuestionsCSVDAO dao = new MCQQuestionsCSVDAO();

		
		mcqQuestion.setDifficulty(3);
		mcqQuestion.setQuestion("What can you do with jdk");
		mcqQuestion.setTopic(new String[] {"java","compilation","environments"});
		mcqQuestion.setId(1l);
		
		dao.Create(mcqQuestion);
		List<MCQQuestion> allQuestions = dao.readAll();

	}

}
