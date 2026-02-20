import java.util.*;

public class ALSubsequences {

    public static ArrayList<String> getSubseq(String ip, int i) {

        // Base Case
        if (i == ip.length()) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");   // empty subsequence
            return base;
        }

        // Recursive call
        ArrayList<String> smallAns = getSubseq(ip, i + 1);

        ArrayList<String> finalAns = new ArrayList<>();

        for (String str : smallAns) {
            // Exclude current character
            finalAns.add(str);

            // Include current character
            finalAns.add(ip.charAt(i) + str);
        }

        return finalAns;
    }

    public static void main(String[] args) {
        ArrayList<String> result = getSubseq("ABC", 0);
        System.out.println(result);
    }
}
