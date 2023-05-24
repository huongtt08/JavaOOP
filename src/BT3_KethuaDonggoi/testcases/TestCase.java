package BT3_KethuaDonggoi.testcases;

import BT3_KethuaDonggoi.commons.BaseTest;

public class TestCase extends BaseTest {
    public TestCase(String browser, boolean report, boolean headless) {
        super(browser, report, headless);

    }

    public static void main(String[] args) {
        TestCase base = new TestCase("Chrome", true, true);
        base.createDriver();

        //Login
        System.out.println("Step 1: User go to URL: https://cms.anhtester.com/login");
        System.out.println("Step 2: Enter Email");
        System.out.println("Step 3: Enter Password");
        System.out.println("Step 4: Click Login button");

        //Add Category
        System.out.println("Step 5: Click Products menu");
        System.out.println("Step 6: Click Category sub-menu");
        System.out.println("Step 7: Click Add new category button");
        System.out.println("Step 8: Enter valid fields");
        System.out.println("Step 9: Click Save button");

        base.closeDriver();
    }
}
