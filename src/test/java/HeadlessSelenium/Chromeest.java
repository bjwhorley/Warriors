package HeadlessSelenium;

import junit.framework.TestCase;

public class Chromeest extends FirstHeadlessTest {


    public static void setUp() throws Exception{

        System.out.println("Starting Test ");
    }

    public static void testOne() throws Exception{

        FirstHeadlessTest();
        chromeBrowser();
        System.out.println("Testing Underway");
    }
}