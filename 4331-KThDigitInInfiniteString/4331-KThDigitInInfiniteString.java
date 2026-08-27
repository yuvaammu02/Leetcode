// Last updated: 27/08/2026, 10:17:54
class Solution {
    public int kthDigit(long k) {
        if(k <= 9){
            return (int) k;
        }
        k -=9;
        long d = 2;
        long bc = 1;
        while(true){
            long t = 9 *bc*10*d;
            if(k <= t){
                break;
            }
            k -= t;
            bc *=10;
            d++;
        }
        long db = 10*d;
        long bl = (k-1)/db;
        long b = bc +bl;
        long r = (k-1)%db;
        long n = r /d;
        long di = r%d;
        long a;
        if(b%2 == 0){
            a = 10*b +n;
        }
        else{
            a = 10*b+(9-n);
        }
        String ns = Long.toString(a);
        return ns.charAt((int) di) - '0';
    }
}