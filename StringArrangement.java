import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StringArrangement {
    public static List<ArrayList<String>> searchSuggestions(List<String> repository, String customerQuery) {

        // First define the list of lists to be returned.
        ArrayList<ArrayList<String>> allKeyWords = new ArrayList<ArrayList<String>>();

        boolean wordFound = false;
        // The comparison with the repository starts after the user has entered two characters. Therefore, start
        // the comparison with i=1.
        for (int i = 1; i < customerQuery.length(); i++) {
            // Need to define the inner list with the right scope so that it can be used for all letters
            // of the keyword.
            ArrayList<String> matchedKeyWords = new ArrayList<>();

            // Retrieve each item from the repository list and then convert it lower case. Also, convert the
            // customer query to lower case. After that, compare the characters one by one between the string
            // in the repository and the customer query (from first two character to the length of customer query).
            for (int j = 0; j < repository.size(); j++) {
                String myStr = repository.get(j);
                myStr = myStr.toLowerCase();
                String repoStr = myStr.substring(1, i+1);
                String customerStr = customerQuery.substring(1, i+1);
                customerStr = customerStr.toLowerCase();

                if (customerStr.equals(repoStr)) {
                    matchedKeyWords.add(myStr);
                    wordFound = true;
                }
                if (wordFound){
                    if (j == (repository.size()-1)) {
                        Collections.sort(matchedKeyWords);
                        allKeyWords.add(matchedKeyWords);
                        wordFound = false;
                    }
                }
            }

        }
        return allKeyWords;
    }
}
