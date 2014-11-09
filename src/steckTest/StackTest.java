package steckTest;

/**
 * Created by Evgen on 09.11.2014.
 */
public class StackTest {
private int size;
    private int top;
    private long[] stackArray;
    public StackTest(int s) {
size = s;
        stackArray = new long[size];
        top=-1;
            }
public void push (int j){
    stackArray[++top]=j;
}
    public long pop(){
        return stackArray[--top];
    }
    public long peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top==-1);
    }
    public boolean isFull(){
        return (top==size-1);
    }

}

