package co.com.demo.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.demo.userinterface.LoginPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login{

    public static Performable withDefaultUser() {
        return Task.where(
                WaitUntil.the(TXT_USERNAME,isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue("admin").into(TXT_USERNAME),
                Enter.theValue("admin").into(TXT_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }
}
