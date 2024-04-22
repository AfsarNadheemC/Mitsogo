public class StepNumbers {
    public static void main(String[] args) {
        for (int i=100;i<=500;i++){
            if (stepNum(i)){
                System.out.println(i);
            }
        }
        // if (stepNum(321))
        // System.out.println("hi");
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
