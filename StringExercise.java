import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringExercise {
    public void evenOdd (){
        System.out.println("For String exercise, enter the number of strings followed by the strings themselves!");
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String word = in.nextLine();
        for(int i = 0; i<t; i++) {
            word = in.nextLine();
            String evenWord = "";
            String oddWord = "";

            for(int j=0; j<word.length(); j++){
                if(j%2==0)
                    evenWord = evenWord + word.charAt(j);
                else if (j%2 == 1)
                    oddWord = oddWord + word.charAt(j);
            }
            System.out.println(evenWord + " " + oddWord);
            evenWord = "";
            oddWord = "";
        }
    }
}
