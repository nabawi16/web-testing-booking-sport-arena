package web.stepdefinitions;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import tasks.*;

import java.util.Random;

public class BookingStepDef {

    String firstName,lastName,fullName,userName,email,phone,password;

    //Pre-condition
    @Given("{actor} already on Home page")
    public void loadHomePage(Actor actor)throws Exception{
        actor.wasAbleTo(NavigateTo.theURL("Homepage"));
    }
    @And("{actor} registered new account")
    public void registerNewAccount(Actor actor)throws Exception{
        firstName = firstName();
        lastName = lastName();
        fullName = firstName + " " + lastName;
        userName = firstName + new Random().nextInt(100);
        email = firstName + lastName + new Random().nextInt(100) + "@mail.com";
        phone = phoneNumber();
        password = "12345";

        actor.attemptsTo(
                ClickOn.button("Homepage Menu"),
                ClickOn.button("Register Menu"),
                InputText.onField("Register Fullname", fullName),
                InputText.onField("Register Username", userName),
                InputText.onField("Register Email", email),
                InputText.onField("Register Phone", phone),
                InputText.onField("Register Password", password),
                InputText.onField("Register Confirm Password", password),
                ClickOn.button("Register"),
                ClickOn.button("Ok")
        );
    }
    @And("{actor} login account registered")
    public void loginAccount(Actor actor)throws Exception{
        actor.attemptsTo(
                InputText.onField("Email", email),
                InputText.onField("Password", password),
                ClickOn.button("Login"),
                ClickOn.button("Ok"),
                ClickOn.button("Navigate Homepage")
        );
    }

    //Steps
    @When("{actor} booked venue sport arena")
    public void bookedVenue(Actor actor)throws Exception{
        actor.attemptsTo(
                InputText.onField("Search", "central"),
                ClickOn.button("Search"),
                ClickOn.button("Select Venue"),
                ClickOn.button("Select Day"),
                ClickOn.button("Select Time"),
                ClickOn.button("Booking Now")
        );

    }
    @And("{actor} create payment")
    public void createPayment(Actor actor)throws Exception{
        actor.attemptsTo(
                SwitchToNewWindow.switchToNewTab(),
                ClickOn.button("Select Payment"),
                ClickOn.button("Select Bank"),
                ClickOn.button("See Number Rekening"),
                ClickOn.button("Create Payment")
        );
    }

    //Validate
    @Then("{actor} can see price to booked")
    public void validateBooked(Actor actor)throws Exception{
        actor.attemptsTo(
//                Ensure.thatTheCurrentPage().currentUrl().contains("/user/history#"),
//                VerifyDisplayed.element("Booking Status")
                VerifyDisplayed.element("Validate Booking")
        );
    }



    //Bot Random data
    public static String firstName(){
        String firstNames[] = {"john", "malik", "andrean", "rama", "abdillah", "muh", "afri", "jafar", "ahmad", "budi"};
        return firstNames[new Random().nextInt(firstNames.length)];
    }

    public static String lastName(){
        String lastNames[] = {"nugroho", "yoga", "teguh", "agung", "dwi", "nabawi", "harianto", "rizki", "lalu", "minoto"};
        return lastNames[new Random().nextInt(lastNames.length)];
    }

    public static String phoneNumber(){
        String phoneNumbers = "081";

        for (int i = 0; i < 8; i++){
            phoneNumbers = phoneNumbers + new Random().nextInt(10);
        }
        return phoneNumbers;
    }
}
