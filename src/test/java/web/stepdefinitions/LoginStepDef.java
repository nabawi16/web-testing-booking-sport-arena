package web.stepdefinitions;

import io.cucumber.java.en.*;
import io.github.arniu.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import tasks.ClickOn;
import tasks.InputText;
import tasks.NavigateTo;
import tasks.VerifyDisplayed;

public class LoginStepDef {

    @Given("{actor} already in login page")
    public void loadLoginPage(Actor actor) throws Exception{
        actor.wasAbleTo(NavigateTo.theURL("Login"));
    }

    @When("{actor} already fill email & password")
    public void inputEmailPassword(Actor actor)throws Exception{
        Dotenv dotenv = Dotenv.load();
        String act = actor.getName();
        String email = "";
        String password = "";

        if (act.equals("user")){
            email = dotenv.get("EMAIL_USER");
            password = dotenv.get("PASSWORD_USER");
        }
        else {
            email = dotenv.get("EMAIL_ADMIN");
            password = dotenv.get("PASSWORD_ADMIN");
        }


        actor.attemptsTo(
                InputText.onField("Email", email),
                InputText.onField("Password", password)
        );
    }

    @When("{actor} already fill wrong email & password")
    public void inputWrongEmailPassword(Actor actor) throws Exception{
        Dotenv dotenv = Dotenv.load();

        String email = dotenv.get("WRONG_EMAIL");
        String password = dotenv.get("WRONG_PASSWORD");

        actor.attemptsTo(
                InputText.onField("Email", email),
                InputText.onField("Password", password)
        );
    }

    @When("{actor} already fill email")
    public void inputEmail(Actor actor) throws Exception{
        Dotenv dotenv = Dotenv.load();

        String email = dotenv.get("EMAIL_USER");

        actor.attemptsTo(
                InputText.onField("Email", email)
        );
    }

    @When("{actor} already fill password")
    public void inputPassword(Actor actor) throws Exception{
        Dotenv dotenv = Dotenv.load();

        String password = dotenv.get("PASSWORD_USER");

        actor.attemptsTo(
                InputText.onField("Password", password)
        );
    }

    @And("{actor} login button clicked")
    public void clickLoginButton(Actor actor)throws Exception{
        actor.attemptsTo(
                ClickOn.button("Login")
        );
    }

    @Then("{actor} can see pop up Successfully logged in")
    public void validateLoginSuccess(Actor actor)throws Exception{
        String act = actor.getName();
        String link;

        if (act.equals("user")){
            link = "/user";
        }
        else {
            link = "/admin";
        }

        actor.attemptsTo(
                Ensure.thatTheCurrentPage().currentUrl().contains(link),
                VerifyDisplayed.element("Login Successfull")
        );
    }


    @Then("{actor} can see pop up message will appear indicated user not found")
    public void validateUserNotFound(Actor actor)throws Exception{
        actor.attemptsTo(
                VerifyDisplayed.element("User Not Found")
        );
    }

    @Then("{actor} can see pop up message will appear indicated password incorrect")
    public void validatePasswordIncorrect(Actor actor)throws Exception{
        actor.attemptsTo(
                VerifyDisplayed.element("Password Incorrect")
        );
    }

}
