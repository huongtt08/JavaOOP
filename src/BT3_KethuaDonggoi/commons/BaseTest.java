package BT3_KethuaDonggoi.commons;

public class BaseTest extends Constants {
    public BaseTest(String browser, boolean report, boolean headless) {
        super(browser, report, headless);
    }

    public static void createDriver() {
        System.out.println(browser + "-" + report + "-" + headless);

    }

    public static void closeDriver() {
        System.out.println("Closed browser: " + browser);

    }

    public static void main(String[] args) {
        BaseTest test = new BaseTest("Chrome", true, true);
        test.createDriver();
        test.closeDriver();
    }
}


