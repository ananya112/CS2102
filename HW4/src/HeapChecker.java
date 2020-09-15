public class HeapChecker {

   public HeapChecker() {}
    boolean addEltTester (IHeap hOrig,int elt, IBinTree hAdded){

        if (hAdded.hasElt(elt) && hAdded.isHeap() && hAdded.heepAdded(hOrig, hAdded) && hAdded.compare(hAdded, hOrig, elt)) {
            return true;
        }
        return false;
    }

    boolean remMinEltTester (IHeap hOrig, IBinTree hRemoved){

        if (hRemoved.isHeap() && hRemoved.compare(hRemoved, hOrig, hRemoved.root()) && hRemoved.heepRemoved(hOrig, hRemoved)){
            return true;
        }

        return false;
    }

}





