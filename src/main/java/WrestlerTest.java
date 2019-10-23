/**
 * @author Ehtiram Etibarovich Abdullayev on 24.10.2019
 * @project oo-principles
 */
public class WrestlerTest {
    public static void main(String[] args) {
        Thread wrestler1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; ++i) {
                    Wrestler.increment();
                    try {
                        sleep(1);
                    } catch (InterruptedException e) {
                    }
                }
            }
        };

        Thread wrestler2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; ++i) {
                    Wrestler.decrement();
                    try {
                        sleep(1);
                    } catch (InterruptedException e) {
                    }
                }
            }
        };

        wrestler1.start();
        wrestler2.start();
    }
}
