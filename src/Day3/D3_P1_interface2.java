package Day3;
interface musicPlayer{
    void playMusic();
}
interface camera{
    void takePicture();
}
interface gps{
    void tracking();
}
class mobile implements musicPlayer,camera,gps{
    public void playMusic(){
        System.out.println("Music!");
    }
    public void takePicture(){
        System.out.println("Picture!");
    }
    public void tracking(){
        System.out.println("Tracking Location!");
    }
}
public class D3_P1_interface2 {
    public static void main(){
       mobile mb = new mobile();
       mb.playMusic();
       mb.takePicture();
       mb.tracking();
    }
}
