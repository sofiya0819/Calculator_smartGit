import org.junit.*;

public class CalculatorSumTest {
    Calculator cal;

    @Before
    public  void SetUp(){
        System.out.println("Test" + getClass().getName() + "is executed");
        cal = new Calculator();
    }

    @Test
    public void SumNegativeNumbers(){
        System.out.println("Sum 2 Negative Numbers ");
        double a = -10;
        double b = -10;
        double res = -20;
        //depricated with 2 params
        Assert.assertEquals(res, cal.sum(a,b),0.1);
    }

    @Test
    public void SumPositiveNumbers(){
        System.out.println("Sum Positive Numbers ");
        double a = 10;
        double b = 10;
        double res = 20;
        //depricated with 2 params
        Assert.assertEquals(res, cal.sum(a,b),0.1);
    }

    @Test
    public void SumNegativeAndPositiveNumber(){
        System.out.println("Sum Negative And Positive Number ");
        double a = -10;
        double b = 10;
        double res = 0;
        //depricated with 2 params
        Assert.assertEquals(res, cal.sum(a,b),0.1);
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("Tests finished");
    }


}
