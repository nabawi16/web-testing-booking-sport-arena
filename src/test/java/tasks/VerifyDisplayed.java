package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import web.pageobjects.BookingObjects;
import web.pageobjects.LoginObjects;
import web.pageobjects.RegisterObjects;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VerifyDisplayed {
    public static Performable element(String elementType) throws Exception{
        Target element;

        switch (elementType){
            case "Login Successfull":
                element = LoginObjects.LOGIN_Successfull;
                break;
            case "User Not Found":
                element = LoginObjects.USER_NOT_FOUND;
                break;
            case "Password Incorrect":
                element = LoginObjects.PASSWORD_INCORRECT;
                break;
            case "Register Successfull":
                element = RegisterObjects.REGISTER_SUCCESSFULL;
                break;
            case "Register Failed":
                element = RegisterObjects.REGISTER_FAILED;
                break;
            case "Validate Email":
                element = RegisterObjects.VALIDATE_EMAIL;
                break;
            case "Booking Status":
                element = BookingObjects.PENDING_STATUS;
                break;
            case "Validate Booking":
                element = BookingObjects.VALIDATE_BOOKING;
                break;
            default:
                throw new Exception("There is no element type: "+ elementType);
        }
        WaitUntil.the(element, isVisible()).forNoMoreThan(1000).seconds();
        return Task.where("{0} verify element is displayed", Ensure.that(element).isDisplayed());
    }
}
