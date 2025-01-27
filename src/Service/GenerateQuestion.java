package Service;

import Model.Question;

import java.util.ArrayList;
import java.util.List;

public class GenerateQuestion {

    public static List<Question> loadQuestions() {
        List<Question> questionList = new ArrayList<>(3);
        Question question1 = new Question("Who is President of India?", "Sunny Deol, Droupadi Murmu, Monalisa, Narendra Modi", 2);
        Question question2 = new Question("Where does AutoExpo 2025 held in India?", "Mumbai, Ahemdabad, New Delhi, Kolkata", 3);
        Question question3 = new Question("Who is President of India?", "Sunny Deol, Droupadi Murmu, Monalisa, Narendra Modi",2);
        questionList.add(question1);
        questionList.add(question2);
        questionList.add(question3);
        return questionList;
    }
}
