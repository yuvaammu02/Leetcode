// Last updated: 12/08/2026, 11:49:56
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int s = timetoSeconds(startTime);
        int e = timetoSeconds(endTime);
        return e-s;
    }
    private int timetoSeconds(String time){
        String[] p = time.split(":");
        int h = Integer.parseInt(p[0]);
        int m = Integer.parseInt(p[1]);
        int se = Integer.parseInt(p[2]);
        return (h *3600)+(m*60)+se;
    }
}