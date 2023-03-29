import org.example.Main;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class FirstTest {
    @BeforeSuite
    void beforeSuite (){
        System.out.println("Before suite");
    }

    @BeforeClass
    void beforeClass(){
        System.out.println("before class First test");
    }

    @BeforeTest
    void beforeTest(){
        System.out.println("before Test");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("before method");
    }

    @Test(expectedExceptions = NoSuchMethodException.class)
        void testOne() throws NoSuchMethodException {
        System.out.println("test One stated");
        Main.getException(1);
    }

    @Test(enabled = false)
    void testTwo() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(true, "assert true");
        softAssert.assertFalse(false, "assert false");
        softAssert.assertEquals("abc", "abc", "string correct");
        softAssert.assertAll();
    }

    @Test
    @Parameters("name")
    void testThree(String name) {
        System.out.println("test 3 stated");
        System.out.println(name);
    }

    @Test(enabled = false)
    void testFour() {
        System.out.println("test Four");
    }

    @Test(enabled = false)
    void testFive() {
        System.out.println("test Five");
    }

    @Test(enabled = false)
    void testSix() {
        System.out.println("test Six");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("after method");
    }

    @DataProvider(name = "test1")
    public static Object[][] primeNumbers() {
        return new Object[][] {
                {2, true, "Hello"},
                {6, false, "Hi"},
                {19, true, "Bye"},
                {22, false, "Morning"},
                {23, true, "Good night"}
        };
    }
    @Test(dataProvider = "test1")
    public void testMethod(int iV, boolean bV, String sV) {
        System.out.println(iV + " " + bV + " " + sV);
    }

    @AfterTest
    void afterTest () {
        System.out.println("After test");
    }

    @AfterClass
    void afterClass () {
        System.out.println("after class First test");
    }

    @AfterSuite
    void afterSuite() {
        System.out.println("After suite");

    }

}
