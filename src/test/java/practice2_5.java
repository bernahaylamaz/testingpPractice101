import org.junit.*;

public class practice2_5 {
    @Before
    public void setUp(){
        System.out.println("This is before method");
    }
    @Test
    public void test1(){

        System.out.println("TEST 1");
    }
    @Test
    public void test2 (){

        System.out.println("Test 2");
    }
    @Ignore
    @Test
    public void test3 (){

        System.out.println("Test 3");
    }
    @Test
    public void test4 (){

        System.out.println("Test 4");
    }
    @After
    public void tearDown(){
        System.out.println("This is tear down");
    }
    @Test
    public void  assertions(){
        Assert.assertEquals("data1","data1");
        Assert.assertTrue("Selenium".contains("e"));
        Assert.assertFalse("Selenium".contains("a"));
        Assert.assertEquals("Oh Nooo assertion failed!","Java","JavaScript");//massege displayed only if the asserion fails.

    }

}
