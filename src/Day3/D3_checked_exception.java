package Day3;
import java.awt.desktop.SystemEventListener;
import java.io.FileReader;
public class D3_checked_exception {
    public static void main() throws Exception{
        int voting_age = 12;
        try {
            FileReader fr = new FileReader("t1.text");
        }
        catch (Exception e){
            System.out.println("Exception handled!");
        }
        finally {
            System.out.println("Exception Finalized!");
        }
        if(voting_age < 18){
            throw new ArithmeticException("Not eligble to vote");
        }
    }
}
