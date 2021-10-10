import java.util.List;

public class OneNumber {
    public static String checkNumber (List<Integer> numArray,int num){
        numArray.size();
     for(int i=0; i<numArray.size(); i++)
         if (num == numArray.get(i))
                 return "YES";
     return "NO";
    }
}
