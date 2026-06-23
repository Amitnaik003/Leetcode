// [10, 20, 30, -30, 40, -100, 30, 60, 60]
// Max Subarray is: 150
import java.util.*;
class maxsubarray {
    public static void main(String[] args) {
        int a[] = {10,20,30,-30,40,-100,30,60,60};
        int psum = 0;
        int submax = a[0];
        System.out.println(Arrays.toString(a));
        for(int i:a){
            psum = Math.max(psum+i, i);
            submax = Math.max(submax, psum);
        }
        System.out.println("Max Subarray is: "+submax);
        
    }
}