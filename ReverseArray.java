import java.util.List;

public class ReverseArray {
    public void doReverseArray(List<Integer> arr){
        String s = "";
        for(int i= arr.size()-1; i>=0; i--)
            s += arr.get(i) + " ";
        System.out.println(s);
    }
}
