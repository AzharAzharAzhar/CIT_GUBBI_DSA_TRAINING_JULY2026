package Day2;
class MyThread extends Thread {
    StringBuilder sb;
    MyThread(StringBuilder sb) {
        this.sb = sb;
    }
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            sb.append("A");
        }
    }
}
public class string_Builder {
    public static void main(String args[]) throws Exception {
        StringBuilder sb = new StringBuilder();
        MyThread t1 = new MyThread(sb);
        MyThread t2 = new MyThread(sb);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Length = " + sb.length());
    }
}