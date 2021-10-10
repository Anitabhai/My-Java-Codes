import java.util.*;
import java.lang.*;

        public class Playlist {

        public void reverseOrder(ArrayList<String> myList){
            int j = myList.size()-1;
            for (int i = 0; i<myList.size()/2; i++){
                String temp = myList.get(i);
                myList.set(i, myList.get(j));
                myList.set(j,temp);
                j--;
            }
            System.out.println( "Reverse List \n"+ myList);
        }

    }
