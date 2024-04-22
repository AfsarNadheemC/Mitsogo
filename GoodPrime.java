// If the addition of all digits is a prime then the number is called good prime

public class GoodPrime {
    public static void main(String[] args) {
        int limit = 100; // change the value to set new limit
        boolean contain = false;
        for (int i=3;i<limit;i++){
            if (gdPrime(i)!=-1){
                if (!contain){
                    System.out.println("The Good Primes upto "+limit+" are : ");
                    contain = true;
                }
                System.out.print(i+" ");
    
                // Uncomment the following line to show the addition
                // System.out.print(+gdPrime(i));
    
                System.out.println();
            }
        }
        if (!contain){
            System.out.println("There are no prime upto "+limit);
        }
    }
    public static int gdPrime (int num){
        int a = 0;
        while (num > 0){
            a += num%10;
            num /= 10;
        }
        if(a>2 && ckPrime(a))
        return a;
        return -1;
    }
    public static boolean ckPrime (int num){
        for (int i=2;i<=Math.sqrt(num);i++){
            if (num % i == 0)   return false;
        }
        return true;
    }
}