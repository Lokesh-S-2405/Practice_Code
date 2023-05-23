package Collections.Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CusstomQueue cusstomQueue = new CusstomQueue(5);
        cusstomQueue.insert(2);
        cusstomQueue.insert(3);
        /*cusstomQueue.remove();
        cusstomQueue.display();*/
        CircularQueue queue = new CircularQueue(6);
        queue.insert(2);
        queue.insert(3);
        queue.insert(21);
        queue.insert(32);
        queue.insert(12);
        queue.insert(13);
        queue.remove();
        queue.display();
    }
}
