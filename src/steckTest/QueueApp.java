package steckTest;

/**
 * Created by Evgen on 09.11.2014.
 */
public class QueueApp {
    public static void main(String[] args) {
        QueueTest theQueue = new QueueTest(10);
        theQueue.add(10);
        theQueue.add(30);
        theQueue.add(50);
        System.out.println("Первый элемент "+theQueue.extract());
        System.out.println("Второй элемент "+theQueue.extract());

    }

}
