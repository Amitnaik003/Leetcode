// [2]
import java.util.ArrayList;
import java.util.List;

public class findduparray {
    public List<Integer> findDuplicates(int[] nums) {
       ArrayList<Integer> seen = new ArrayList<>();
       ArrayList<Integer> dup = new ArrayList<>();
       for(int i : nums){
        if(seen.contains(i)) dup.add(i);
        else seen.add(i);
       }
       return dup;
    }
    public static void main(String[] args){
        findduparray obj = new findduparray();
        int []a = {1,3,4,2,2};
        System.out.println(obj.findDuplicates(a));
    }
}
