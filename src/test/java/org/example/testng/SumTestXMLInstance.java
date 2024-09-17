package org.example.testng;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SumTestXMLInstance {

    private int x;
    private int y;
    private int sum;

    @Parameters({"x", "y", "sum"})
    public SumTestXMLInstance(int x, int y, int sum) {
        this.x = x;
        this.y = y;
        this.sum = sum;
    }

    @Test
    public void testSum() {
        Assert.assertEquals(x + y, sum);
    }

}
