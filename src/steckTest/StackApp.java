package steckTest;

public class StackApp {
    public static void main(String[] args) {
        StackTest theStack = new StackTest(10);
        theStack.push(10);
        theStack.push(30);
        theStack.push(50);
                System.out.println("Последний элемент стека " + theStack.peek());
        theStack.pop();
        System.out.println("Последний элемент стека " + theStack.peek());



    }
}
