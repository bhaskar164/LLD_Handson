package Service;

import Model.Person;
import Model.Question;

import java.util.List;
import java.util.Scanner;

public class QuizManager {
    private Person person;
    private List<Question> questions;
    private int score;

    public QuizManager( Person person) {
        this.questions = GenerateQuestion.loadQuestions();
        this.person = person;
        this.score = 0;
    }
    public Person getPerson() {
        return person;
    }

    public void takeQuiz(){
            Scanner scanner = new Scanner(System.in);
            this.questions.forEach(question -> {
                System.out.println(question.getQuestionDescription());
                System.out.println("1. " + question.getOptions().get(0));
                System.out.println("2. " + question.getOptions().get(1));
                System.out.println("3. " + question.getOptions().get(2));
                System.out.println("4. " + question.getOptions().get(3));
                int option  = scanner.nextInt();
                if(option == question.getCorrectOption()) this.score++;
            });
            System.out.println("Your score is "+ this.score);
    }
    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
