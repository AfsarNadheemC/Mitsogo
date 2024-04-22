public class GoodPrime {
    public static void main(String[] args) {
        for (int i=3;i<100;i++){
            if (gdPrime(i)!=-1)
            System.out.println(i+" "+gdPrime(i));
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