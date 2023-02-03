package com.revature.services;

import com.revature.models.Flashcard;
import com.revature.repos.FlashcardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlashcardServiceImpl implements FlashcardService{

    private FlashcardRepo flashcardRepo;

    @Autowired
    public FlashcardServiceImpl(FlashcardRepo flashcardRepo){
        this.flashcardRepo = flashcardRepo;
    }


    @Override
    public boolean createFlashcard(Flashcard flashcard) {
        return flashcard.getQuestion() != "";
    }
}
