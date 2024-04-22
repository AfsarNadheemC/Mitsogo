//The program will arrange the String by characters with prime ascii values first in decending order 
// And characters with composite ascii values last in accending order 

import java.util.ArrayList;
import java.util.List;

public class CompositeVsPrime {
    static List <Character> prLi = new ArrayList<>();
    static List <Character> coLi = new ArrayList<>();
    public static void main(String[] args) {
        String a = "qwertyhnmjuikbgfvcdsxza";
        for (int i=0;i<a.length();i++){
            if (ckPrime((int)(a.charAt(i)))){
                addPri(a.charAt(i));
            }
            else addCom(a.charAt(i));
        }
        for (char x : prLi){
            System.out.print(x+" ");
        }
        for (char x : coLi){
            System.out.print(x+" ");
        }
    }

    public static boolean ckPrime (int num){
        // System.out.println((char)num +" "+num); // Uncomment to show the ascii value
        for (int i=2; i<=Math.sqrt(num); i++){
            if (num % i == 0)   return false;
        }
        return true;
    }

    public static void addPri (char c){
        for (int i=0;i<prLi.size();i++){
            if (prLi.get(i)<c){
                prLi.add(i, c);
                return;
            }
        }
        prLi.add(c);
        return;
    }

    public static void addCom (char c){
        for (int i=0;i<coLi.size();i++){
            if (coLi.get(i)>c){
                coLi.add(i, c);
                return;
            }
        }
        coLi.add(c);
        return;
    }
    
}
