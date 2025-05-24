public class isPrime {
    public static void main(String[] args) {
        System.out.println(checkPrime(2));
        System.out.println(checkPrime(5));
        System.out.println(checkPrime(-1));
        System.out.println(checkPrime(0));
        //function will be cal
    }
        static boolean checkPrime ( int n){
            if (n < 0 || n == 1) {
                return false;
            } else if (n > 1) {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
    }
