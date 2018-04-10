package regex.atomicgroup; // https://youtu.be/d_SabGQ0sD0

public class AtomicGr {

    public static void main(String[] args) {
        System.out.println("abcc".matches("a(bc|b)c"));
        System.out.println("abcc".matches("a(?>bc|b)c") + " atomic");
        System.out.println("abc".matches("a(bc|b)c"));
        System.out.println("abc".matches("a(?>bc|b)c") + " atomic");

        System.out.println("integers".matches("\\b(integer|insert|in)\\b"));
        System.out.println("integers".matches("\\b(?>integer|insert|in)\\b")); // https://youtu.be/d_SabGQ0sD0?t=231
    }
}
