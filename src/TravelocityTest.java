public class TravelocityTest  extends BaseTravelocity {

    static String url="https://www.travelocity.com";
    static String browser="Chrome";
    static String flyingFrom="LAS";
    static String flyingTo="LAX";
    static String departingYear="2019";
    static String departingMonth="10";
    static String departingDate="19";



    public static void main (String[] args) throws InterruptedException {
        System.out.println("hola");
        initBrowser(url, browser);
        selectFligt(flyingFrom,flyingTo);
        selectDates(departingYear,departingMonth,departingDate);
        closeBrowser();

    }


}
