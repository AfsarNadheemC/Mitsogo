import java.util.ArrayList;
import java.util.List;
public class StringOrder {
    static List <Character> stLi = new ArrayList<>();

    public static void main(String[] args) {
        String  a = "qswzxervdtagbcnhdyujmvnhfgbcikmjduyah";
        for (int i=0;i<a.length();i++){
            addSt(a.charAt(i));
        }
        System.out.println(stLi);
    }

    public static void addSt (char c){
        for (int i=0;i<stLi.size();i++){
            if (stLi.get(i)>c){
                stLi.add(i, c);
                return;
            }
        }
        stLi.add(c);
    }
    
}