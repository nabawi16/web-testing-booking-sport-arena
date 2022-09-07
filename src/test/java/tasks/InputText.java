package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import web.pageobjects.BookingObjects;
import web.pageobjects.LoginObjects;
import web.pageobjects.RegisterObjects;

public class InputText {
    public static Performable onField(String fieldType, String value) throws Exception{
        Target field;

        switch (fieldType){
            case "Email":
                field = LoginObjects.EMAIL_FIELD;
                break;
            case "Password":
                field = LoginObjects.PASSWORD_FIELD;
                break;
            case "Register Fullname":
                field = RegisterObjects.FULLNAME_FIELD;
                break;
            case "Register Username":
                field = RegisterObjects.USERNAME_FIELD;
                break;
            case "Register Email":
                field = RegisterObjects.EMAIL_FIELD;
                break;
            case "Register Phone":
                field = RegisterObjects.PHONE_NUMBER_FIELD;
                break;
            case "Register Password":
                field = RegisterObjects.PASSWORD_FIELD;
                break;
            case "Register Confirm Password":
                field = RegisterObjects.CONFIRM_PASSWORD_FIELD;
                break;
            case "Search":
                field = BookingObjects.INPUT_SEARCH;
                break;
            default:
                throw new Exception("There is no field type: " + fieldType);
        }

        return Task.where("{0} input value: '"+ value + "'", Enter.theValue(value).into(field));
    }
}
