package com.example.ningbo_feelsbook;

public class EmotionTooLongException extends Exception {

    EmotionTooLongException() {
        super("The message is too long! Please keep your tweets within 140 characters.");
    }
}
