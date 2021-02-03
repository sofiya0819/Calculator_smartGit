import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorSubTest {
    Calculator cal;
    @Before
    public void SetUp(){
        System.out.println("Test" + getClass().getName() + "is executed");
        cal = new Calculator();
    }

    @Test
    public void SubtractFromNegativeNumberAPositiveNumber(){
        System.out.println("Subtract From Negative Number A Positive Number");
        double a = -10;
        double b = 10;
        double res = -20;
        //depricated with 2 params
        Assert.assertEquals(res, cal.subtract(a,b),0.1);
    }

    @Test
    public void SubtractNegativeNumbers(){
        System.out.println("Subtract 2 Negative Numbers");
        double a = -10;
        double b = -10;
        double res = 0;
        //depricated with 2 params
        Assert.assertEquals(res, cal.subtract(a,b),0.1);
    }

    @Test
    public void SubtractPositiveNumbers(){
        System.out.println("Subtract 2 Positive Numbers ");
        double a = 40;
        double b = 10;
        double res = 30;
        //depricated with 2 params
        Assert.assertEquals(res, cal.subtract(a,b),0.1);
    }

    @Test
    public void SubtractFromPositiveNumberANegativeNumber(){
        System.out.println("Subtract From Positive Number A Negative Number");
        double a = 10;
        double b = -5;
        double res = 15;
        //depricated with 2 params
        Assert.assertEquals(res, cal.subtract(a,b),0.1);
    }


    @Test
    public void SubtractFromZeroANegativeNumber(){
        System.out.println("Subtract From Zero A Negative Number");
        double a = 0;
        double b = -5;
        double res = 5;
        //depricated with 2 params
        Assert.assertEquals(res, cal.subtract(a,b),0.1);
    }

    @Test
    public void SubtractFromZeroAPositiveNumber(){
        System.out.println("Subtract From Zero A Positive Number");
        double a = 0;
        double b = 5;
        double res = -5;
        //depricated with 2 params
        Assert.assertEquals(res, cal.subtract(a,b),0.1);
    }

    @After
    public void tearDown(){
        System.out.println("Test finished");
    }

}
