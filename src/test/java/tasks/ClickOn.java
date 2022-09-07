package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import web.pageobjects.BookingObjects;
import web.pageobjects.LoginObjects;
import web.pageobjects.RegisterObjects;

public class ClickOn {
    public static Performable button(String buttonType) throws Exception{
        Target button;

        switch (buttonType){
            case "Login":
                button = LoginObjects.LOGIN_BUTTON;
                break;
            case "Register":
                button = RegisterObjects.REGISTER_BUTTON;
                break;
            case "Homepage Menu":
                button = RegisterObjects.HOMEPAGE_MENU;
                break;
            case "Register Menu":
                button = RegisterObjects.Register_MENU;
                break;
            case "Ok":
                button = BookingObjects.OK_BUTTON;
                break;
            case "Navigate Homepage":
                button = BookingObjects.NAVIGATE_HOME;
                break;
            case "Search":
                button = BookingObjects.SEARCH_BUTTON;
                break;
            case "Select Venue":
                button = BookingObjects.SELECT_VENUE;
                break;
            case "Select Day":
                button = BookingObjects.SELECT_DAY;
                break;
            case "Select Time":
                button = BookingObjects.SELECT_TIME;
                break;
            case "Booking Now":
                button = BookingObjects.BOOKING_BUTTON;
                break;
            case "Select Payment":
                button = BookingObjects.SELECT_PAYMENT;
                break;
            case "Select Bank":
                button = BookingObjects.SELECT_BANK;
                break;
            case "See Number Rekening":
                button = BookingObjects.REKENING_BUTTON;
                break;
            case "Create Payment":
                button = BookingObjects.CREATE_PAYMENT_BUTTON;
                break;
            default:
                throw new Exception("There is no button type: " + buttonType);
        }

        return Task.where("{0} click " + buttonType + "button", Click.on(button));
    }
}
