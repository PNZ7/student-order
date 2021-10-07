package edu.javacourse.studentorder.validator;

import edu.javacourse.studentorder.domain.wedding.AnswerWedding;
import edu.javacourse.studentorder.domain.StudentOrder;

public class WeddingValidator {
    String hostName;
    String login;
    String password;

    public AnswerWedding checkWedding(StudentOrder so){
        System.out.println("Wedding check is running: "
                + hostName + "," + login + "," + password);
        AnswerWedding ansWedding = new AnswerWedding();
        return ansWedding;

    }
}
