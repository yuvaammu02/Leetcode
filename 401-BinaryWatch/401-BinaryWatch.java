// Last updated: 12/08/2026, 12:10:19
class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> list  = new ArrayList<>();
        for(int i = 0;i<12;i++){
            for(int j = 0;j<60;j++){
                int tot = Integer.bitCount(i) + Integer.bitCount(j);
                if(tot == turnedOn){
                    String time = i + ":" + (j < 10 ? "0" + j : j);
                    list.add(time);
                }
            }
        }
        return list; 
    }
}