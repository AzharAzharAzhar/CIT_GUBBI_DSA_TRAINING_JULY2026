package Day3;
public class D3_string1 {
    public static void main(){
        String s1 = "Good Morning!";             // stack
        String s2 = "Bad Morning! ";
        String s3 = new String("Good Morning!");

        System.out.println(s1.concat(", Mr. Naveen"));
        System.out.println(s1);
        System.out.println(s1.charAt(5));
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        s1.length();

    }
}
