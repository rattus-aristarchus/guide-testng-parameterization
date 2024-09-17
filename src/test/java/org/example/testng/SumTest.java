package org.example.testng;

import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumTest {

    @Test
    public void testSum() {
        Assert.assertEquals(1 + 2, 3);
    }

    @Test
    public void testSumLoop() {
        final int[][] data = new int[][]{
                {1, 2, 3},
                {-1, 1, 0},
                {0, 0, 0}
        };
        for (int[] datum : data) {
            Assert.assertEquals(datum[0] + datum[1], datum[2]);
        }
    }

    @DataProvider(name = "dataProvider")
    public static Object[][] termsAndSums() {
        return new Object[][] {{1, 2, 3}, {-1, 1, 0}, {0, 0, 0}};
    }

    @Test(dataProvider = "dataProvider")
    public void testSumParameterized(int x, int y, int sum) {
        Assert.assertEquals(x + y, sum);
    }

    @Test
    public void testSumAllure() {
        Allure.parameter("x", "0");
        Allure.parameter("y", "0");
        Allure.parameter("sum", "0");

        Assert.assertEquals(0 + 0, 0);
    }
}
