public class Palindrome {
    public static void main() {
        System.out.println(isPalindrome(1231));
    }
    static boolean isPalindrome(int n){
        int original=n;
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans=ans*10+rem;
            n/=10;
        }
        return ans==original;
    }
}

