import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    SortArrays();

    }
    public static void SortArrays(){
        int[] a = new int[10];
        int[] b = new int[10];

        Random r = new Random();
        int lessCount = 0;
        int largerCount = 0;

        for (int i = 0; i < 10; ++i) {
            a[i] = r.nextInt(10);
            b[i] = r.nextInt(10);

            if(a[i] < b[i]) {
                ++lessCount;
            } else if(a[i] > b[i]) {
                ++largerCount;
            }
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        if(lessCount > largerCount) {
            System.out.println("a < b");
        } else if(largerCount > lessCount) {
            System.out.println("a > b");
        } else {
            System.out.println("a = b");
        }
        int[] newArrayNumbers = new int[4];
        System.arraycopy(a, 2, newArrayNumbers, 0, 4);
        System.out.println(Arrays.toString(newArrayNumbers));
    }

}