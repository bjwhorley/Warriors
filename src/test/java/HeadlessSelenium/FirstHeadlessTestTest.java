package HeadlessSelenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FirstHeadlessTestTest extends FirstHeadlessTest {
    @BeforeMethod
    public void setUp() throws Exception {
    }

    @AfterMethod
    public void tearDown() throws Exception {



    }

    @Test
    public void test() throws Exception{

        firstHeadlessTest();
    }

}