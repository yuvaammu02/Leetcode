// Last updated: 12/08/2026, 11:50:27
class Solution {
    private static final int mod = 1_000_000_007;
    public int countValidSequences(int n, int k) {
        if(n < k){
            return 0;
        }
        long total = nCr(n-1,k-1);
        long invalid =0;
        if((n-k)%2 == 0){
            invalid = nCr((n-k)/2+k-1,k-1);
        }
        long ans = (total-invalid)%mod;
        if(ans <0){
            ans += mod;
        }
    return (int) ans;
    }
    private long nCr(int a,int b){
        if(b < 0 || b > a) return 0;
        if(b == 0 || b == a) return 1;
        if(b > a-b){
            b = a-b;
        }
        long num =1;
        long den =1;
        for(int i =0;i<b;i++){
            num = (num *(a-i))%mod;
            den = (den *(i+1))%mod;
        }
        return (num * modinverse(den,mod))%mod;
    }
    private long modinverse(long n,int m){
        return power(n,m-2,m);
    }
    private long power(long base,long exp,int m){
        long res = 1;
        base %= m;
        while(exp >0){
            if(exp%2 == 1){
                res = (res*base)%m;
            }
            base = (base*base)%m;
            exp /=2;
        }
        return res;
    }
}