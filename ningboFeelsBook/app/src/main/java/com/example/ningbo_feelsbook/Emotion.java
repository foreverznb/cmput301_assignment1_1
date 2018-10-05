package com.example.ningbo_feelsbook;


import java.util.Date;

public class Emotion {

    private Date date;
    private String message;
    private String emotion;
    private static final Integer MAX_CHARS = 140;

    //Empty argument constructor with default values


    public String getMessage() {
        return this.message;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public void setMessage(String message) {
        if (message.length() <= this.MAX_CHARS ) {
            this.message = message;
        } else {

        }
    }

    public Date getDate() { return this.date; }

    public String getEmotion(){
        return this.emotion;
    }

    public void setEmotion(String emotion){
        this.emotion = emotion;
    }

    //No method body implemented! We leave that up to the subclasses (they MUST implement it)
    //public Boolean isImportant();

    @Override
    public String toString() {
        return    this.emotion + "     " + this.message+ "    "  + this.date.toString();
    }
}
