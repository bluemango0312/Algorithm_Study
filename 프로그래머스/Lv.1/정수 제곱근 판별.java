class Solution {
    public double solution(long n) {
        int num = (int)Math.sqrt(n);
        if(Math.pow(num, 2) == n){
            return Math.pow(Math.sqrt(n)+1, 2);
        } else{
            return -1;
        }
        
    }
}