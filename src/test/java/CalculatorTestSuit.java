import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CalculatorDivTest.class,
        CalculatorMulTest.class,
        CalculatorSubTest.class,
        CalculatorSumTest.class
})

public class CalculatorTestSuit {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(CalculatorTestSuit.class);

        System.out.println("---------------------");
        for(Failure failure : result.getFailures()){
            System.out.println(failure.getDescription());
            System.out.println(failure.getMessage());
        }

        System.out.println("Number of run tests: "+result.getRunCount());
        System.out.println("Number of failed tests: "+result.getFailureCount());
        System.out.println("Test execution time: "+result.getRunTime());
        System.out.println(result.wasSuccessful());

    }
}
