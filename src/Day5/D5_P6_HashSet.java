package Day5;
import java.util.HashSet;
public class D5_P6_HashSet {
    public static void main(){
        HashSet<String> str = new HashSet<>();
        str.add("Hello");
        str.add("Hello");
        str.add("Hello");
        str.add("Brother");
        for(String s:str){
            System.out.println(s);
        }

        System.out.println(str.contains("Hello"));

    }
}
