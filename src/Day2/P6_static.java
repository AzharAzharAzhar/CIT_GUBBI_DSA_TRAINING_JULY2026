package Day2;

class college{
    public String college_name = "CIT, Gubbi";
    final int college_age = 25;
    void prayer(){
        System.out.println("Shanthi Mantra!");
    }
}

public class P6_static {
    public static void main(){
        college s1=new college();
        System.out.println(s1.college_name);
    }
}
