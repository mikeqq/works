/**
 * Created with IntelliJ IDEA.
 * User: java
 * Date: 14.8.3
 * Time: 12:17
 * To change this template use File | Settings | File Templates.
 */
public class fibon {
    public static void main(String[] args ) {
        int i = 1;
        int j = 1;
        System.out.println(i);
        while (j<100) {
            System.out.println(j);
            j = i+j;
            i = j-i;
        }
    }
}
