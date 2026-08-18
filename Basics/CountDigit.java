public class CountDigit {
    public static void main() {
        System.out.println(digit(1882838,8));
    }
    static int digit(int n,int target){
        int c=0;
        while (n>0){
            int rem=n%10;
            if(rem==target){
                c++;
            }
            n/=10;
        }
        return c;
    }
}


