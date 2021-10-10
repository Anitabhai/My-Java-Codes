
import java.util.*;
import java.io.*;

public class ControlLoops {
    public void doLoops() {
        System.out.println( "Enter the number of queries q in first line and then a, b and n accordingly");
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            String line = "";

            int num = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < j + 1; k++) {
                    num = num + (int) Math.pow(2, k) * b;
                }
                num = num + a;
                line = line + Integer.toString(num) + " ";
                num = 0;
            }
            System.out.println(line);
        }
    }
}
