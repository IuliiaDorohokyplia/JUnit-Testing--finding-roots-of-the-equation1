import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class testFinfXNegativ {
    startApplication testFinfXNegativ=new startApplication();

    float linearEquationA = 0;
    float linearEquationB = 5;
    float linearEquationC = 6;
    private static final double DELTA=0.001;
    @Test
    public void testLinerEquationSizeNegativ() {
        assertFalse( testFinfXNegativ.findMainX(linearEquationA,linearEquationB,linearEquationC).length == 0);
        assertFalse( testFinfXNegativ.findMainX(linearEquationA,linearEquationB,linearEquationC).length == 2);
        assertFalse( testFinfXNegativ.findMainX(linearEquationA,linearEquationB,linearEquationC).length == 3);
           }


    float DiscriminantEqualsZeroA = 1;
    float DiscriminantEqualsZeroB = 2;
    float DiscriminantEqualsZeroC = 1;
    @Test
    public void testDiscriminantEqualsZeroNegativ() {
        assertFalse( testFinfXNegativ.findMainX(DiscriminantEqualsZeroA,DiscriminantEqualsZeroB,DiscriminantEqualsZeroC).length == 0);
        assertFalse( testFinfXNegativ.findMainX(DiscriminantEqualsZeroA,DiscriminantEqualsZeroB,DiscriminantEqualsZeroC).length == 1);
        assertFalse( testFinfXNegativ.findMainX(DiscriminantEqualsZeroA,DiscriminantEqualsZeroB,DiscriminantEqualsZeroC).length == 3);

    }


    float NoResultsA = 10;
    float NoResultsB = 2;
    float NoResultsC = 3;
    @Test
    public void testNoResultsNegativ() {
        assertFalse(testFinfXNegativ.findMainX(NoResultsA,NoResultsB,NoResultsC).length == 1);
        assertFalse(testFinfXNegativ.findMainX(NoResultsA,NoResultsB,NoResultsC).length == 2);
        assertFalse(testFinfXNegativ.findMainX(NoResultsA,NoResultsB,NoResultsC).length == 3);
    }


    float DiscriminantPositivA = 2;
    float DiscriminantPositivB = 7;
    float DiscriminantPositivC = 1;
    @Test
    public void testDiscriminantPositivNegarivTest() {
        assertFalse(testFinfXNegativ.findMainX(DiscriminantPositivA, DiscriminantPositivB, DiscriminantPositivC).length == 0);
        assertFalse(testFinfXNegativ.findMainX(DiscriminantPositivA, DiscriminantPositivB, DiscriminantPositivC).length == 1);
        assertFalse(testFinfXNegativ.findMainX(DiscriminantPositivA, DiscriminantPositivB, DiscriminantPositivC).length == 3);
       }


    float InfiniteSetA = 0;
    float InfiniteSetB = 0;
    float InfiniteSetC = 0;
    @Test
    public void testInfiniteSetNegativ() {
        assertFalse(testFinfXNegativ.findMainX(InfiniteSetA, InfiniteSetB, InfiniteSetC).length == 0);
        assertFalse(testFinfXNegativ.findMainX(InfiniteSetA, InfiniteSetB, InfiniteSetC).length == 1);
        assertFalse(testFinfXNegativ.findMainX(InfiniteSetA, InfiniteSetB, InfiniteSetC).length == 2);

    }
}
