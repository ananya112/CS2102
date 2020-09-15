
class MtBT implements IBinTree {

    MtBT(){}

    // returns false since empty tree has no elements
    public boolean hasElt(int e) {
        return false;
    }

    // returns 0 since empty tree has no elements
    public int size() {
        return 0;
    }

    // returns 0 since empty tree has no branches
    public int height() {
        return 0;
    }

    /**
     * empty BT has no node, this is the end of the tree
     * @param () doesn't take in any parameters
     * @returns the max value
     */

    public int root(){
        return Integer.MAX_VALUE;
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
        return true;
    }

    @Override
    public boolean isNewHeapAdded(IHeap hOrig, IBinTree hAdded) {
        return false;
    }

    @Override
    public boolean heepRemoved(IHeap hOrig, IBinTree hRemoved) {
        return true;
    }

    @Override
    public Object addElt(int i) {
        return null;
    }
}
