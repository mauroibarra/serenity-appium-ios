package co.com.demo.stepdefinitions;

import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hooks {

    public static IOSDriver driver;
    public static Actor user;


    @Before
    public void setup() {

        OnStage.setTheStage(new OnlineCast());
    }
}
