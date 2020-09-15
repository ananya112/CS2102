import java.util.ArrayList;
import java.util.NoSuchElementException;

public class StackAL {

    // t is  a generic

    private LinkedList<T> stack; //user doesn't know we use linked list --> abstraction -> hiding info from user

    public StackAL(){
        this.stack = new LinkedList<T>();
    }

    public void push (T itemToAdd){
        this.stack.add(itemToAdd);
    }

    public boolean isEmpty(){  //abstraction
        return this.stack.isEmpty();
    }

    public void pop() throws NoSuchElementException {
        if(this.isEmpty()){
            throw new NoSuchElementException("Cannot pop an empty stack!");
        }
        else this.stack.remove(this.stack.size()-1);
    }

    public void peek() throws NoSuchElementException{
        if(this.isEmpty()){
            throw new NoSuchElementException("Cannot pop an empty stack!");
        }
        else this.stack.getFirst();


// encapsulation --> make fields private
        //getter
        // in other method you would just retuen this.balance
        //set variable equal to the this.method
        public double getValue(){
        return this.balance;
    }
