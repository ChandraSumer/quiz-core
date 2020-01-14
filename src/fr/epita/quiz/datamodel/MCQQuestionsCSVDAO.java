package fr.epita.quiz.datamodel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MCQQuestionsCSVDAO {
	private static final String TOPIC_DELIMITER = "||";
	private static final String COLUMN_DELEMITER = "@@";
	
	public void Create(MCQQuestion mcqQuestion)
	{
		String formatted = String.valueOf(mcqQuestion.getId()+ COLUMN_DELEMITER);
		formatted += String.valueOf(mcqQuestion.getDifficulty()+ COLUMN_DELEMITER);
		formatted += String.valueOf(mcqQuestion.getQuestion()+ COLUMN_DELEMITER);
		formatted += String.valueOf(mcqQuestion.getDifficulty()+ COLUMN_DELEMITER);
		String[] topics= mcqQuestion.getTopic();
		for (int i =0; i < topics.length; i++)
		{
			formatted += topics[i]+ TOPIC_DELIMITER;
		}
		
		//TODO WRITE THE FORMATED STRING IN A FILE
	}
	
	public List<MCQQuestion> readAll()
	{
		List<MCQQuestion> results = new ArrayList<MCQQuestion>();
		//TODO READ ALL THE 'LINE' VALUES FROM THE FILE
		String[] parts = line.split(COLUMN_DELEMITER);
		System.out.println(Arrays.asList(parts));
		Long id = Long.valueOf(parts[0]);
		Integer difficulty= Integer.valueOf(parts[1]);
		String question= parts[2];
		String[] readTopics=parts[3].split(TOPIC_DELIMITER);
	}
}
