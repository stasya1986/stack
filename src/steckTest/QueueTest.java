package steckTest;

/**
 *
 */
public class QueueTest {
    private int size;
    private int head;
    private int tail;
    public int[] queueArr;

   public QueueTest(int size) {
        queueArr = new int[this.size = size];
    }

    public void add(int value) {
        if (++tail == size)
            tail = 0;
        queueArr[tail] = value;
    }

    int extract() {
        if (++head == size)
            head = 0;
        return queueArr[head];
    }

}
