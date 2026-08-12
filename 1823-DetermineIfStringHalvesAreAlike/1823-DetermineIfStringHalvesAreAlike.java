// Last updated: 12/08/2026, 11:55:14
class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length()/2;
        int f=0;
        int se = 0;
        for(int i =0;i<mid;i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                f++;
            }
        }
        for(int i =mid;i<s.length();i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                se++;
            }
        }

        return f == se;
    }
}