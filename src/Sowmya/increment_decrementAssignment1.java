package Sowmya;


public class increment_decrementAssignment1 {
    public static void main(String[] args) {
        int m = 0, n = 0;
        //m=-1 | n=-2  | p
        int p = --m * --n * n-- * m--;
                 // -1 *  -1 * -1  * -1
                 //-4
        System.out.println(p);
    }
}
