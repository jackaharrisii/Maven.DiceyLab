import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BinsTest {

    @Test
    public void BinsTest(){
        Bins bins = new Bins(2, 12);
        int min = bins.getMin();
        int max = bins.getMax();
        Assert.assertEquals(2, min);
        Assert.assertEquals(12,max);
    }
    @Test
    public void UsingBinsTest(){
        Bins bins = new Bins(2, 12);
        bins.incrementBin(7);
        int actual = bins.getBin(7);
        Assert.assertEquals(1, actual);
    }
}