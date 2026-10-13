package Day2;
class mathOperation{
    int add(int a, int b){
        int sum = a + b;
        return sum;
    }
    float add(float a, float b){
        float sum = a - b;
        return sum;
    }
    int add(int a, int b, int c){
        int sum = a * b + c;
        return sum;
    }
}
public class P4_Poly_oveloading {
    public static void main(){
        mathOperation m1 = new mathOperation();
        System.out.println(m1.add(12,13));
        System.out.println(m1.add(12.6f,13.2556f));
        System.out.println(m1.add(12,13, 16));
    }
}
