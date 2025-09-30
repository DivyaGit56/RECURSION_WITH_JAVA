package SORTING;
import java.util.*;
public class SortARRAy_With_Recursion {
    public static void sortArray(List<Integer>arr){
        if(arr.size()==1){
            return;
        }
        int last = arr.remove(arr.size()-1);

        sortArray(arr);

        insert(arr,last);

    }

    private static void insert(List<Integer>arr,int temp){
        if(arr.size()==0||arr.get(arr.size()-1)<=temp){
            arr.add(temp);
            return;
        }
        int val = arr.remove(arr.size()-1);
        insert(arr,temp);
        arr.add(val);
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(3, 1, 4, 2, 5));
        sortArray(arr);
        System.out.println(arr); 
    }
}

    

