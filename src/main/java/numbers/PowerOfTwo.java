package numbers;

/**
 *
 *
 * Created by Pavitra on 4/23/2016.
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if ((i & (i - 1)) == 0) {
                System.out.println(i);
            }
        }
    }
}
