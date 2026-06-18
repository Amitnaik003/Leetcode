// true
import java.util.HashSet;

public class finddupbool {
     public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for(Integer i:nums){
            if (h.contains(i)) return true;
            else h.add(i);
        }
        return false;
    }
    public static void main(String[] args){
        finddupbool obj = new finddupbool();
        int []a = {1,3,4,2,2};
        System.out.println(obj.containsDuplicate(a));
    }
}
