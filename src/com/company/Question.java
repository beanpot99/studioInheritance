package com.company;

import java.util.Scanner;

 public abstract class  Question {



    private String question;
    private int pointValue;
    private String rightAnswer;

    public Question(String questions, int pointValues, String rightAnswers){
        questions = this.question;
        pointValues = this.pointValue;
        rightAnswers = this.rightAnswer;
    }

    public String getQuestion(){
        return question;
    }
    public String getRightAnswer() {
         return rightAnswer;
     }
     public void setRightAnswer(String rightAnswer) {
         this.rightAnswer = rightAnswer;
     }
    public void setQuestion(String question) {
        this.question = question;
    }
    public int getPointValue() {
         return pointValue;
     }
     public void setPointValue(int pointValue) {
         this.pointValue = pointValue;
     }


     public void askQuestion(){
        System.out.println(question);
    }



}
