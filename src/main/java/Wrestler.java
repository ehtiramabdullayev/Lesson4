/**
 * @author Ehtiram Etibarovich Abdullayev on 24.10.2019
 * @project oo-principles
 */
public class Wrestler {
    private static int count = 1;

    public static synchronized void increment() {
        ++count;
        System.out.println("Count is " + count + " @ " + System.nanoTime());
    }

    public static synchronized void decrement() {
        --count;
        System.out.println("Count is " + count + " @ " + System.nanoTime());
    }
}
