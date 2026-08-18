package GHub.Basics;

public class ReverseNumber {
    public static void main() {
        System.out.println(rev(12345));
    }
    static int rev(int n){
        int ans=0;
        while(n>0) {
            int rem = n % 10;
            ans = ans * 10 + rem;
            n /= 10;
        }
        return ans;
    }
}
