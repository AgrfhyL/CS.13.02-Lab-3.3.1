import java.util.LinkedList;

public class CISQueue {

    // Linked list property.
    private LinkedList<Object> list;

    // Size property.
    private int size = 0;

    // Constructor.
    public CISQueue() {
        list = new LinkedList<Object>();
    }

    // Enqueue. This method adds a node to the end of the linked list.
    public void enqueue(Object data) {
        list.add(data);
        size++;
    }
    // Dequeue. This method removes a node from the beginning of the linked list.
    public Object dequeue() {
        if (!isEmpty()) {
            size--;
            return list.removeFirst(); //FIFO
        }
        return null;
    }
    // isEmpty. Returns a boolean indicating whether the linked list is empty.
    public boolean isEmpty() {
        return size == 0;
    }
    // size. Returns the size of the queue.
    public int size() {
        return size;
    }
    // toString. Returns a description of the queue in, for example, the following format:
    public String toString() {
        Object[] arr = list.toArray();
        String elements = "CISQueue{queue=[";
        for (int i = 0; i < size; i++) {
            elements += arr[i].toString();
            if (i != size-1)
                elements += ", ";
        }
        return elements + "], size=" + size + "}";
    }
    // CISQueue{queue=[7, 11], size=2}

}
