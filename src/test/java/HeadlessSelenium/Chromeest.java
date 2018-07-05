package HeadlessSelenium;


import org.testng.annotations.Test;

public class Chromeest extends FirstHeadlessTest {

@Test
    public static void setUp() throws Exception{

        System.out.println("Starting Test ");
    }
@Test
    public static void testOne() throws Exception{

        firstHeadlessTest();
        chromeBrowser();
        System.out.println("Testing Underway");
    }
}