package Model;

import java.util.Arrays;
import java.util.List;

public class Question {
    private String questionDescription;
    private List<String> options ;
    private int correctOption;
    private String questionId;
    public String getQuestionDescription() {
        return questionDescription;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestiId(String questiId) {
        this.questionId = questiId;
    }

    public int getCorrectOption() {
        return correctOption;
    }

    public void setCorrectOption(int correctOption) {
        this.correctOption = correctOption;
    }

    public void setQuestionDescription(String questionDescription) {
        this.questionDescription = questionDescription;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public Question(String questionDescription, String options, int correctOption) {
        this.questionDescription = questionDescription;
        this.options = Arrays.stream(options.split(",")).toList();
        this.correctOption = correctOption;
    }
}
