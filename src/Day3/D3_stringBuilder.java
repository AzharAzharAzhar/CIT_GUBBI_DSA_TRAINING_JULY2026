package Day3;
class Mythread extends Thread{
    StringBuilder sb;
    Mythread(StringBuilder sb){
        this.sb = sb;
    }
    public void run(){
        for(int i=0; i<100;i++){
            this.sb.append(i);
        }
    }
}

public class D3_stringBuilder{
    public static void main() throws Exception{
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        Mythread mt1 = new Mythread(sb);
        Mythread mt2 = new Mythread(sb);
        mt1.start();
        mt2.start();
        mt1.join();
        mt2.join();
        System.out.println("Legth: "+sb.length());
    }
}
