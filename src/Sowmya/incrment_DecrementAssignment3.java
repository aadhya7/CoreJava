package Sowmya;

public class incrment_DecrementAssignment3 {
    public static void main(String[] args) {


           int x = 1, y = 10, z = 100;
           // x=1 | y=1 | z=100



        int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
               // 0 + 10  - 100  - 98 + 12  - -1  + 12  -  -2
              // 10 - 100 - 98 + 12 + 1 + 12 + 2
              // 10 - 100  - 98 + 27
              // 10 - 2 + 27
              // 10 - 29
              // - 19
       /* System.out.println(""x = "" + x);
        System.out.println(""y = "" + y);
        System.out.println(""z = "" + z);
        System.out.println(""i = "" + i); */
        System.out.println(i);

    }
}