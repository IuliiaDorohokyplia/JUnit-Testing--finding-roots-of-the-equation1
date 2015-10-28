import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class testFindXPossitiv {
    startApplication findXTest=new startApplication();

    float linearEquationA = 0;
    float linearEquationB = 5;
    float linearEquationC = 6;
    int linearEquationSize=1;
    double[] linearEquationResult = new double[]{-1.2};
    private static final double DELTA=0.001;
    @Test
    public void testLinerEquation() {
        assertEquals(linearEquationSize,findXTest.findMainX(linearEquationA,linearEquationB,linearEquationC).length);
        assertArrayEquals(linearEquationResult, findXTest.findMainX(linearEquationA,linearEquationB,linearEquationC),DELTA);
    }

    float DiscriminantEqualsZeroA = 1;
    float DiscriminantEqualsZeroB = 2;
    float DiscriminantEqualsZeronC = 1;
    int DiscriminantEqualsZeroSize=2;
    double[] DiscriminantEqualsZeroResult = new double[]{-1,-1};
    @Test
    public void testDiscriminantEqualsZero() {
        assertEquals(DiscriminantEqualsZeroSize,findXTest.findMainX(DiscriminantEqualsZeroA,DiscriminantEqualsZeroB,DiscriminantEqualsZeronC).length);
        assertArrayEquals(DiscriminantEqualsZeroResult, findXTest.findMainX(DiscriminantEqualsZeroA,DiscriminantEqualsZeroB,DiscriminantEqualsZeronC),DELTA);
    }

    float NoResultsA = 10;
    float NoResultsB = 2;
    float NoResultsC = 3;
    int NoResultsoSize=0;
    double[] NoResultsResult = new double[]{};
    @Test
    public void testNoResults() {
        assertEquals(NoResultsoSize,findXTest.findMainX(NoResultsA,NoResultsB,NoResultsC).length);
        assertArrayEquals(NoResultsResult, findXTest.findMainX(NoResultsA,NoResultsB,NoResultsC),DELTA);
    }

    float DiscriminantPositivA = 2;
    float DiscriminantPositivB = 7;
    float DiscriminantPositivC = 1;
    int DiscriminantPositivSize=2;
    double[] DiscriminantPositivResult = new double[]{-3.35,-0.149};

    @Test
    public void testDiscriminantPositiv() {
        assertEquals(DiscriminantPositivSize,findXTest.findMainX(DiscriminantPositivA,DiscriminantPositivB,DiscriminantPositivC).length);
        assertArrayEquals(DiscriminantPositivResult, findXTest.findMainX(DiscriminantPositivA,DiscriminantPositivB,DiscriminantPositivC),DELTA);
    }

    float InfiniteSetA = 0;
    float InfiniteSetB = 0;
    float InfiniteSetC = 0;
    int InfiniteSetSize=3;
    double[] InfiniteSetResult = new double[3];
    @Test
    public void testInfiniteSet() {
        assertEquals(InfiniteSetSize,findXTest.findMainX(InfiniteSetA,InfiniteSetB,InfiniteSetC).length);
        assertArrayEquals(InfiniteSetResult, findXTest.findMainX(InfiniteSetA,InfiniteSetB,InfiniteSetC),DELTA);
    }

}
