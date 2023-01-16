package tests;

import model.Board;
import model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BoardCreation extends TestBase{

    @BeforeMethod
    public void  preConditions(){
        User user = new User().withEmail("katuha1995@gmail.com").withPassword("12345.com");
        app.getUser().initLogin();
        app.getUser().pause(2000);
        app.getUser().fillInLoginForm(user);
        app.getUser().submitLogin();
        app.getUser().pause(2000);

    }

    @Test

    public void boardCreation1(){
        Board board = new Board().withTitle("qa36");

        app.getBoard().initBoardCreation();
        app.getBoard().fillInBoardCreationForm(board);
        app.getBoard().scrollDownTheForm();
        app.getBoard().pause(2000);
        app.getBoard().submitBoardCreation();
        app.getBoard().pause(2000);
        app.getBoard().isCreated();

        Assert.assertTrue(app.getBoard().isCreated());

        app.getBoard().pause(2000);
        app.getBoard().returnToHomePage();


    }
}