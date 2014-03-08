import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: java
 * Date: 14.8.3
 * Time: 12:19
 * To change this template use File | Settings | File Templates.
 */
public class SortArray {
    public static void main(String[] args) {
        int l = 10;
        int testa[] = new int[l];
        Random r = new Random();
        for (int i = 0; i < l; i++) {
            testa[i] = r.nextInt(100);
            System.out.println(testa[i]);
        }
        int temp = testa[l];



    }
}
