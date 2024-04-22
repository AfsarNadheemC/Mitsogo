// Its is Program to find the three digit numbers which first and last digits are adjacent to middle digit 101, 123, 210
// adjacent -> next or previous number in 0123456789
// 101 1 is adjacent to 0 
// 123 1 is adjacent to 2 and 3 is adjacent to 2
// 210 2 is adjacent to 1 and 0 is adjacent to 1

public class StepNumbers {
    public static void main(String[] args) {
        for (int i=100;i<=500;i++){
            if (stepNum(i)){
                System.out.println(i);
            }
        }

    }
    public static boolean stepNum (int num){
        int a = num%10;
        while (num>10){
            // System.out.println("a "+a);
            num/=10;
            int b=num%10;
            // System.out.println("b "+b);
            if (b-a!=1 && a-b!=1)   return false;
            a=b;
        }
        return true;
    }
    
}
