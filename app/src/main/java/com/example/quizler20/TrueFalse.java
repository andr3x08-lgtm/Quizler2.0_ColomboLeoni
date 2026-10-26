package com.example.quizler20;

public class TrueFalse {

    private int mQuestionID; //ID della domanda
    private boolean mAnswer; //risposta

    public TrueFalse(int mQuestionID, boolean mAnswer){

        this.mQuestionID = mQuestionID;
        this.mAnswer = mAnswer;
    }

    public boolean isMAnswer() {
        return mAnswer;
    }

    public void setMAnswer(boolean mAnswer) {
        this.mAnswer = mAnswer;
    }

    public int getMQuestionID() {
        return mQuestionID;
    }

    public void setMQuestionID(int mQuestionID) {
        this.mQuestionID = mQuestionID;
    }
}
