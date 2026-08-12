// Last updated: 12/08/2026, 12:09:46
class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> l1 = new ArrayList<String>();
        for(int i = 1;i <=n;i++){
            if(i%15 == 0){
                l1.add("FizzBuzz");
            }
            else if(i%3 == 0){
                l1.add("Fizz");
            }
            else if(i%5 == 0){
                l1.add("Buzz");
            }
            else{
                l1.add(String.valueOf(i));
            }
        }
        return l1;
    }
}