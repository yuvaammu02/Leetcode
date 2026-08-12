// Last updated: 12/08/2026, 11:50:49
class Solution {
    public int minLights(int[] lights) {
        int n = lights.length;
        int[] diff = new int[n+1];
        for(int i =0;i<n;i++){
            if(lights[i] > 0){
                int start = Math.max(0,i-lights[i]);
                int end = Math.min(n-1,i+lights[i]);
                diff[start]++;
                diff[end+1]--;
            }
        }
        boolean[] isLit = new boolean[n];
        int activeBulbs = 0;
        for(int i =0;i<n;i++){
            activeBulbs += diff[i];
            if(activeBulbs > 0){
                isLit[i] = true;
            }
        }
        int additionalBulbs =0;
        int i =0;
        while(i < n){
            if(!isLit[i]){
                additionalBulbs++;
                i += 3;
            }
            else{
                i++;
            }
        }
        return additionalBulbs;
    }
}