// 0 1
import java.util.*;
class twosumopt{
    public static void main(String[] args) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int a[] = {2,7,11,15};
        int target = 9;
        int i = 0;
        for(int x:a){
            if(h.containsKey(target-x)){
                a[0] = h.get(target-x);
                a[1] = i;
            }
            else{
                h.put(x,i);
            }
            i++;
        }
        System.out.println(a[0]+" "+a[1]);
    }
}