package Day1;
public class P5_2Darray {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},
                     {7,8,9}
                    };
        System.out.println("rows: "+a.length+"columns: "+a[0].length );
    for(int i=0; i<a.length;i++){
        for(int j=0; j<a[0].length; j++){
            System.out.print(a[i][j]+" ");
        }
    }
}
}
