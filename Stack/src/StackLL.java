import java.util.LinkedList;
import java.util.NoSuchElementException;

public class StackLL<T> {

    // t is  a generic

    private LinkedList<T> stack; //user doesn't know we use linked list --> abstraction -> hiding info from user

    public StackLL(){
        this.stack = new LinkedList<T>();
    }

    public void push (T itemToAdd){
        this.stack.addFirst(itemToAdd);
    }

    public boolean isEmpty(){  //abstraction
        return this.stack.isEmpty();
    }

    public void pop() throws NoSuchElementException {
        if(this.isEmpty()){
            throw new NoSuchElementException("Cannot pop an empty stack!");
        }
       else this.stack.removeFirst();
    }

    public void peek() throws NoSuchElementException{
        if(this.isEmpty()){
            throw new NoSuchElementException("Cannot pop an empty stack!");
        }
        else this.stack.getFirst();

    }


}
