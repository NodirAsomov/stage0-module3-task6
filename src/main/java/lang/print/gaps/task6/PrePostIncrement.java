package lang.print.gaps.task6;

public class PrePostIncrement {
    public static void main(String[] args) {
        int a = 5;
        a++;
        int b = 7;
        //b++;
        int c = 12;
        //c++;
        int d = 15;
        //d++;


        // use post-increment operator in the mathematical expression  
        int x =   a   + b +   c   + d;
        System.out.println("Expected x is 40, x = " + x);
        // print the updated value of a, b, c, and d  
        System.out.println("The updated value of a = " + a + ", b = " + b + ", c = " + c + " and d = " + d);

    }
}
