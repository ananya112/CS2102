import java.util.LinkedList;

class DataBT implements IBinTree {
    int data;
    IBinTree left;
    IBinTree right;

    DataBT(int data, IBinTree left, IBinTree right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    // an alternate constructor for when both subtrees are empty
    DataBT(int data) {
        this.data = data;
        this.left = new MtBT();
        this.right = new MtBT();
    }

    public int height() {
        return 1 + Math.max(this.left.height(), this.right.height());
    }

    /**
     * determines whether this node or node in subtree has given element
     * @param e is an integer
     * @returns a boolean value true if the heep has that integer
     */

    public boolean hasElt(int e) {
        return this.data == e || this.left.hasElt(e) || this.right.hasElt(e) ;
    }

    /**
     * adds 1 to the number of nodes in the left and right subtrees
     * @param () doesn't take in any parameters
     * @returns the size of the left and right subtrees
     */

    public int size() {
        return 1 + this.left.size() + this.right.size();
    }

    /**
     * Gets the root value of the current heep
     * @param () doesn't take in any parameters
     * @returns the root value
     */

    public int root(){
        return this.data;
    }

    /**
     * checks to see whether it is a heep
     * @param () doesn't take in any parameters
     * @returns a boolean value true if it is a heep otherwise it returns false
     */

   public boolean isHeap(){
       if(this.data <= right.root() && this.data <= left.root()){
           return left.isHeap() && right.isHeap();
       }
       return false;
   }

    /**
     * checks to see if the heap is a new one with element added
     * @param origHeap is an IHeap
     * @param newTree is an IBinTree
     * @returns new heep size
     */

    public boolean heepAdded(IHeap origHeap, IBinTree newTree){
        int newSize = newTree.size();
        int oldSize = origHeap.size();
        return newSize == oldSize +1;
    }

    @Override
    public boolean isNewHeapAdded(IHeap hOrig, IBinTree hAdded) {
        return false;
    }

    /**
     * checks to see if the heap is a new one with element removed
     * @param origHeap is an IHeap
     * @param newTree is an IBinTree
     * @returns new heep size
     */

    public boolean heepRemoved(IHeap origHeap, IBinTree newTree){
        return newTree.size() == origHeap.size() - 1;
    }

    @Override
    public Object addElt(int i) {
        return null;
    }

    /**
     * checks to see if checks to see if element
     * @param elt is an integer
     * @returns 1 if the given integer is in the heep
     */

   public int isElement(int elt) {
       if (this.data == elt)
           return 1;
   return 0;
   }

    /**
     * count occurrence of each element
     * @param elt is an integer
     * @returns the number of duplicate elements
     */

   public int checkCount(int elt){
        int count = 0;
       return (count += this.isElement(elt) + this.left.checkCount(elt) + this.right.checkCount(elt));
   }

    /**
     * compare counts of element in both trees (minus what we add or subtract)
     * @param otherTree is an IBinTree
     * @param origTree is an IBinTree
     * @param addedInt is an integer
     * @param element is an integer
     * @returns true if the counts of both trees are the same
     */

   public boolean checkCountRem(IBinTree otherTree, IBinTree origTree, int addedInt, int element){

        int count = origTree.checkCount(element);
        int count2 = otherTree.checkCount(element);

        if(count-1 != count2)
         return true;

        if(addedInt == element){
            if(count -1 != count2){
                return false;
            }
        }

        else{
            if (count != count2){
                return false;
            }
        }
        return true;
   }

    @Override
    public boolean compare(IBinTree otherTree, IBinTree origTree, int addedInt, int element) {
        return false;
    }

    /**
     * compare all elements from the heeps
     * @param otherTree is an IBinTree
     * @param origTree is an IBinTree
     * @param addedInt is an integer
     * @returns true if the elements in the heeps are the same
     */

    public boolean compare (IBinTree otherTree, IBinTree origTree, int addedInt){

        boolean DataResult = this.checkCountRem(otherTree, origTree,addedInt,this.data);
        boolean leftResult = this.left.compare(otherTree, origTree,addedInt);
        boolean rightResult = this.right.compare(otherTree, origTree,addedInt);

    if(!DataResult || !leftResult || !rightResult)
        return false;
    return true;
}

}