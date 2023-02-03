package com.revature.repos;

import com.revature.models.Flashcard;
import org.springframework.stereotype.Repository;

import java.sql.Connection;

@Repository
public class FlashcardRepoImpl implements FlashcardRepo{

    Connection conn;
    // constructor (make the connection to db




    @Override
    public Flashcard createFlashcard(Flashcard flashcard) {
        // persistence logic goes here

        return flashcard;
    }
}
