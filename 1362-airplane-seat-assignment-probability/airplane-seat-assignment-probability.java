class Solution {
    public double nthPersonGetsNthSeat(int n) {

        if(n==1) return 1;

        double break_cycle=1.0/n;

        double continue_cycle= ((n-2.0)/n) ;

        return break_cycle + continue_cycle * nthPersonGetsNthSeat(n-1) ;
        
    }
}