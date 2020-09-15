import org.junit.Test;
import static org.junit.Assert.*;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertFalse;

public class Examples {

    public Examples(){}

    HeapChecker HT = new HeapChecker();
    MtHeap emptyHeap = new MtHeap();
    IBinTree myBinTree = new IBinTree() {
        @Override
        public boolean hasElt(int e) {
            return false;
        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public int height() {
            return 0;
        }

        @Override
        public int root() {
            return 0;
        }

        @Override
        public int isElement(int elt) {
            return 0;
        }

        @Override
        public boolean checkCountRem(IBinTree otherTree, IBinTree origTree, int addedInt, int element) {
            return false;
        }

        @Override
        public boolean compare(IBinTree otherTree, IBinTree origTree, int addedInt, int element) {
            return false;
        }

        @Override
        public int checkCount(int elt) {
            return 0;
        }

        @Override
        public boolean isHeap() {
            return false;
        }

        @Override
        public boolean compare(IBinTree otherTree, IBinTree origTree, int addedInt) {
            return false;
        }

        @Override
        public boolean heepAdded(IHeap hOrig, IBinTree hAdded) {
            return false;
        }

        @Override
        public boolean isNewHeapAdded(IHeap hOrig, IBinTree hAdded) {
            return false;
        }

        @Override
        public boolean heepRemoved(IHeap hOrig, IBinTree hRemoved) {
            return false;
        }

        @Override
        public Object addElt(int i) {
            return null;
        }
    };
    IHeap myHeap = new DataHeap(5);
    IHeap myHeap2 = new DataHeap(5);

    MtHeap a = new MtHeap();
    DataHeap HLR = new DataHeap(5,a,a);
    DataHeap HLL = new DataHeap(4,a,a);
    DataHeap HR = new DataHeap(4,a,a);
    DataHeap HL = new DataHeap(2,HLL,HLR);
    IHeap myHeap3 = new DataHeap(1,HL,HR);
    IHeap myHeap4 = new DataHeap(1,HL,HR);
    IHeap myHeap5 = new DataHeap(1,HR,HR);


    @Test
    public void addTestOne(){

        MtHeap a = new MtHeap();
        DataHeap HLR = new DataHeap(5,a,a);
        DataHeap HLL = new DataHeap(4,a,a);
        DataHeap HR = new DataHeap(3,a,a);
        DataHeap HL = new DataHeap(2,HLL,HLR);
        DataHeap myHeap = new DataHeap(1,HL,HR);
        assertEquals(myHeap.checkCount(4), 1);
    }

    @Test
    public void addTest2(){

        MtHeap a = new MtHeap();
        DataHeap HLR = new DataHeap(5,a,a);
        DataHeap HLL = new DataHeap(4,a,a);
        DataHeap HR = new DataHeap(4,a,a);
        DataHeap HL = new DataHeap(2,HLL,HLR);
        DataHeap myHeap = new DataHeap(1,HL,HR);
        assertEquals(myHeap.checkCount(4), 2);
    }

    @Test
    public void test1(){
        assertTrue(HT.addEltTester(myHeap,5,myHeap2.addElt(5)));
    }

    @Test
    public void test2(){
        assertTrue(HT.addEltTester(myHeap,5,myHeap2.addElt(6)));
    }

    @Test
    public void test3(){
        assertFalse(HT.addEltTester(myHeap,0,myHeap2.addElt(6)));
    }

    @Test
    public void test4(){
        assertFalse(HT.addEltTester(myHeap,-1,myHeap2.addElt(6)));
    }

    @Test
    public void test5(){
        assertFalse(HT.addEltTester(myHeap,-1,myHeap3));
    }

    @Test
    public void test6(){
        assertFalse(HT.addEltTester(myHeap2,-1,myHeap3));
    }

    @Test
    public void test7(){
        assertTrue(HT.remMinEltTester(myHeap,myHeap.remMinElt()));
    }

    @Test
    public void test8(){
        assertFalse(HT.remMinEltTester(myHeap,myHeap3.remMinElt()));
    }

   @Test
    public void test9(){
        assertTrue(HT.remMinEltTester(myHeap4,myHeap3.remMinElt()));
    }

    @Test
    public void test10(){
        assertFalse(HT.remMinEltTester(myHeap2,myHeap3.remMinElt()));
    }

    @Test
    public void test11(){
        assertFalse(HT.remMinEltTester(myHeap4,myHeap5.remMinElt()));
    }

    @Test
    public void test12(){
        assertTrue(HT.remMinEltTester(myHeap5,myHeap5.remMinElt()));
    }






}