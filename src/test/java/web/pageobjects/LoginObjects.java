package web.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://booking-sport-arena.vercel.app/login")
public class LoginObjects extends PageObject {
    public static Target EMAIL_FIELD = Target.the("email field")
            .locatedBy("#input-email");
    public static Target PASSWORD_FIELD = Target.the("password field")
            .locatedBy("#input-password");
    public static Target LOGIN_BUTTON = Target.the("login button")
            .locatedBy("#login-button");
    public static Target LOGIN_Successfull = Target.the("login successfull")
            .locatedBy("//*[text()='Successfully logged in']");
    public static Target USER_NOT_FOUND = Target.the("user not found")
            .locatedBy("//*[text()='user not found']");
    public static Target PASSWORD_INCORRECT = Target.the("password incorrect")
            .locatedBy("//*[text()='password incorrect']");
}
