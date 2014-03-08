/**
 * Created with IntelliJ IDEA.
 * User: java
 * Date: 14.8.3
 * Time: 12:15
 * To change this template use File | Settings | File Templates.
 */
public class ax2bxc {
    public static void main(String[] arg) {
        int a = 1;
        int b = (-2);
        int c = (-3);
        int d = Math.abs(b^2) - 4*a*c;
        System.out.println(Math.abs((b^2)));
        if (d>0) {
            double x1 = ((-b) + Math.sqrt(d)) / 2*a;
            double x2 = ((-b) - Math.sqrt(d)) / 2*a;
            System.out.println(x1 + " " + x2);
        } else
        if (d==0) {
            double x = (-b) / 2*a;
            System.out.println(x);

        } else System.out.println("d<0");
    }
}
