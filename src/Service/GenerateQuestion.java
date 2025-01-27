package Service;

import Model.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateQuestion {
    public static List<Question> questionList = new ArrayList<>(3);
    public static List<Question> loadQuestions() {
        Question question1 = new Question("Who is President of India?", "Sunny Deol, Droupadi Murmu, Monalisa, Narendra Modi", 2);
        Question question2 = new Question("Where does AutoExpo 2025 held in India?", "Mumbai, Ahemdabad, New Delhi, Kolkata", 3);
        Question question3 = new Question("Who is President of India?", "Sunny Deol, Droupadi Murmu, Monalisa, Narendra Modi",2);
        questionList.add(question1);
        questionList.add(question2);
        questionList.add(question3);
        return questionList;
    }
    public static void addQuestions(){
        Scanner scanner = new Scanner(System.in);
        String userResponse = "yes";
        while (!userResponse.toLowerCase().equals("no")) {
            System.out.println("Please enter the Question Description");
            String questionDesc = scanner.nextLine();
            System.out.println("Please enter four options, please enter options comma(,) separated");
            String options = scanner.nextLine();
            System.out.println("Please enter the correct option out of four options [1,2,3,4]");
            int correctOption = scanner.nextInt();
            Question question = new Question(questionDesc, options, correctOption);
            questionList.add(question);
            System.out.println("Do you want to add more questions? yes/no");
            userResponse = scanner.next();
        }
    }
}
