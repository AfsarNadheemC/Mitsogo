import java.util.ArrayList;
import java.util.List;

public class Discount {
    static List <Integer> fiLi = new ArrayList <> ();
    static List <Integer> teLi = new ArrayList <> ();
    static List <Integer> reLi = new ArrayList <> ();
    static int price = 9010890;
    static int red = 3;
    static int len = findLength();

    public static void main(String[] args) {
        while (price >0) {
            teLi.add(0,price%10);
            price /= 10;
        }
        // System.out.println(len);
        // System.out.println(teLi);
        remove(0, 0);
        for (int i : fiLi)
        System.out.print(i);

    }

    public static void remove (int digit,int x){
        if (digit == red+1)   return;
        // System.out.println( "digit " + digit);
        int a = teLi.get(x);
        for (int i=x;i<teLi.size()-(red-digit);i++){
            // System.out.print(teLi.get(i));
            if (teLi.get(i)<a){
                a = teLi.get(i) ;
                x = i+1;
            }
        }
        // System.out.println();
        fiLi.add(a);
        remove(digit+1, x);

    }

    public static int findLength (){
        int len = 0;
        int pp = price;
        while (pp>0){
            len ++;
            pp/=10;
        }
        return len;
    }
    
}
