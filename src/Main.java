import Constants.ROLES;
import Model.Person;
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
        quizManager.takeQuiz();
    }
}