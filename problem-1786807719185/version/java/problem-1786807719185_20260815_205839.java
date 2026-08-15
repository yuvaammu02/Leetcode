// Last updated: 15/08/2026, 20:58:39
1class Solution {
2    public int kthDigit(long k) {
3        if(k <= 9){
4            return (int) k;
5        }
6        k -=9;
7        long d = 2;
8        long bc = 1;
9        while(true){
10            long t = 9 *bc*10*d;
11            if(k <= t){
12                break;
13            }
14            k -= t;
15            bc *=10;
16            d++;
17        }
18        long db = 10*d;
19        long bl = (k-1)/db;
20        long b = bc +bl;
21        long r = (k-1)%db;
22        long n = r /d;
23        long di = r%d;
24        long a;
25        if(b%2 == 0){
26            a = 10*b +n;
27        }
28        else{
29            a = 10*b+(9-n);
30        }
31        String ns = Long.toString(a);
32        return ns.charAt((int) di) - '0';
33    }
34}