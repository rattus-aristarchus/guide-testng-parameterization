package org.example.testng;

import io.qameta.allure.testng.TestInstanceParameter;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SumTestInstance {

    @TestInstanceParameter("x")
    private int x;

    @TestInstanceParameter("y")
    private int y;

    @TestInstanceParameter("sum")
    private int sum;

    @DataProvider
    public static Object[][] termsAndSums() {
        return new Object[][] {{1, 2, 3}, {-1, 1, 0}, {0, 0, 0}};
    }

    @Factory(dataProvider = "termsAndSums")
    public SumTestInstance(int x, int y, int sum) {
        this.x = x;
        this.y = y;
        this.sum = sum;
    }

    @Test
    public void testSum() {
        System.out.println("x = " + x + ", y = " + y + "; sum = " + sum);
        Assert.assertEquals(x + y, sum);
    }

}
