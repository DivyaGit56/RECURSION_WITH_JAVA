package String_Recursion.level3;
import java.util.*;
public class subsequencesForDuplicate {
    public static void printSubseq(String ip){
        HashSet<String>set = new HashSet<>();
        generate(ip," ",0,set);
        for(String s1:set){
            System.out.println(s1);
        }
    }

    public static void generate(String ip, String op, int i, HashSet<String>set){
        // base case
        if(i == ip.length()){
            set.add(op);
            return;
        }

        // include
        generate(ip,op+ip.charAt(i),i+1,set);
        // exclude
        generate(ip,op,i+1,set);
    }
    public static void main(String[] args) {
        printSubseq("aab");
    }
}
