package fr.epita.quiz.datamodel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MCQQuestionsCSVDAO {
	private static final String TOPIC_DELIMITER = "||";
	private static final String COLUMN_DELEMITER = "@@";
	private static final String FILE_NAME= "file.csv";
	
	public void Create(MCQQuestion mcqQuestion) throws IOException
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
		WriteToFile(formatted);
	}
	
	public List<MCQQuestion> readAll() throws IOException
	{
		List<MCQQuestion> results = new ArrayList<MCQQuestion>();
		//TODO READ ALL THE 'LINE' VALUES FROM THE FILE
		
		String line=readFromFile(FILE_NAME);
		
		String[] parts = line.split(COLUMN_DELEMITER);
		System.out.println(Arrays.asList(parts));
		Long id = Long.valueOf(parts[0]);
		Integer difficulty= Integer.valueOf(parts[1]);
		String question= parts[2];
		String[] readTopics=parts[3].split(TOPIC_DELIMITER);
		return results;
	}
	
	private void WriteToFile(String Formatted) throws IOException
	{
		FileWriter csvWriter = new FileWriter(FILE_NAME);
		csvWriter.append(Formatted);
		
		csvWriter.flush();
		csvWriter.close();
	}
	
	
	private String readFromFile(String CSV_FILE) throws IOException
	{
		BufferedReader csvReader = new BufferedReader(new FileReader(CSV_FILE));
		String row;
		String Data="";
		while (( row = csvReader.readLine()) != null) 
		{
		    Data = Data+row;
		    // do something with the data	
		}
		csvReader.close();
		return Data;
	}
}
