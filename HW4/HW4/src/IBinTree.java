import java.lang.Math;

interface IBinTree {
    // determines whether element is in the tree
    boolean hasElt(int e);
    // returns number of nodes in the tree; counts duplicate elements as separate items
     int size();
     // returns depth of longest branch in the tree
     int height();

    public int root();

    int isElement(int elt);

    public boolean checkCountRem(IBinTree otherTree, IBinTree origTree, int addedInt, int element);

    public boolean compare (IBinTree otherTree, IBinTree origTree, int addedInt, int element);

    public int checkCount(int elt);

    boolean isHeap();

    boolean compare(IBinTree otherTree, IBinTree origTree, int addedInt);


    boolean heepAdded(IHeap hOrig, IBinTree hAdded);

    boolean isNewHeapAdded(IHeap hOrig, IBinTree hAdded);

    boolean heepRemoved(IHeap hOrig, IBinTree hRemoved);

    Object addElt(int i);
}
