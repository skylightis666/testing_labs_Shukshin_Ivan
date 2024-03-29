package hw1;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static hw1.BeforeTest.calculator;

public class MultiplyTest {
    @DataProvider
    public Object[][] provideNewData() {
        return new Object[][]{
                {1, 2, 2},
                {3, -7, -21},
                {3.14, 2.4, 7.536}, // Wrong test, I dunno why
                {0, 3, 0}};
    }

    @Test(dataProvider = "provideNewData", groups = "MultiplyDivision")
    public void testMultiply(double a, double b, double result) {
        double sum = calculator.mult(a, b);
        Assert.assertEquals(result, sum);
    }
}