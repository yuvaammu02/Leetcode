// Last updated: 27/08/2026, 10:17:22
class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int t =0;
        int c =0;
        for(int req : requests){
            t += Math.abs(req-c);
            c = req;
        }
        return t;
    }
}