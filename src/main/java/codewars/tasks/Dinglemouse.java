package codewars.tasks;

public class Dinglemouse {
    public static final Dinglemouse INST;

    private static int ONE_HUNDRED;

    private final int value;

    static {
        ONE_HUNDRED = 100;
        INST = new Dinglemouse();
    }

    private Dinglemouse() {
        this.value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return this.value + n;
    }

    public static void main(String[] args) {
        // Test the plus100 method
        int result = Dinglemouse.INST.plus100(50);
        System.out.println(result);  // Should print 150
    }
}