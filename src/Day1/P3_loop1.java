package Day1;
public class P3_loop1 {
    public static void main(String[] args) {
        int m=1;
        for(int i=0; i<5; i++){
            for(int j=0;j<=i; j++){
                System.out.print(m++);
            }
            System.out.println();
        }
    }
}
