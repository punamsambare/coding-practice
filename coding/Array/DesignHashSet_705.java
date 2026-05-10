public class DesignHashSet_705 {

    private boolean[] set;

    // Constructor
    public DesignHashSet_705() {
        set = new boolean[1000001];
    }

    // Main function
    public static void main(String[] args) {

        DesignHashSet_705 hashSet = new DesignHashSet_705();

        hashSet.add(1);
        hashSet.add(2);

        System.out.println(hashSet.contains(1)); // true
        System.out.println(hashSet.contains(3)); // false

        hashSet.add(2);

        System.out.println(hashSet.contains(2)); // true

        hashSet.remove(2);

        System.out.println(hashSet.contains(2)); // false
    }

    // Add key
    public void add(int key) {
        set[key] = true;
    }

    // Remove key
    public void remove(int key) {
        set[key] = false;
    }

    // Check if key exists
    public boolean contains(int key) {
        return set[key];
    }
}