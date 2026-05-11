public class DesignHashMap_706 {


    // Size of bucket array
    private final int SIZE = 1000;

    // Node class for linked list
    class Node {
        int key, value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    // Bucket array
    private Node[] buckets;

    // Constructor
    public DesignHashMap_706() {
        buckets = new Node[SIZE];
    }
    public static void main(String[] args) {

        DesignHashMap_706 map = new DesignHashMap_706();

        map.put(1, 10);
        map.put(2, 20);

        System.out.println(map.get(1)); // 10
        System.out.println(map.get(3)); // -1

        map.put(2, 30);
        System.out.println(map.get(2)); // 30

        map.remove(2);
        System.out.println(map.get(2)); // -1
    }

    // Hash function
    private int hash(int key) {
        return key % SIZE;
    }

    // Insert or update
    public void put(int key, int value) {
        int index = hash(key);

        // If bucket empty
        if (buckets[index] == null) {
            buckets[index] = new Node(key, value);
            return;
        }

        Node temp = buckets[index];

        // Check if key already exists
        while (temp != null) {
            if (temp.key == key) {
                temp.value = value; // update value
                return;
            }

            if (temp.next == null)
                break;

            temp = temp.next;
        }

        // Add new node at end
        temp.next = new Node(key, value);
    }

    // Get value
    public int get(int key) {
        int index = hash(key);

        Node temp = buckets[index];

        while (temp != null) {
            if (temp.key == key) {
                return temp.value;
            }
            temp = temp.next;
        }

        return -1;
    }

    // Remove key
    public void remove(int key) {
        int index = hash(key);

        Node temp = buckets[index];
        Node prev = null;

        while (temp != null) {

            if (temp.key == key) {

                // If first node
                if (prev == null) {
                    buckets[index] = temp.next;
                } else {
                    prev.next = temp.next;
                }

                return;
            }

            prev = temp;
            temp = temp.next;
        }
    }

}

