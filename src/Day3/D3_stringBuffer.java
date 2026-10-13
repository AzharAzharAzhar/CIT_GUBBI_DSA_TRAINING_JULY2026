package Day3;
class Mythread_buf extends Thread{
    StringBuffer sb;
    Mythread_buf(StringBuffer sb){
        this.sb = sb;
    }
    public void run(){
        for(int i=0; i<100;i++){
            this.sb.append('a');
        }
    }
}
public class D3_stringBuffer{
    public static void main() throws Exception{
        StringBuffer sb = new StringBuffer();
        Mythread_buf mt1 = new Mythread_buf(sb);
        Mythread_buf mt2 = new Mythread_buf(sb);
        mt1.start();
        mt2.start();
        mt1.join();
        mt2.join();
        System.out.println("Legth: "+sb.length());
    }
}

