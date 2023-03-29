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

    @Test(groups = "first")
    @Parameters("name")
    void testOne(String name) {
        System.out.println(name);

    }

    @Test
    void testTwo() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(true, "assert true");
        softAssert.assertTrue(false, "assert false");
        softAssert.assertEquals("abc", "abc", "string correct");
        softAssert.assertEquals("abc", "ab", "string failed");
        softAssert.assertAll();
    }

    @Test(groups = "first")
    void testThree() {
        System.out.println("test three");
    }

    @Test(groups = "first")
    void testFour() {
        System.out.println("test Four");
    }


    @Test(priority = 7, description = "Test Five Hello")
    void testFive() {
        System.out.println("test Five");

    }

    @Test(groups = "second")
    void testSix() {
        System.out.println("test Six");
    }

    @Test(groups = "second")
    void testSeven() {
        System.out.println("test Seven");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("after method");
    }

   /* @DataProvider(name = "test1")
    public static Object[][] primeNumbers() {
        return new Object[][] {{2, true}, {6, false}, {19, true}, {22, false}, {23, true}};
    }
    @DataProvider(name = "test1")
    public static Object[][] primeNumbers() {
        return new Object[][] { { new Bean("hi I am the bean", 111) } };
    }

    @Test(dataProvider = "test1")
    public void testMethod(Bean myBean) {
        System.out.println(myBean.getVal() + " " + myBean.getI());
    }
}   */

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
