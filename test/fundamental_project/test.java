/*package fundamental_project;

import java.util.Arrays;

import fr.epita.quiz.datamodel.MCQQuestion;

public class test {

	private static final String TOPIC_DELIMITER = "||";
	private static final String COLUMN_DELEMITER = "@@";

	public static void main(String[] args) {
		MCQQuestion mcqQuestion = new MCQQuestion();
		mcqQuestion.setDifficulty(3);
		mcqQuestion.setQuestion("What can you do with jdk");
		mcqQuestion.setTopic(new String[] {"java","compilation","environments"});
		mcqQuestion.setId(1l);
		
		
		//formating to csv
		//id;difficulty;question_content;topics1|topic2|topic3
		String formatted = String.valueOf(mcqQuestion.getId()+ COLUMN_DELEMITER);
		formatted += String.valueOf(mcqQuestion.getDifficulty()+ COLUMN_DELEMITER);
		formatted += String.valueOf(mcqQuestion.getQuestion()+ COLUMN_DELEMITER);
		formatted += String.valueOf(mcqQuestion.getDifficulty()+ COLUMN_DELEMITER);
		String[] topics= mcqQuestion.getTopic();
		for (int i =0; i < topics.length; i++)
		{
			formatted += topics[i]+ TOPIC_DELIMITER;
		}
		
		
		//reconstruction phase
		String[] parts = formatted.split(COLUMN_DELEMITER);
		System.out.println(Arrays.asList(parts));
		Long id = Long.valueOf(parts[0]);
		Integer difficulty= Integer.valueOf(parts[1]);
		String question= parts[2];
		String[] readTopics=parts[3].split(TOPIC_DELIMITER);
		
		
		MCQQuestion reconstructed;
	}

}
*/
