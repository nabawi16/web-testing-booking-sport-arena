package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import web.pageobjects.BookingObjects;
import web.pageobjects.LoginObjects;
import web.pageobjects.RegisterObjects;

public class NavigateTo {
    public static Performable theURL(String urlType)throws Exception{
        Class url;

        switch (urlType){
            case "Login":
                url = LoginObjects.class;
                break;
            case "Register":
                url = RegisterObjects.class;
                break;
            case "Homepage":
                url = BookingObjects.class;
                break;
            default:
                throw new Exception("There is no url type" + urlType);
        }

        return Task.where("{0} access the page url", Open.browserOn().the(url));
    }
}
