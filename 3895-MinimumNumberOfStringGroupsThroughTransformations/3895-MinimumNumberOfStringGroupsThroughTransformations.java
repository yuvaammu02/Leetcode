// Last updated: 12/08/2026, 11:51:45
class Solution {
    public int minimumGroups(String[] words) {
       Set<String> un = new HashSet<>();
     for(String word : words){
         StringBuilder ev = new StringBuilder();
         StringBuilder odd = new StringBuilder();
         for(int i =0;i<word.length();i++){
             if(i%2 == 0){
                 ev.append(word.charAt(i));
             }
             else{
                 odd.append(word.charAt(i));
             }
         }
         String ce = getminrot(ev.toString());
         String co = getminrot(odd.toString());
         String gr = ce +"#" + co;
         un.add(gr);
     }
        return un.size();
    }
    private String getminrot(String s){
        if(s.isEmpty()){
            return "";
        }
        int n = s.length();
        String d =s+s;
        int i =0;
        int j =1;
        while(i <n && j <n){
            int k =0;
            while(k < n && d.charAt(i+k) == d.charAt(j+k)){
                k++;
            }
            if(k == n) break;
            if(d.charAt(i+k) > d.charAt(j+k)){
                i += k+1;
                if(i <=j) i = j+1;
            }
            else{
                j += k+1;
                if(j <=i) j = i+1;
            }
        }
        int st = Math.min(i,j);
        return d.substring(st,st+n);
    }
}