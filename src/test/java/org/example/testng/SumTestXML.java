package org.example.testng;

import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SumTestXML {

    @Test
    @Parameters({"x", "y", "sum"})
    public void testSumXML(int x, int y, int sum) {
        Allure.parameter("x", x);
        Allure.parameter("y", y);
        Allure.parameter("sum", sum);

        Assert.assertEquals(x + y, sum);
    }

}
