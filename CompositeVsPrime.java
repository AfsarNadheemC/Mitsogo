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
        System.out.println((prLi) +""+ (coLi));
    }

    public static boolean ckPrime (int num){
        System.out.println(num);
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
