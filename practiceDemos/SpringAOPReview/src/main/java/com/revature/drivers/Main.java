package com.revature.drivers;

import com.revature.config.AppConfig;
import com.revature.models.Flashcard;
import com.revature.services.FlashcardService;
import com.revature.services.FlashcardServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    //1. set up our Application context so that we can define the IOC  container
    static ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

    public static void main(String[] args) {

        FlashcardService flashcardService = appContext.getBean(FlashcardServiceImpl.class);

        Flashcard card = new Flashcard("What is AOP","AOP stands for Aspect Oriented Programming");
        System.out.println(flashcardService.createFlashcard(card));

    }
}
