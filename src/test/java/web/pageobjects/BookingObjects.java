package web.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://booking-sport-arena.vercel.app")
public class BookingObjects extends PageObject {
    public static Target OK_BUTTON = Target.the("ok button")
            .locatedBy("//*[text()='OK']");
    public static Target NAVIGATE_HOME = Target.the("navigate home")
            .locatedBy("#navigate-home");
    public static Target INPUT_SEARCH = Target.the("input search")
            .locatedBy("#input-search");
    public static Target SEARCH_BUTTON = Target.the("search button")
            .locatedBy("#search-button");
    public static Target SELECT_VENUE = Target.the("select venue")
            .locatedBy("#venue-19");
    public static Target SELECT_DAY = Target.the("select day")
            .locatedBy("#day-5");
    public static Target SELECT_TIME = Target.the("select time")
            .locatedBy("//*[text()='15.00']");
    public static Target BOOKING_BUTTON = Target.the("booking button")
            .locatedBy("#booking-button");
    public static Target SELECT_PAYMENT = Target.the("select payment")
            .locatedBy("//*[text()='ATM/Bank Transfer']");
    public static Target SELECT_BANK = Target.the("select bank")
            .locatedBy("//*[text()='BNI']");
    public static Target REKENING_BUTTON = Target.the("rekening button")
            .locatedBy("//*[text()='Lihat Nomor Rekening']");
    public static Target CREATE_PAYMENT_BUTTON = Target.the("rekening button")
            .locatedBy("//*[text()='Mohon Selesaikan Pembayaran']");
    public static Target PENDING_STATUS = Target.the("pending status")
            .locatedBy("//*[text()='pending']");
    public static Target VALIDATE_BOOKING = Target.the("validate booking")
            .locatedBy("//*[text()='Rp. 200,000']");


}
