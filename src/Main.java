import Constants.ROLES;
import Model.Person;
import Service.GenerateQuestion;
import Service.QuizManager;

import java.util.Scanner;

import static Constants.ROLES.ADMIN;
import static Constants.ROLES.CONTESTANT;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Quiz Game");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.next();
        System.out.println("Please enter your role CONTESTANT or ADMIN");
        String role = scanner.next();
        System.out.println("Please enter your age");
        int age = scanner.nextInt();

        Person person = new Person(age, name, role.equalsIgnoreCase("admin")? ADMIN: CONTESTANT);
        QuizManager quizManager = new QuizManager(person);
        System.out.println(person);
        if (person.getUserRole().name().equalsIgnoreCase("ADMIN")){
            String userInput = "";
            while (!userInput.equals("exit")){
                System.out.println("Your options: \n 1. Add Questions \n 2. Take quiz ");
                int option = scanner.nextInt();
                switch (option){
                    case 1:
                        GenerateQuestion.addQuestions();
                        break;
                    case 2:
                        quizManager.takeQuiz();
                        break;
                }
                System.out.println("Enter 'exit' to exit the menu");
                userInput = scanner.next();
            }
        }else{
            quizManager.takeQuiz();
        }
    }
}