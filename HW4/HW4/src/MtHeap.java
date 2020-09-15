
class MtHeap extends MtBT implements IHeap {
    MtHeap(){}

    @Override
    // If you add an element to a MtHeap, you create a new DataHeap
    public IHeap addElt(int e) {
        return new DataHeap(e, new MtHeap(), new MtHeap());
    }

    @Override
    // The min element of an empty heap returns an empty heap.
    public IHeap remMinElt() {
        return new MtHeap();
    }

    @Override
    // An empty heap should always lose a competition for which root is smaller (for the merge function)
    public boolean isBigger(int e) {
        return true;
    }

    @Override
    // An empty heap merged with another heap is the other heap (identity).
    public IHeap merge(IHeap withHeap) {
        return withHeap;
    }

    @Override
    public int root() {
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
        return true;
    }

    @Override
    public boolean compare(IBinTree otherTree, IBinTree origTree, int addedInt) {
        return true;
    }
}
