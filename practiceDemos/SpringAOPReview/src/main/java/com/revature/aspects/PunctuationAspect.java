package com.revature.aspects;

import com.revature.models.Flashcard;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PunctuationAspect {

    /*
    AOP - Aspect Oriented Programming
    Breaking down program logic into "cross cutting concerns" - functionalities used throughout the application
    ex> logging, security, notifications, spell/punctuation check

    As Aspect is a class that contains different advice (structured as methods)

    @Before - intercepts before the point in time (pointcut) you have declared
    @After - intercepts after the point in time (pointcut) you have declared
    @Around - the most powerful because it refers to the @Before and @After advice.

    Pointcut - a point in time in which we want to listen

    Joint point - the location that is "intercepted" by the advice code
    is represented by method execution
     */


    @Before(value="execution(* com.revature.*.*.*(..)) && args(card)")
    public void punctuate(Flashcard card) throws Throwable {
        card.setQuestion(checkQuestion(card.getQuestion()));
        card.setAnswer(checkAnswer(card.getAnswer()));

        System.out.println("Punctuation Aspect: " + card.getQuestion());
        System.out.println(card.getAnswer());
    }


    private String checkQuestion(String question){
        return question.charAt(question.length()-1) != '?' ? question + "?" : question;
    }

    private String checkAnswer(String answer){
        return answer.charAt(answer.length()-1) != '.' ? answer + "." : answer;
    }

}
