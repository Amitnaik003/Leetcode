class Solution {
    public boolean isHappy(int n) {
        HashSet<Long> h = new HashSet<>();
        long sum = 0;
        while(n != 1)
        {
            sum = 0;
            while(n != 0){
                int r = n % 10;
                n = n/10;
                sum = sum + (r*r);
            }
            if(h.contains(sum)){
                return false;
            }
            h.add(sum);
            n=(int)sum;
            }
        return true;
    }
}