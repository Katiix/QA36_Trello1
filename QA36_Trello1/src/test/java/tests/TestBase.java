package tests;

import manager.ApplicationManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    static ApplicationManager app = new ApplicationManager();

    @BeforeSuite(alwaysRun = true)
    public void  setUp(){
        app.init();
    }

    @AfterSuite(alwaysRun = true)
    public void stop(){
        app.quit();
    }

}