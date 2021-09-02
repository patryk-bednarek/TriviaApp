package com.example.triviaapp.data;

import com.example.triviaapp.model.Question;

import java.util.ArrayList;

public interface AnswerListAsynchResponse {
    void processFinished(ArrayList<Question> questionArrayList);
}
