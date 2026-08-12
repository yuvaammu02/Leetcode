// Last updated: 12/08/2026, 12:18:56
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            char ch = (char)('A' + columnNumber % 26);
            ans.append(ch);
            columnNumber /= 26;
        }
        return ans.reverse().toString();
    }
}