public class PrimeNumber {
    public static void main(String[] args){
        System.out.println(isPrime(12));
    }
    static boolean isPrime(int i) {
        for(int j=2;j<i;j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }

}

