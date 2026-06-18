// 2 
import java.util.HashMap;
class findduplicatehash{
     public int findDuplicate(int[] nums) {
         HashMap<Integer,Integer> h = new HashMap<>();
        for(Integer i:nums){
            if(h.containsKey(i)) return i;
            else h.put(i,0);
        }
        return 0;
    }
    public static void main(String[] args){
        findduplicatehash obj = new findduplicatehash();
        int []a = {1,3,4,2,2};
        System.out.println(obj.findDuplicate(a));
    }
}