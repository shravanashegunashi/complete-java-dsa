package GHub.Basics;

public class SumOfDigits {
    public static void main() {
        System.out.println(sum(12354));
    }
    static int sum(int n){
        int s=0;
        while(n>0){
            int rem=n%10;
            s+=rem;
            n/=10;
        }
        return s;
    }

}
