class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> h = new HashSet<>();
        while(n!=1){
            int sum = 0;
            while(n!=0){
                int r = n%10;
                n= n/10;
                sum = sum + (r*r);
            }
            if(h.contains(sum)){
                return false;
            }
        h.add(sum);
        n = sum;
        }
        return true;
    }
}