class Solution {
    public int clumsy(int n) {
        Stack<Integer> stk = new Stack<>();
        stk.push(n);
        n--;
        int index = 0;
        while(n > 0){
            if(index % 4 == 0){
                stk.push(stk.pop()*n);
            }
            else if(index % 4 == 1){
                stk.push(stk.pop()/n);
            }
            else if(index % 4 == 2){
                stk.push(n);
            }
            else
            stk.push(-n);
            n--;
            index++;
        }
        int ans = 0;
        while(!stk.isEmpty()){
            ans += stk.pop();
        }
        return ans;
    }
}